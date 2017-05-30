package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.SiteManagerRepositoryImpl;
import com.testPreparation.Services.SiteManagerService;
import com.testPreparation.domain.SiteManager;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteManagerServiceImpl implements SiteManagerService {
    public static  SiteManagerServiceImpl service = null;

    SiteManagerRepositoryImpl services =  SiteManagerRepositoryImpl.getInstance();

    public static  SiteManagerServiceImpl getInstance()
    {
        if(service == null)
            service = new  SiteManagerServiceImpl();
        return service;
    }
    public SiteManager create(SiteManager siteManger) {
        return services.create(siteManger);
    }

    public SiteManager read(String id) {
        return services.read(id);
    }

    public SiteManager update(SiteManager siteManger) {
        return services.update(siteManger);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
