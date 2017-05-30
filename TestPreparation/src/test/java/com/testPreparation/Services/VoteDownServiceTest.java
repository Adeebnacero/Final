package com.testPreparation.Services;

import com.testPreparation.Factories.VoteDownFactory;
import com.testPreparation.Services.Impl.VoteDownServiceImpl;
import com.testPreparation.domain.VoteDown;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteDownServiceTest {
    Map<String, String> values;
    VoteDownService service;
    int counter;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new VoteDownServiceImpl();
        values = new HashMap<String, String>();
        values.put("id", "1");
        counter = 65;
    }

    @Test
    public void create() throws Exception {
        VoteDown voteDown = VoteDownFactory.getVoteDown(values, counter);
        service.create(voteDown);
        assertEquals(65, voteDown.getCounter());
    }

    @Test(dependsOnMethods = {"create"})
    public void read() throws Exception {
        VoteDown readVoteDown = service.read("1");
        assertEquals(65, readVoteDown.getCounter());
    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        VoteDown voteDown = service.read("1");
        VoteDown newVoteDown = new VoteDown.Builder()
                .counter(78)
                .id(values.get("id"))
                .build();
        service.update(newVoteDown);
        VoteDown updateVoteDown = service.read("1");
        assertEquals(78, updateVoteDown.getCounter());
    }

    @Test(dependsOnMethods = {"update","create"})
    public void delete() throws Exception {
        service.delete("1");
        VoteDown voteDown = service.read("1");
        assertNull(voteDown);
    }

}