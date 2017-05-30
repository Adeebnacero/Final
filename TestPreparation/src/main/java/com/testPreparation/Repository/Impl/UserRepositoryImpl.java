package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.UserRepository;
import com.testPreparation.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class UserRepositoryImpl implements UserRepository {

    public static UserRepositoryImpl repository = null;

    private Map<String, User> userTable;

    private UserRepositoryImpl()
    {

        userTable = new HashMap<String, User>();
    }

    public static UserRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new UserRepositoryImpl();
        return repository;
    }
    public User create(User user) {
        userTable.put(user.getId(), user);
        User saveUser = userTable.get(user.getId());
        return saveUser;
    }

    public User read(String id) {
        User abuseReport = userTable.get(id);
        return abuseReport;
    }

    public User update(User user) {
        userTable.put(user.getId(), user);
        User updateUser = userTable.get(user.getId());
        return updateUser;
    }

    public void delete(String id) {
        userTable.remove(id);
    }
}
