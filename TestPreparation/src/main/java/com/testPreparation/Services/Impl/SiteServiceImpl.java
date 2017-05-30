package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.SiteRepositoryImpl;
import com.testPreparation.Services.SiteService;
import com.testPreparation.domain.Site;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteServiceImpl implements SiteService {
    public static  SiteServiceImpl service = null;

    SiteRepositoryImpl services =  SiteRepositoryImpl.getInstance();

    public static  SiteServiceImpl getInstance()
    {
        if(service == null)
            service = new  SiteServiceImpl();
        return service;
    }

    public Site create(Site site) {
        return services.create(site);
    }

    public Site read(String id) {
        return services.read(id);
    }

    public Site update(Site site) {
        return services.update(site);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
