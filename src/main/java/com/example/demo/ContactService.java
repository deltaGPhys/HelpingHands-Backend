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

    public Contact createContact (Contact newContact) {
        Contact contactToEmail =  contactRepository.save(newContact);
        SendMail.sendMessage(contactToEmail.getEmail(), "${emailPassword}", contactToEmail.getFirstName(),
                contactToEmail.getLastName(), contactToEmail.getEmail(), contactToEmail.getPhoneNum(),
                contactToEmail.getBirthDate(), contactToEmail.getReasonForContact(), contactToEmail.getPreferredApptTime(),
                contactToEmail.getMessage());
        return null;
    }


}
