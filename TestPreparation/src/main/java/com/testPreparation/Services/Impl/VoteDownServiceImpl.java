package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.VoteDownRepositoryImpl;
import com.testPreparation.Services.VoteDownService;
import com.testPreparation.domain.VoteDown;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteDownServiceImpl implements VoteDownService {
    public static VoteDownServiceImpl service = null;

    VoteDownRepositoryImpl services = VoteDownRepositoryImpl.getInstance();

    public static VoteDownServiceImpl getInstance()
    {
        if(service == null)
            service = new VoteDownServiceImpl();
        return service;
    }


    public VoteDown create(VoteDown voteDown) {
        return services.create(voteDown);
    }

    public VoteDown read(String id) {
        return services.read(id);
    }

    public VoteDown update(VoteDown voteDown) {
        return services.update(voteDown);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
