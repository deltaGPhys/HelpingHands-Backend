package com.example.CentralDEHelpingHands.controllers;

import com.example.CentralDEHelpingHands.entites.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.CentralDEHelpingHands.services.RequestService;

import java.util.List;

@RestController
//@RequestMapping("/requests")
class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/requests/create")
    public ResponseEntity<Request> createRequest(@RequestBody Request request){
        requestService.createRequest(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{requestId}")
    public ResponseEntity<Boolean> deleteRequest(Long id){
        requestService.deleteRequest(id);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/requests")
    public ResponseEntity<List<Request>> displayAllRequestsbyDate (){
        requestService.displayAllRequestsByDatePosted();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
