package com.testPreparation.Factories;

import com.testPreparation.domain.AbuseReport;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class AbuseReportFactory {
    public static AbuseReport getAbuseReport(Map<String, String> values)
    {
        AbuseReport abuseReport = new AbuseReport.Builder()
                .id(values.get("id"))
                .description(values.get("description"))
                .build();
        return abuseReport;
    }
}
