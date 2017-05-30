package com.testPreparation.Services;

import com.testPreparation.Factories.RoleFactory;
import com.testPreparation.Services.Impl.RoleServiceImpl;
import com.testPreparation.domain.Role;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class RoleServiceTest {
    Map<String, String> values;
    RoleService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new RoleServiceImpl();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name", "Manager");
        values.put("description", "Supervisor");
    }

    @Test
    public void create() throws Exception {
        Role role = RoleFactory.getRole(values);
        service.create(role);
        assertEquals("1",role.getId());
    }

    @Test(dependsOnMethods = {"create"})
    public void read() throws Exception {
        Role role = service.read("1");
        assertEquals("Supervisor", role.getDescription());

    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        Role role = service.read("1");
        Role updateRole = new Role.Builder()
                .id(values.get("id"))
                .name(values.get("name"))
                .description("Cleaner")
                .build();
        service.update(updateRole);
        role = service.read("1");
        assertEquals("Cleaner", role.getDescription());

    }

    @Test(dependsOnMethods = {"update","create"})
    public void delete() throws Exception {
        service.delete("1");
        Role role = service.read("1");
        assertNull(role);
    }

}