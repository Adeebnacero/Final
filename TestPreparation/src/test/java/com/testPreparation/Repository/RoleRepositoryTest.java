package com.testPreparation.Repository;

import com.testPreparation.Factories.RoleFactory;
import com.testPreparation.Repository.Impl.RoleRepositoryImpl;
import com.testPreparation.domain.Role;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class RoleRepositoryTest {
    Map<String, String> values;
    RoleRepository repository;


    @BeforeMethod
    public void setUp() throws Exception {
        repository = RoleRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name", "Manager");
        values.put("description","Supervisor");
    }

    @Test
    public void create() throws Exception {
        Role role = RoleFactory.getRole(values);
        repository.create(role);
        assertEquals("1",role.getId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Role role = repository.read("1");
        assertEquals("Supervisor", role.getDescription());

    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        Role role = repository.read("1");
        Role updateRole = new Role.Builder()
                .id(values.get("id"))
                .name(values.get("name"))
                .description("Employee")
                .build();
        repository.update(updateRole);
        role = repository.read("1");
        assertEquals("Employee", role.getDescription());

    }

    @Test(dependsOnMethods = {"create","update"})
    public void delete() throws Exception {
        repository.delete("1");
        Role role = repository.read("1");
        assertNull(role);

    }

}