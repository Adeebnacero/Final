package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.SiteManagerRepository;
import com.testPreparation.domain.SiteManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteManagerRepositoryImpl implements SiteManagerRepository {
    public static SiteManagerRepositoryImpl repository = null;

    private Map<String, SiteManager> siteManagerTable;

    private SiteManagerRepositoryImpl()
    {

        siteManagerTable = new HashMap<String, SiteManager>();
    }

    public static SiteManagerRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new SiteManagerRepositoryImpl();
        return repository;
    }

    public SiteManager create(SiteManager siteManager) {
        siteManagerTable.put(siteManager.getId(), siteManager);
        SiteManager saveSiteManager = siteManagerTable.get(siteManager.getId());
        return saveSiteManager;
    }

    public SiteManager read(String id) {
        SiteManager siteManager = siteManagerTable.get(id);
        return siteManager;
    }

    public SiteManager update(SiteManager siteManager) {
        siteManagerTable.put(siteManager.getId(), siteManager);
        SiteManager updateSiteManager = siteManagerTable.get(siteManager.getId());
        return updateSiteManager;
    }

    public void delete(String id) {
        siteManagerTable.remove(id);
    }
}
