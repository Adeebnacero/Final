package com.testPreparation.Repository;

import com.testPreparation.Factories.VoteDownFactory;
import com.testPreparation.Repository.Impl.VoteDownRepositoryImpl;
import com.testPreparation.domain.VoteDown;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteDownRepositoryTest {
    Map<String, String> values;

    VoteDownRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = VoteDownRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("id", "1");
    }

    @Test
    public void create() throws Exception {
        VoteDown voteDown = VoteDownFactory.getVoteDown(values, 65);
        repository.create(voteDown);
        assertEquals(65, voteDown.getCounter());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        VoteDown readVoteDown = repository.read("1");
        assertEquals(65, readVoteDown.getCounter());
    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        VoteDown voteDown = repository.read("1");
        VoteDown newVoteDown = new VoteDown.Builder()
                .counter(75)
                .id(values.get("id"))
                .build();
        repository.update(newVoteDown);
        VoteDown updateVoteDown = repository.read("1");
        assertEquals(75, updateVoteDown.getCounter());
    }

    @Test(dependsOnMethods = {"create","update"})
    public void delete() throws Exception {
        repository.delete("1");
        VoteDown voteDown = repository.read("1");
        assertNull(voteDown);
    }

}