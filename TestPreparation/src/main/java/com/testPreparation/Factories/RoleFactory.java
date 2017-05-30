package com.testPreparation.Factories;

import com.testPreparation.domain.Role;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class RoleFactory {
    public static Role getRole(Map<String, String> values)
    {
        Role role = new Role.Builder()
                .id(values.get("id"))
                .name(values.get("name"))
                .description(values.get("description"))
                .build();
                return role;
    }
}
