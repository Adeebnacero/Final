package com.testPreparation.Factories;

import com.testPreparation.domain.Reputation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class ReputationFactoryTest {

    Date date = new Date();
    Reputation reputation;
    @BeforeMethod
    public void setUp() throws Exception {
        reputation = ReputationFactory.getReputation("1", date, 45);

    }

    @Test
    public void testGetReputation() throws Exception {
       assertEquals(true, reputation.equals(reputation));
    }
    @Test
    public void testValue() throws Exception {
        assertEquals(45, reputation.getValue());
    }

}