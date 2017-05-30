package com.testPreparation.Repository;

import com.testPreparation.domain.Reputation;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public interface ReputationRepository {
    Reputation create(Reputation reputation);
    Reputation read(String id);
    Reputation update(Reputation reputation);
    void delete(String id);

}
