package com.testPreparation.Factories;

import com.testPreparation.domain.Reputation;
import com.testPreparation.domain.User;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class UserFactory {
    public static User getUser(Map<String, String> values, Reputation reputation)
    {
        User user = new User.Builder()
                .id(values.get("id"))
                .email(values.get("email"))
                .password(values.get("password"))
                .screenName(values.get("screenName"))
                .status(values.get("status"))
                .build();
        return user;
    }
}
