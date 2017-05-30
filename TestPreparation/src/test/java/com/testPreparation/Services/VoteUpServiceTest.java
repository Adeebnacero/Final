package com.testPreparation.Services;

import com.testPreparation.Factories.VoteUpFactory;
import com.testPreparation.Services.Impl.VoteUpServiceImpl;
import com.testPreparation.domain.VoteUp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteUpServiceTest {
    Map<String, String> values;
    VoteUpService service;
    int counter;
    @BeforeMethod
    public void setUp() throws Exception {
        service = new VoteUpServiceImpl();
        values = new HashMap<String, String>();
        values.put("id", "1");
        counter = 65;
    }

    @Test
    public void create() throws Exception {
        VoteUp voteUp = VoteUpFactory.getVoteUp(values, counter);
        service.create(voteUp);
        assertEquals(65, voteUp.getCounter());
    }

    @Test(dependsOnMethods = {"create"})
    public void testRead() throws Exception {
        VoteUp readVoteUp = service.read("1");
        assertEquals(65, readVoteUp.getCounter());
    }

    @Test(dependsOnMethods = {"testRead","create"})
    public void testUpdate() throws Exception {
        VoteUp voteUp = service.read("1");
        VoteUp newVoteUp = new VoteUp.Builder()
                .counter(78)
                .id(values.get("id"))
                .build();
       service.update(newVoteUp);
        VoteUp updateVoteUp = service.read("1");
        assertEquals(78, updateVoteUp.getCounter());
    }

    @Test(dependsOnMethods = {"testUpdate","create"})
    public void testDelete() throws Exception {
        service.delete("1");
        VoteUp voteUp = service.read("1");
        assertNull(voteUp);
    }

}