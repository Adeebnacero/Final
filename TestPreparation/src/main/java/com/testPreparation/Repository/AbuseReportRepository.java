package com.testPreparation.Repository;

import com.testPreparation.domain.AbuseReport;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface AbuseReportRepository {
    AbuseReport create(AbuseReport abuseReport);
    AbuseReport read(String id);
    AbuseReport update(AbuseReport abuseReport);
    void delete(String id);
}
