package com.testPreparation.Factories;

import com.testPreparation.domain.Role;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class RoleFactoryTest {

    Map<String, String> values;
    Role role;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name", "Manager");
        values.put("description","Supervisor");
    }

    @Test
    public void testGetRole() throws Exception {
        role = RoleFactory.getRole(values);
        assertEquals(true, role.equals(role));
    }

    @Test
    public void testDescription() throws Exception {
        role = RoleFactory.getRole(values);
        assertEquals("Supervisor", role.getDescription());
    }
}