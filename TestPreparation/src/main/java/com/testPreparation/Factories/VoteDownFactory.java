package com.testPreparation.Factories;

import com.testPreparation.domain.VoteDown;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class VoteDownFactory {
    public static VoteDown getVoteDown(Map<String, String> values, int value)
    {
        VoteDown voteUp = new VoteDown.Builder()
                .id(values.get("id"))
                .counter(value)
                .build();
        return voteUp;
    }
}
