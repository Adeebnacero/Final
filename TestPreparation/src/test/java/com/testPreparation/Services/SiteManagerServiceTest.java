package com.testPreparation.Services;

import com.testPreparation.Factories.RoleFactory;
import com.testPreparation.Factories.SiteFactory;
import com.testPreparation.Factories.SiteManagerFactory;
import com.testPreparation.Repository.Impl.SiteManagerRepositoryImpl;
import com.testPreparation.Repository.SiteManagerRepository;
import com.testPreparation.Services.Impl.SiteManagerServiceImpl;
import com.testPreparation.domain.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteManagerServiceTest {
    //Contact
    Map<String, String> contactValues;
    Contact contact;


    //SiteManager
    SiteManager siteManager;
    Map<String, String> siteManagerValues;
    SiteManagerService service;

    //Site
    Map<String, String> siteValues;
    Site site;
    List<Site> siteList;

    //Role
    Map<String, String> roleValues;
    Role role;
    List<Role> roleList;

    @BeforeMethod
    public void setUp() throws Exception {
//Contact values
        contactValues = new HashMap<String, String>();
        contactValues.put("id", "1");
        contactValues.put("address", "1488 Block L");
        contactValues.put("cellphone", "0849262255");
        contactValues.put("postalCode", "0152");


        //role values
        roleValues = new HashMap<String, String>();
        roleValues.put("id", "1");
        roleValues.put("name", "Manager");
        roleValues.put("description", "Supervisor");
        role = RoleFactory.getRole(roleValues);
        roleList = new ArrayList<Role>();
        roleList.add(role);

        //Site values
        siteValues = new HashMap<String, String>();
        siteValues.put("id", "1");
        siteValues.put("name", "Cape Town");
        siteValues.put("url", "192.168.98.7");
        siteValues.put("urlStory", "virus");
        site = SiteFactory.getSite(siteValues);
        siteList = new ArrayList<Site>();
        siteList.add(site);

        //siteManager values
        siteManagerValues = new HashMap<String, String>();
        siteManagerValues.put("id", "1");
        siteManagerValues.put("firstName", "Thabo");
        siteManagerValues.put("lastName", "Moopa");
        siteManagerValues.put("email", "thabo.moopa@gmail.com");
        siteManagerValues.put("password", "12345");
        service = new SiteManagerServiceImpl();

    }

    @Test
    public void create() throws Exception {
        SiteManager siteManager = SiteManagerFactory.getSiteManager(siteManagerValues, contact, siteList, roleList);
        service.create(siteManager);
        assertEquals("1",siteManager.getId());

    }

    @Test(dependsOnMethods = {"create"})
    public void read() throws Exception {
        SiteManager siteManager = service.read("1");
        assertEquals("Thabo", siteManager.getFirstName());

    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        SiteManager siteManager = service.read("1");
        SiteManager updateSiteManager = new SiteManager.Builder()
                .id(siteManagerValues.get("id"))
                .firstName(siteManagerValues.get("firstName"))
                .lastName("Jackson")
                .email(siteManagerValues.get("email"))
                .password(siteManagerValues.get("password"))
                .contact(contact)
                .site(siteList)
                .role(roleList)
                .build();
        service.update(updateSiteManager);
        siteManager = service.read("1");
        assertEquals("Jackson", siteManager.getLastName());

    }

    @Test(dependsOnMethods = {"update","create"})
    public void delete() throws Exception {
        service.delete("1");
        SiteManager siteManager = service.read("1");
        assertNull(siteManager);
    }

}