package com.testPreparation.Factories;

import com.testPreparation.domain.Reputation;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/29.
 */
public class ReputationFactory {
    public static Reputation getReputation(String id, Date date, int value) {
        Reputation reputation = new Reputation.Builder()
                .id(id)
                .date(date)
                .value(value)
                .build();
        return reputation;
    }


}
