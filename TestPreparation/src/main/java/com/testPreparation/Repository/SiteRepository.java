package com.testPreparation.Repository;

import com.testPreparation.domain.Site;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface SiteRepository {
    Site create(Site site);
    Site read(String id);
    Site update(Site site);
    void delete(String id);
}
