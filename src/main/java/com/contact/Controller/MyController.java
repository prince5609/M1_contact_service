package com.contact.Controller;

import com.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.contact.service.ContactService;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact/add")
    public Contact add_contact(@RequestBody Contact contact){
        return contactService.addContact(contact);
    }

    @GetMapping("/contact/all")
    public List<Contact> get_all_contacts(){
        return contactService.getUserContacts();
    }

    @GetMapping("/contact/{userid}")
    public List<Contact> get_contact_by_userid(@PathVariable Long userid){
        return contactService.getUserContactsByUserId(userid);
    }

    @GetMapping("/contact/contacts/{contactId}")
    public Contact get_contact_by_id(@PathVariable Long contactId){
        return contactService.getUserContactsById(contactId);
    }

    @PutMapping("/contact/update")
    public Contact update_contact(@RequestBody Contact contact){
        return contactService.updateContact(contact);
    }
}
