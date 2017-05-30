package com.testPreparation.Repository;

import com.testPreparation.Factories.SiteFactory;
import com.testPreparation.Repository.Impl.SiteRepositoryImpl;
import com.testPreparation.domain.Site;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteRepositoryTest {
    Map<String, String> values;
    SiteRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = SiteRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name", "Cape Town");
        values.put("url", "192.168.98.7");
        values.put("urlStory","virus");
    }

    @Test
    public void create() throws Exception {
        Site site = SiteFactory.getSite(values);
        repository.create(site);
        assertEquals("1",site.getId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Site site = repository.read("1");
        assertEquals("Cape Town", site.getName());

    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        Site site  = repository.read("1");
        Site updateSite = new Site.Builder()
                .id(values.get("id"))
                .url(values.get("url"))
                .urlStory(values.get("urlStory"))
                .name("Johannesburg")
                .build();
        repository.update(updateSite);
        site = repository.read("1");
        assertEquals("Johannesburg", site.getName());

    }

    @Test(dependsOnMethods = {"create","update"})
    public void delete() throws Exception {
        repository.delete("1");
        Site site = repository.read("1");
        assertNull(site);

    }

}