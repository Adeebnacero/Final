package com.testPreparation.Services;

import com.testPreparation.domain.VoteUp;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface VoteUpService {
    VoteUp create(VoteUp voteUp);
    VoteUp read(String id);
    VoteUp update(VoteUp voteUp);
    void delete(String id);
}
