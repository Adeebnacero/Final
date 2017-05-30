package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.ReputationRepositoryImpl;
import com.testPreparation.Repository.ReputationRepository;
import com.testPreparation.Services.ReputationServices;
import com.testPreparation.domain.Reputation;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class ReputationServiceImpl implements ReputationServices {

    public static ReputationServiceImpl service = null;

    ReputationRepositoryImpl services = ReputationRepositoryImpl.getInstance();

    public static ReputationServiceImpl getInstance()
    {
        if(service == null)
            service = new ReputationServiceImpl();
        return service;
    }

    public Reputation create(Reputation reputation) {
        return services.create(reputation);
    }

    public Reputation read(String id) {
        return services.read(id);
    }

    public Reputation update(Reputation reputation) {
        return services.update(reputation);
    }

    public void delete(String id) {
        services.delete(id);

    }
}
