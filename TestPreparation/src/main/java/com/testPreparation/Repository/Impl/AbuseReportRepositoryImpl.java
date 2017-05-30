package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.AbuseReportRepository;
import com.testPreparation.domain.AbuseReport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class AbuseReportRepositoryImpl implements AbuseReportRepository
{
    public static AbuseReportRepositoryImpl repository = null;

    private Map<String, AbuseReport> abuseReportTable;

    private AbuseReportRepositoryImpl()
    {

        abuseReportTable = new HashMap<String, AbuseReport>();
    }

    public static AbuseReportRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new AbuseReportRepositoryImpl();
        return repository;
    }
    public AbuseReport create(AbuseReport abuseReport) {
        abuseReportTable.put(abuseReport.getId(), abuseReport);
        AbuseReport saveAbuseReport = abuseReportTable.get(abuseReport.getId());
        return saveAbuseReport;
    }

    public AbuseReport read(String id) {
        AbuseReport abuseReport = abuseReportTable.get(id);
        return abuseReport;
    }

    public AbuseReport update(AbuseReport abuseReport) {
        abuseReportTable.put(abuseReport.getId(), abuseReport);
        AbuseReport updateAbuseReport = abuseReportTable.get(abuseReport.getId());
        return updateAbuseReport;
    }

    public void delete(String id) {
        abuseReportTable.remove(id);
    }
}
