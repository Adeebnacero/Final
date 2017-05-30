package com.testPreparation.Factories;

import com.testPreparation.domain.Site;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteFactory {
    public static Site getSite(Map<String, String> values)
    {
        Site site = new Site.Builder()
                .id(values.get("id"))
                .name(values.get("name"))
                .url(values.get("url"))
                .urlStory(values.get("urlStory"))
                .build();
        return site;
    }
}
