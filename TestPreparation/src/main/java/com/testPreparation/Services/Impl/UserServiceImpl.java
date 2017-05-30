package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.UserRepositoryImpl;
import com.testPreparation.Services.UserService;
import com.testPreparation.domain.User;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class UserServiceImpl implements UserService {
    public static  UserServiceImpl service = null;

    UserRepositoryImpl services =  UserRepositoryImpl.getInstance();

    public static  UserServiceImpl getInstance()
    {
        if(service == null)
            service = new  UserServiceImpl();
        return service;
    }
    public User create(User user) {
        return services.create(user);
    }

    public User read(String id) {
        return services.read(id);
    }

    public User update(User user) {
        return services.update(user);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
