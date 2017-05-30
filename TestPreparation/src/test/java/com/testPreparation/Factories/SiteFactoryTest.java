package com.testPreparation.Factories;

import com.testPreparation.domain.Site;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteFactoryTest {
    Map<String, String> values;
    Site site;
    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name", "Cape Town");
        values.put("url", "192.168.98.7");
        values.put("urlStory","virus");
    }

    @Test
    public void testGetSite() throws Exception {
        Site site = SiteFactory.getSite(values);
        assertEquals(true, site.equals(site));
    }
    @Test
    public void testName() throws Exception{
        Site site = SiteFactory.getSite(values);
        assertEquals("Cape Town", site.getName());
    }

}