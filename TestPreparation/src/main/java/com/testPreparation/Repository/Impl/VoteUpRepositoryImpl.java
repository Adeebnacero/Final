package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.VoteUpRepository;
import com.testPreparation.domain.VoteUp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class VoteUpRepositoryImpl implements VoteUpRepository {

    public static VoteUpRepositoryImpl repository = null;

    private Map<String, VoteUp> voteUpTable;

    private VoteUpRepositoryImpl()
    {
        voteUpTable = new HashMap<String, VoteUp>();

    }
    public static VoteUpRepositoryImpl getInstance(){
        if(repository == null)
            repository = new VoteUpRepositoryImpl();
        return repository;
    }


    public VoteUp create(VoteUp voteUp) {
        voteUpTable.put(voteUp.getId(), voteUp);
        VoteUp saveVoteUp = voteUpTable.get(voteUp.getId());
        return saveVoteUp;
    }

    public VoteUp read(String id) {

        VoteUp voteUp = voteUpTable.get(id);
        return voteUp;
    }

    public VoteUp update(VoteUp voteUp) {

        voteUpTable.put(voteUp.getId(), voteUp);
        VoteUp updateVoteUp = voteUpTable.get(voteUp.getId());
        return updateVoteUp;
    }

    public void delete(String id) {
        voteUpTable.remove(id);
    }
}
