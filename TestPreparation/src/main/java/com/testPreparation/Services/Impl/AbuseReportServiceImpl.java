package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.AbuseReportRepositoryImpl;
import com.testPreparation.Services.AbuseReportService;
import com.testPreparation.domain.AbuseReport;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class AbuseReportServiceImpl  implements AbuseReportService{
    public static  AbuseReportServiceImpl service = null;

    AbuseReportRepositoryImpl services =  AbuseReportRepositoryImpl.getInstance();

    public static  AbuseReportServiceImpl getInstance()
    {
        if(service == null)
            service = new  AbuseReportServiceImpl();
        return service;
    }
    public AbuseReport create(AbuseReport abuseReport) {
        return services.create(abuseReport);
    }

    public AbuseReport read(String id) {
        return services.read(id);
    }

    public AbuseReport update(AbuseReport abuseReport) {
        return services.update(abuseReport);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
