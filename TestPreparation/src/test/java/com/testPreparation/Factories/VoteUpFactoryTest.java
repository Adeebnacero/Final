package com.testPreparation.Factories;

import com.testPreparation.domain.VoteUp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class VoteUpFactoryTest {
    VoteUp voteUp;
    Map<String, String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id", "1");
        voteUp = VoteUpFactory.getVoteUp(values, 65);

    }

    @Test
    public void testGetVoteUp() throws Exception {
        assertEquals(true, voteUp.equals(voteUp));
    }

    @Test
    public void testVoteUpId() throws Exception {
        assertEquals("1", voteUp.getId());
    }
}