package com.example.CentralDEHelpingHands.services;

import com.example.CentralDEHelpingHands.entities.Recipient;
import com.example.CentralDEHelpingHands.entities.Request;
import com.example.CentralDEHelpingHands.repositories.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipientService {

    @Autowired
    private RecipientRepository recipientRepository;
    
    public Recipient createRecipient (Recipient recipient){
        Recipient newRecipient = new Recipient();
        newRecipient.setFirstName(recipient.getFirstName());
        newRecipient.setLastName(recipient.getLastName());
        newRecipient.setPhoneNum(recipient.getPhoneNum());
        newRecipient.setEmail(recipient.getEmail());
        newRecipient.setPassword(recipient.getPassword());
        newRecipient.setLocation(recipient.getLocation());
        newRecipient.setLink(recipient.getLink());
        return recipientRepository.save(newRecipient);
    }

    public Iterable<Request> showRecipientRequests (Long id) {
        if(recipientRepository.findById(id).isPresent()) {
            Recipient myRecipient = recipientRepository.findById(id).get();
            return myRecipient.getRequests();
        }
        return null;
    }

    public Boolean emailAvailable (String email){
        Iterable <Recipient> recipients = recipientRepository.findAll();
        for(Recipient recipient : recipients){
            if(email.equals(recipient.getEmail())){
                return false;
            }
        }
        return true;
    }

    public Boolean deleteRecipient (Long id){
        if(recipientRepository.findById(id).isPresent()){
            recipientRepository.deleteById(id);
            return true;
        }
        return false;
    }




}
