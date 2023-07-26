package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L,"Ram@gmail.com","Ram",111L),
            new Contact(2L,"Sham@gmail.com","Sham",111L),
            new Contact(2L,"Tom@gmail.com","Tom",222L)
    );
    @Override
    public List<Contact> getContacts(Long userId) {
        return list.stream().filter(contact->contact.getUserid().equals(userId)).collect(Collectors.toList());
    }
}
