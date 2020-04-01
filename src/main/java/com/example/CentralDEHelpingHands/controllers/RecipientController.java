package com.example.CentralDEHelpingHands.controllers;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.example.CentralDEHelpingHands.entities.Recipient;
import com.example.CentralDEHelpingHands.entities.Request;
import com.example.CentralDEHelpingHands.services.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipients")
class RecipientController {

    @Autowired
    private RecipientService recipientService;

    @PostMapping("/create")
    public ResponseEntity <Recipient> createRecipient (@RequestBody Recipient recipient){
        return new ResponseEntity<>(recipientService.createRecipient(recipient), HttpStatus.CREATED);
    }

    @GetMapping("/requests/{id}")
    public ResponseEntity <Iterable <Request>> showRecipientRequests (@PathVariable Long id){
        return new ResponseEntity<>(recipientService.showRecipientRequests(id), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity <Boolean> deleteRecipient (@PathVariable Long id){
        return new ResponseEntity<>(recipientService.deleteRecipient(id), HttpStatus.OK);
    }



}
