package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getUserContacts();

    public Contact addContact(Contact contact);

    public List<Contact> getUserContactsByUserId(Long userid);

    public Contact updateContact(Contact contact);

   public Contact getUserContactsById(Long contactId);
}
