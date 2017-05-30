package com.testPreparation.Services;

import com.testPreparation.domain.Role;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface RoleService {
    Role create(Role reputation);
    Role read(String id);
    Role update(Role reputation);
    void delete(String id);
}
