package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.RoleRepositoryImpl;
import com.testPreparation.Services.RoleService;
import com.testPreparation.domain.Role;

import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class RoleServiceImpl implements RoleService {
    public static  RoleServiceImpl service = null;

    RoleRepositoryImpl services =  RoleRepositoryImpl.getInstance();

    public static  RoleServiceImpl getInstance()
    {
        if(service == null)
            service = new  RoleServiceImpl();
        return service;
    }
    public Role create(Role role) {
        return services.create(role);
    }

    public Role read(String id) {
        return services.read(id);
    }

    public Role update(Role role) {
        return services.update(role);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
