package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/send-email")
    public ResponseEntity<Boolean> saveAndEmailContact (Contact contact){
        return new ResponseEntity<>(contactService.createContact(contact), HttpStatus.OK);
    }

}
