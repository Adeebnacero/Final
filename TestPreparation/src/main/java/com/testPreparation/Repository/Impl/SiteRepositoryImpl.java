package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.SiteRepository;
import com.testPreparation.domain.Site;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteRepositoryImpl implements SiteRepository {
    public static SiteRepositoryImpl repository = null;

    private Map<String, Site> siteTable;

    private SiteRepositoryImpl()
    {

        siteTable = new HashMap<String, Site>();
    }
    public static SiteRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new SiteRepositoryImpl();
        return repository;
    }
    public Site create(Site site) {
        siteTable.put(site.getId(), site);
        Site saveSite = siteTable.get(site.getId());
        return saveSite;
    }

    public Site read(String id) {
        Site site = siteTable.get(id);
        return site;
    }

    public Site update(Site site) {
        siteTable.put(site.getId(), site);
        Site updateSite = siteTable.get(site.getId());
        return updateSite;
    }

    public void delete(String id) {
        siteTable.remove(id);
    }
}
