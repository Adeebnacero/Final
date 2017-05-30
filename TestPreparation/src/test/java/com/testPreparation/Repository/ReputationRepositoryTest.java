package com.testPreparation.Repository;

import com.testPreparation.Factories.ReputationFactory;
import com.testPreparation.Repository.Impl.ReputationRepositoryImpl;
import com.testPreparation.domain.Reputation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class ReputationRepositoryTest {
    String id;
    Date date = new Date();
    int value;
    ReputationRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = ReputationRepositoryImpl.getInstance();
        id = "1";
        value = 45;
    }

    @Test
    public void Create() throws Exception {
        Reputation reputation = ReputationFactory.getReputation(id,date,value);
        repository.create(reputation);
        assertEquals("1",reputation.getId());
    }

    @Test(dependsOnMethods="Create")
    public void Read() throws Exception {
        Reputation reputation = repository.read("1");
        assertEquals(date, reputation.getDate());
    }

    @Test(dependsOnMethods={"Create"})
    public void Update() throws Exception {
        Reputation reputation = repository.read("1");
        Reputation updateReputation = new Reputation.Builder()
                .id("1")
                .date(date)
                .value(75)
                .build();
        repository.update(updateReputation);
        reputation = repository.read("1");
        assertEquals(75, reputation.getValue());

    }

    @Test(dependsOnMethods = {"Create"})
    public void testDelete() throws Exception {
        repository.delete("1");
        Reputation reputation = repository.read("1");
        assertNull(reputation);

    }

}