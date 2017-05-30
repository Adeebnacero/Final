package com.testPreparation.Repository;

import com.testPreparation.domain.VoteUp;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public interface VoteUpRepository {
    VoteUp create(VoteUp voteUp);
    VoteUp read(String id);
    VoteUp update(VoteUp voteUp);
    void delete(String id);
}
