package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactDao contactDao;

    @Override
    public List<Contact> getUserContacts(){
        return contactDao.findAll();
    }

    @Override
    public List<Contact> getUserContactsByUserId(Long userid){
        List<Contact> list = contactDao.findAll();
        // To get list of contact having same user -->
        return list.stream().filter(contact-> contact.getUserId().equals(userid)).
                collect(Collectors.toList());
    }

    @Override
    public Contact addContact(Contact contact){
        return contactDao.save(contact);
    }

    @Override
    public Contact updateContact(Contact contact){
        return contactDao.save(contact);
    }

    public Contact getUserContactsById(Long contactId){
        List<Contact> list = contactDao.findAll();
        return list.stream().filter(contact-> contact.getcId().equals(contactId)).findAny().orElse(null);
    }
}
