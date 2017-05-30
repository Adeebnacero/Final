package com.testPreparation.Repository;

import com.testPreparation.Factories.ReputationFactory;
import com.testPreparation.Factories.UserFactory;
import com.testPreparation.Repository.Impl.UserRepositoryImpl;
import com.testPreparation.domain.Reputation;
import com.testPreparation.domain.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class UserRepositoryTest {

    Date date = new Date();
    Reputation reputation;
    UserRepository repository;
    Map<String, String> userValues;


    @BeforeMethod
    public void setUp() throws Exception {
        repository = UserRepositoryImpl.getInstance();
        reputation = ReputationFactory.getReputation("1", date, 66);
        userValues = new HashMap<String, String>();
        userValues.put("id", "1");
        userValues.put("email", "thabo.moopa@gmail.com");
        userValues.put("screenName", "thabo");
        userValues.put("status", "registered");
    }

    @Test
    public void create() throws Exception {
        User abuseReport = UserFactory.getUser(userValues, reputation);
        repository.create(abuseReport);
        assertEquals("1",abuseReport.getId());
    }

    @Test(dependsOnMethods = {"create"})
    public void read() throws Exception {
        User user = repository.read("1");
        assertEquals("registered", user.getStatus());
    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        User user = repository.read("1");
        User updateUser = new User.Builder()
                .id(userValues.get("id"))
                .email(userValues.get("email"))
                .password(userValues.get("password"))
                .screenName(userValues.get("screenName"))
                .status("Guest")
                .build();

        repository.update(updateUser);
        user = repository.read("1");
        assertEquals("Guest", user.getStatus());
    }

    @Test(dependsOnMethods = {"create","update"})
    public void delete() throws Exception {
        repository.delete("1");
        User user = repository.read("1");
        assertNull(user);
    }

}