package com.contact.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.contact.entity.Contact;

public interface ContactDao extends JpaRepository<Contact, Long> {
}
