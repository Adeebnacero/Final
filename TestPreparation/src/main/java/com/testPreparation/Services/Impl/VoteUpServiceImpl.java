package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.VoteUpRepositoryImpl;
import com.testPreparation.Services.VoteUpService;
import com.testPreparation.domain.VoteUp;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteUpServiceImpl implements VoteUpService {

    public static VoteUpServiceImpl service = null;

    VoteUpRepositoryImpl services = VoteUpRepositoryImpl.getInstance();

    public static VoteUpServiceImpl getInstance()
    {
        if(service == null)
            service = new VoteUpServiceImpl();
        return service;
    }


    public VoteUp create(VoteUp voteUp) {
        return services.create(voteUp);
    }

    public VoteUp read(String id) {
        return services.read(id);
    }

    public VoteUp update(VoteUp voteUp) {
        return services.update(voteUp);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
