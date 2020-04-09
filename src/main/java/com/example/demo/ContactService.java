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
        Contact newContact = new Contact();
        newContact.setFirstName(contact.getFirstName());
        newContact.setLastName(contact.getLastName());
        newContact.setEmail(contact.getEmail());
        newContact.setPhoneNum(contact.getPhoneNum());
        newContact.setBirthDate(contact.getBirthDate());
        newContact.setReasonForContact(contact.getReasonForContact());
        newContact.setPreferredApptTime(contact.getPreferredApptTime());
        newContact.setMessage(contact.getMessage());
        return contactRepository.save(newContact);



//        Boolean emailSent = null;
//        System.out.println("New Contact: " + contact);
//        //System.out.println("To Email" + contactToEmail);
//         emailSent = SendMail.sendMessage(contact.getFirstName(),
//                 contact.getLastName(), contact.getEmail(), contact.getPhoneNum(),
//                 contact.getBirthDate(), contact.getReasonForContact(), contact.getPreferredApptTime(),
//                 contact.getMessage());
        //return contactRepository.save(contact);
        //return emailSent;
    }


}
