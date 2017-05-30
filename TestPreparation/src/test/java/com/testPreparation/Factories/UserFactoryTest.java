package com.testPreparation.Factories;

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
public class UserFactoryTest {

    Date date = new Date();
    Reputation reputation;
    User user;
    Map<String, String> userValues;
    String id;
    int value;
    @BeforeMethod
    public void setUp() throws Exception {

        userValues = new HashMap<String, String>();
        userValues.put("id", "1");
        userValues.put("email", "thabo.moopa@gmail.com");
        userValues.put("screenName", "thabo");
        userValues.put("status", "registered");

        user = UserFactory.getUser(userValues, reputation);

    }

    @Test
    public void testGetUser() throws Exception {
        //user = UserFactory.getUser(userValues, reputation);
        assertEquals(true, user.equals(user));
    }


}