package com.testPreparation.Factories;

import com.testPreparation.domain.Contact;
import com.testPreparation.domain.SiteManager;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class ContactFactory {
    public static Contact getContact(Map<String, String> values, SiteManager site)
    {
        Contact contact = new Contact.Builder()
                .id(values.get("id"))
                .address(values.get("address"))
                .cellphone(values.get("cellphone"))
                .postalCode(values.get("postalCode"))
                .siteManager(site)
                .build();
        return contact;
    }
}
