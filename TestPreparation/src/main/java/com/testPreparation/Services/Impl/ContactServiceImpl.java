package com.testPreparation.Services.Impl;

import com.testPreparation.Repository.Impl.ContactRepositoryImpl;
import com.testPreparation.Services.ContactService;
import com.testPreparation.domain.Contact;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class ContactServiceImpl implements ContactService {
    public static  ContactServiceImpl service = null;

    ContactRepositoryImpl services =  ContactRepositoryImpl.getInstance();

    public static  ContactServiceImpl getInstance()
    {
        if(service == null)
            service = new  ContactServiceImpl();
        return service;
    }
    public Contact create(Contact contact) {
        return services.create(contact);
    }

    public Contact read(String id) {
        return services.read(id);
    }

    public Contact update(Contact contact) {
        return services.update(contact);
    }

    public void delete(String id) {
        services.delete(id);
    }
}
