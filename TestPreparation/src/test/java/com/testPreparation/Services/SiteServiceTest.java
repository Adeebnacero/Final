package com.testPreparation.Services;

import com.testPreparation.Factories.SiteFactory;
import com.testPreparation.Services.Impl.SiteServiceImpl;
import com.testPreparation.domain.Site;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteServiceTest {
    Map<String, String> values;
    SiteService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new SiteServiceImpl();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name", "Cape Town");
        values.put("url", "192.168.98.5");
        values.put("urlStory", "virus");
    }

    @Test
    public void create() throws Exception {
        Site site = SiteFactory.getSite(values);
        service.create(site);
        assertEquals("1",site.getId());
    }

    @Test(dependsOnMethods = {"create"})
    public void read() throws Exception {
        Site site = service.read("1");
        assertEquals("192.168.98.5", site.getUrl());

    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        Site site = service.read("1");
        Site updateSite = new Site.Builder()
                .id(values.get("id"))
                .name(values.get("name"))
                .urlStory(values.get("urlStory"))
                .url("192.165.23.8")
                .build();
        service.update(updateSite);
        site = service.read("1");
        assertEquals("192.165.23.8", site.getUrl());

    }

    @Test(dependsOnMethods = {"update","create"})
    public void delete() throws Exception {
        service.delete("1");
        Site site = service.read("1");
        assertNull(site);
    }

}