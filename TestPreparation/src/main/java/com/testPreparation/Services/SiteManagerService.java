package com.testPreparation.Services;

import com.testPreparation.domain.SiteManager;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface SiteManagerService {
    SiteManager create(SiteManager siteManger);
    SiteManager read(String id);
    SiteManager update(SiteManager siteManger);
    void delete(String id);
}
