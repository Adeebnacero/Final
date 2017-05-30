package com.testPreparation.Factories;

import com.testPreparation.domain.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class ResponseFactory {
    public static Response getResponse(Map<String, String> values, User user, ContentFilter contentFilter, Date date, VoteDown voteDown, VoteUp voteUp, List<AbuseReport> report)
    {
        Response response = new Response.Builder()
                .id(values.get("id"))
                .comment(values.get("comment"))
                .date(date)
                .ipAddress(values.get("idAddress"))
                .contentFilter(contentFilter)
                .user(user)
                .voteDown(voteDown)
                .voteUp(voteUp)
                .abuseReport(report)
                .build();
        return response;

    }
}
