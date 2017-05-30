package com.testPreparation.Repository;

import com.testPreparation.Factories.VoteUpFactory;
import com.testPreparation.Repository.Impl.VoteUpRepositoryImpl;
import com.testPreparation.domain.VoteUp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class VoteUpRepositoryTest {

    Map<String, String> values;

    VoteUpRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = VoteUpRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("id", "1");
    }

    @Test
    public void create() throws Exception {
        VoteUp voteUp = VoteUpFactory.getVoteUp(values, 65);
        repository.create(voteUp);
        assertEquals(65, voteUp.getCounter());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        VoteUp readVoteUp = repository.read("1");
        assertEquals(65, readVoteUp.getCounter());
    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        VoteUp voteUp = repository.read("1");
        VoteUp newVoteUp = new VoteUp.Builder()
                .counter(75)
                .id(values.get("id"))
                .build();
        repository.update(newVoteUp);
        VoteUp updateVoteUp = repository.read("1");
        assertEquals(75, updateVoteUp.getCounter());
    }

    @Test(dependsOnMethods = {"create","update"})
    public void delete() throws Exception {
        repository.delete("1");
        VoteUp voteUp = repository.read("1");
        assertNull(voteUp);

    }

}