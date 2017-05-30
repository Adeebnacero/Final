package com.testPreparation.Services;

import com.testPreparation.domain.AbuseReport;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface AbuseReportService {
    AbuseReport create(AbuseReport reputation);
    AbuseReport read(String id);
    AbuseReport update(AbuseReport reputation);
    void delete(String id);
}
