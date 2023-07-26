package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContacts(Long userId);
}
