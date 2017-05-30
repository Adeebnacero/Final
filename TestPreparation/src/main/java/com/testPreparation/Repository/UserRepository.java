package com.testPreparation.Repository;

import com.testPreparation.domain.User;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface UserRepository {
    User create(User user);
    User read(String id);
    User update(User user);
    void delete(String id);
}
