package com.testPreparation.Factories;

import com.testPreparation.domain.Contact;
import com.testPreparation.domain.Role;
import com.testPreparation.domain.Site;
import com.testPreparation.domain.SiteManager;

import java.util.List;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class SiteManagerFactory {
    public static SiteManager getSiteManager(Map<String, String> values, Contact contact, List<Site> site, List<Role> role)
    {
        SiteManager siteManager = new SiteManager.Builder()
                .id(values.get("id"))
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .email(values.get("email"))
                .password(values.get("password"))
                .contact(contact)
                .site(site)
                .role(role)
                .build();
        return siteManager;
    }

}
