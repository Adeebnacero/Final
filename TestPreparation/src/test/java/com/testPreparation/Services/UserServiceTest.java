package com.testPreparation.Services;

import com.testPreparation.Factories.AbuseReportFactory;
import com.testPreparation.Factories.ReputationFactory;
import com.testPreparation.Factories.UserFactory;
import com.testPreparation.Repository.Impl.UserRepositoryImpl;
import com.testPreparation.Repository.UserRepository;
import com.testPreparation.Services.Impl.UserServiceImpl;
import com.testPreparation.domain.AbuseReport;
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
public class UserServiceTest {
    Date date = new Date();
    Reputation reputation;
    UserService service;
    Map<String, String> userValues;


    @BeforeMethod
    public void setUp() throws Exception {
        service = new UserServiceImpl();
        reputation = ReputationFactory.getReputation("1", date, 66);
        userValues = new HashMap<String, String>();
        userValues.put("id", "1");
        userValues.put("email", "thabo.moopa@gmail.com");
        userValues.put("screenName", "thabo");
        userValues.put("status", "registered");
    }

    @Test
    public void create() throws Exception {
        User user = UserFactory.getUser(userValues, reputation);
        service.create(user);
        assertEquals("1",user.getId());

    }

    @Test
    public void testRead() throws Exception {
        User user = service.read("1");
       // assertEquals("Language", user.ge);

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

}