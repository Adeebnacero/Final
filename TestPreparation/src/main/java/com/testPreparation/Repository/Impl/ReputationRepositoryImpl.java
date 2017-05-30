package com.testPreparation.Repository.Impl;

import com.testPreparation.Factories.ReputationFactory;
import com.testPreparation.domain.Reputation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class ReputationRepositoryImpl implements com.testPreparation.Repository.ReputationRepository {

    public static ReputationRepositoryImpl repository = null;

    private Map<String, Reputation> reputationTable;

    private ReputationRepositoryImpl()
    {

        reputationTable = new HashMap<String, Reputation>();
    }

    public static ReputationRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new ReputationRepositoryImpl();
        return repository;
    }

    public Reputation create(Reputation reputation) {
        reputationTable.put(reputation.getId(), reputation);
        Reputation saveReputation = reputationTable.get(reputation.getId());
        return saveReputation;

    }

    public Reputation read(String id) {
        Reputation reputation = reputationTable.get(id);
        return reputation;
    }

    public Reputation update(Reputation reputation) {
        reputationTable.put(reputation.getId(), reputation);
        Reputation updateReputation = reputationTable.get(reputation.getId());
        return updateReputation;
    }

    public void delete(String id) {
        reputationTable.remove(id);

    }
}
