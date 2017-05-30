package com.testPreparation.Repository;

import com.testPreparation.domain.SiteManager;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface SiteManagerRepository {
    SiteManager create(SiteManager siteManager);
    SiteManager read(String id);
    SiteManager update(SiteManager siteManager);
    void delete(String id);
}
