package com.example.CentralDEHelpingHands.services;

import com.example.CentralDEHelpingHands.entities.Recipient;
import com.example.CentralDEHelpingHands.entities.Request;
import com.example.CentralDEHelpingHands.repositories.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CentralDEHelpingHands.repositories.RequestRepository;

import java.util.*;


@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;
//    @Autowired
//    private RecipientRepository recipientRepository;

    public Request createRequest (Request request){
        Request newRequest = new Request();
        newRequest.setTypeOfRequest(request.getTypeOfRequest());
        newRequest.setRequestDescription(request.getRequestDescription());
        //newRequest.setRecipient(recipientRepository.findById(recipientId).get());
        return requestRepository.save(request);
    }

    public Request updateRequest (Request request){
        Request requestToUpdate = requestRepository.findById(request.getId()).get();
        requestToUpdate.setTypeOfRequest(request.getTypeOfRequest());
        requestToUpdate.setRequestDescription(request.getRequestDescription());
        return requestRepository.save(request);
    }

    public List<Request> displayAllRequestsByDatePosted(){
        //return requestRepository.findAllByDatePostedOrderByDatePostedAsc();
        Iterable <Request> requests = requestRepository.findAll();
        List<Request> cltnRequests = new ArrayList<>();
        for(Request r : requests){
            cltnRequests.add(r);
        }
         cltnRequests.sort(Comparator.comparing(Request::getDatePosted));
        return cltnRequests;
    }

    public Boolean deleteRequest(Long id){
        if(requestRepository.findById(id).isPresent()){
            requestRepository.deleteById(id);
            return true;
        }
        else return false;
    }
    
    
}
