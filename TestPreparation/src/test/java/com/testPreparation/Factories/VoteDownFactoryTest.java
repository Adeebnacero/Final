package com.testPreparation.Factories;

import com.testPreparation.domain.VoteDown;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteDownFactoryTest {

    VoteDown voteDown;
    Map<String, String> values;
    @BeforeMethod
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("id", "1");
        voteDown = VoteDownFactory.getVoteDown(values, 65);

    }

    @Test
    public void testGetVoteDown() throws Exception {
        assertEquals(true, voteDown.equals(voteDown));
    }
    @Test
    public void testVoteDownId() throws Exception {
        assertEquals("1", voteDown.getId());
    }

}