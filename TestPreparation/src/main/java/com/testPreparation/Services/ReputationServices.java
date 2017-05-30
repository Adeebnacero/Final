package com.testPreparation.Services;

import com.testPreparation.domain.Reputation;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public interface ReputationServices {
    Reputation create(Reputation reputation);
    Reputation read(String id);
    Reputation update(Reputation reputation);
    void delete(String id);
}
