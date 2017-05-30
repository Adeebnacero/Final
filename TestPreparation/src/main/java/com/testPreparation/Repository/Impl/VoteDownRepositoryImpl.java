package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.VoteDownRepository;
import com.testPreparation.domain.VoteDown;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteDownRepositoryImpl implements VoteDownRepository {
    public static VoteDownRepositoryImpl repository = null;

    private Map<String, VoteDown> voteDownTable;

    private VoteDownRepositoryImpl()
    {
        voteDownTable = new HashMap<String, VoteDown>();

    }
    public static VoteDownRepositoryImpl getInstance(){
        if(repository == null)
            repository = new VoteDownRepositoryImpl();
        return repository;
    }



    public VoteDown create(VoteDown voteDown) {
        voteDownTable.put(voteDown.getId(), voteDown);
        VoteDown saveVoteDown = voteDownTable.get(voteDown.getId());
        return saveVoteDown;
    }

    public VoteDown read(String id) {
        VoteDown voteDown = voteDownTable.get(id);
        return voteDown;
    }

    public VoteDown update(VoteDown voteDown) {
        voteDownTable.put(voteDown.getId(), voteDown);
        VoteDown updateVoteDown = voteDownTable.get(voteDown.getId());
        return updateVoteDown;
    }

    public void delete(String id) {
        voteDownTable.remove(id);
    }
}
