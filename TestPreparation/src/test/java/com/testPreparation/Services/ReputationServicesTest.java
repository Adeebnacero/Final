package com.testPreparation.Services;

import com.testPreparation.Factories.ReputationFactory;
import com.testPreparation.Services.Impl.ReputationServiceImpl;
import com.testPreparation.domain.Reputation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class ReputationServicesTest {
    String id;
    Date date;
    int value;
    ReputationServices service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new ReputationServiceImpl();
        id = "1";
        value = 45;
        date = new Date();
    }

    @Test
    public void Create() throws Exception {
        Reputation reputation = ReputationFactory.getReputation(id,date,value);
        service.create(reputation);
        assertEquals("1",reputation.getId());
    }

    @Test(dependsOnMethods = {"Create"})
    public void Read() throws Exception {
        Reputation reputation = service.read("1");
        assertEquals(45, reputation.getValue());
    }

    @Test(dependsOnMethods = {"Create", "Read"})
    public void Update() throws Exception {
        Reputation reputation = service.read("1");
        Reputation updateReputation = new Reputation.Builder()
                .id("1")
                .date(date)
                .value(76)
                .build();
        service.update(updateReputation);
        reputation = service.read("1");
        assertEquals(76, reputation.getValue());

    }

    @Test(dependsOnMethods = {"Create","Update"})
    public void Delete() throws Exception {
        service.delete("1");
        Reputation reputation = service.read("1");
        assertNull(reputation);
    }

}