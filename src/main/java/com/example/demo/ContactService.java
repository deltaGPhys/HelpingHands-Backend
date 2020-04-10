package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Iterable<Contact> findAllContacts(){
        return contactRepository.findAll();
    }

    public Contact createContact (Contact contact) {

        Boolean emailSent = null;
         SendMail.sendMessage(contact.getFirstName(),
                 contact.getLastName(), contact.getEmail(), contact.getPhoneNum(),
                 contact.getBirthDate(), contact.getReasonForContact(), contact.getPreferredApptTime(),
                 contact.getMessage());
        return contactRepository.save(contact);
//        return emailSent;
    }


}
