package com.testPreparation.Repository.Impl;

import com.testPreparation.Repository.ContactRepository;
import com.testPreparation.domain.Contact;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class ContactRepositoryImpl implements ContactRepository {

    public static ContactRepositoryImpl repository = null;

    private Map<String, Contact> contactTable;

    private ContactRepositoryImpl()
    {

        contactTable = new HashMap<String, Contact>();
    }

    public static ContactRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new ContactRepositoryImpl();
        return repository;
    }

    public Contact create(Contact contact) {
        contactTable.put(contact.getId(), contact);
        Contact saveContact = contactTable.get(contact.getId());
        return saveContact;
    }

    public Contact read(String id) {
        Contact readContact = contactTable.get(id);
        return readContact;
    }

    public Contact update(Contact contact) {
        contactTable.put(contact.getId(), contact);
        Contact updateContact = contactTable.get(contact.getId());
        return updateContact;
    }

    public void delete(String id) {
        contactTable.remove(id);
    }
}
