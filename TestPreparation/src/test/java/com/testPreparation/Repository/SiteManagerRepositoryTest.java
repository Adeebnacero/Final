package com.testPreparation.Repository;

import com.testPreparation.Factories.RoleFactory;
import com.testPreparation.Factories.SiteFactory;
import com.testPreparation.Factories.SiteManagerFactory;
import com.testPreparation.Repository.Impl.ContactRepositoryImpl;
import com.testPreparation.Repository.Impl.SiteManagerRepositoryImpl;
import com.testPreparation.domain.Contact;
import com.testPreparation.domain.Role;
import com.testPreparation.domain.Site;
import com.testPreparation.domain.SiteManager;
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
public class SiteManagerRepositoryTest {
    //Contact
    Map<String, String> contactValues;
    Contact contact;


    //SiteManager
    SiteManager siteManager;
    Map<String, String> siteManagerValues;
    SiteManagerRepository repository;

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
        repository = SiteManagerRepositoryImpl.getInstance();

    }

    @Test
    public void create() throws Exception {
        SiteManager siteManager = SiteManagerFactory.getSiteManager(siteManagerValues, contact, siteList, roleList);
        repository.create(siteManager);
        assertEquals("1",siteManager.getId());
        }


    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        SiteManager siteManager = repository.read("1");
        assertEquals("thabo.moopa@gmail.com", siteManager.getEmail());
    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        SiteManager siteManager = repository.read("1");
        SiteManager updateAbuseReport = new SiteManager.Builder()
                .id(siteManagerValues.get("id"))
                .firstName(siteManagerValues.get("firstName"))
                .lastName(siteManagerValues.get("lastName"))
                .password(siteManagerValues.get("password"))
                .email("John@gmail.com")
                .contact(contact)
                .site(siteList)
                .role(roleList)
                .build();
        repository.update(updateAbuseReport);
        siteManager = repository.read("1");
        assertEquals("John@gmail.com", siteManager.getEmail());

    }

    @Test(dependsOnMethods = {"create","update"})
    public void delete() throws Exception {
        repository.delete("1");
        SiteManager siteManager = repository.read("1");
        assertNull(siteManager);
    }

}