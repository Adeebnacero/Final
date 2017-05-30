package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.RoleRepository;
import com.testPreparation.domain.Role;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class RoleRepositoryImpl implements RoleRepository {
    public static RoleRepositoryImpl repository = null;

    private Map<String, Role> roleTable;

    private RoleRepositoryImpl()
    {

        roleTable = new HashMap<String, Role>();
    }

    public static RoleRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new RoleRepositoryImpl();
        return repository;
    }

    public Role create(Role role) {
        roleTable.put(role.getId(), role);
        Role saveRole = roleTable.get(role.getId());
        return saveRole;
    }

    public Role read(String id) {
        Role role = roleTable.get(id);
        return role;
    }

    public Role update(Role role) {
        roleTable.put(role.getId(), role);
        Role updateRole = roleTable.get(role.getId());
        return updateRole;
    }


    public void delete(String id) {
        roleTable.remove(id);
    }
}
