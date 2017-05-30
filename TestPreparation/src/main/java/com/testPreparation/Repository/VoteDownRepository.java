package com.testPreparation.Repository;

import com.testPreparation.domain.VoteDown;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface VoteDownRepository {
    VoteDown create(VoteDown voteUp);
    VoteDown read(String id);
    VoteDown update(VoteDown voteUp);
    void delete(String id);
}
