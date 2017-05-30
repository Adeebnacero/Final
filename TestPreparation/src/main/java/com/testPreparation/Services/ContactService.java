package com.testPreparation.Services;

import com.testPreparation.domain.Contact;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public interface ContactService {
    Contact create(Contact contact);
    Contact read(String id);
    Contact update(Contact contact);
    void delete(String id);
}
