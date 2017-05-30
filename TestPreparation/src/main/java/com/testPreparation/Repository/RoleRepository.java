package com.testPreparation.Repository;

import com.testPreparation.domain.Role;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface RoleRepository {
    Role create(Role role);
    Role read(String id);
    Role update(Role role);
    void delete(String id);
}
