package com.testPreparation.Factories;

import com.testPreparation.domain.VoteUp;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class VoteUpFactory {
    public static VoteUp getVoteUp(Map<String, String> values, int value)
    {
        VoteUp voteUp = new VoteUp.Builder()
                .id(values.get("id"))
                .counter(value)
                .build();
        return voteUp;
    }

}
