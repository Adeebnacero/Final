package com.testPreparation.Services;

import com.testPreparation.domain.VoteDown;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface VoteDownService {
    VoteDown create(VoteDown voteDown);
    VoteDown read(String id);
    VoteDown update(VoteDown votedown);
    void delete(String id);
}
