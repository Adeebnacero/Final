package com.testPreparation.Services;

import com.testPreparation.Factories.ContactFactory;
import com.testPreparation.Factories.RoleFactory;
import com.testPreparation.Factories.SiteFactory;
import com.testPreparation.Factories.SiteManagerFactory;
import com.testPreparation.Repository.ContactRepository;
import com.testPreparation.Repository.Impl.ContactRepositoryImpl;
import com.testPreparation.Services.Impl.ContactServiceImpl;
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
public class ContactServiceTest {
    //Contact
    Map<String, String> contactValues;
    Contact contact;
    ContactService service;

    //SiteManager
    SiteManager siteManager;
    Map<String, String> siteManagerValues;

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
        service = new ContactServiceImpl();


        //role values
        roleValues = new HashMap<String, String>();
        roleValues.put("id","1");
        roleValues.put("name", "Manager");
        roleValues.put("description","Supervisor");
        role = RoleFactory.getRole(roleValues);
        roleList = new ArrayList<Role>();
        roleList.add(role);

        //Site values
        siteValues = new HashMap<String, String>();
        siteValues.put("id","1");
        siteValues.put("name", "Cape Town");
        siteValues.put("url", "192.168.98.7");
        siteValues.put("urlStory","virus");
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
        siteManager = SiteManagerFactory.getSiteManager(siteManagerValues, contact, siteList, roleList);

    }

    @Test
    public void create() throws Exception {
        Contact contact = ContactFactory.getContact(contactValues, siteManager);
        service.create(contact);
        assertEquals("1",contact.getId());
    }

    @Test(dependsOnMethods = {"create"})
    public void read() throws Exception {
        Contact contact = service.read("1");
        assertEquals("0849262255", contact.getCellphone());

    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        Contact contact = service.read("1");
        Contact updateContact = new Contact.Builder()
                .id(contactValues.get("id"))
                .address(contactValues.get("address"))
                .cellphone("0761234567")
                .postalCode(contactValues.get("postalCode"))
                .siteManager(siteManager)
                .build();

        service.update(updateContact);
        contact = service.read("1");
        assertEquals("0761234567", contact.getCellphone());

    }

    @Test(dependsOnMethods = {"update","create"})
    public void delete() throws Exception {
        service.delete("1");
        Contact contact = service.read("1");
        assertNull(contact);
    }

}