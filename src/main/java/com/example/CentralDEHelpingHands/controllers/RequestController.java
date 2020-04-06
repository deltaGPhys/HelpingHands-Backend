package com.example.CentralDEHelpingHands.controllers;

import com.example.CentralDEHelpingHands.entities.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.CentralDEHelpingHands.services.RequestService;

import java.util.List;

@RestController
@RequestMapping("/requests")
class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping
    public ResponseEntity<Iterable<Request>> displayAllRequestsbyDate (){
        return new ResponseEntity<>(requestService.displayAllRequestsByDatePosted(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Request> createRequest(@RequestBody Request request){
        return new ResponseEntity<>(requestService.createRequest(request),HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{requestId}")
    public ResponseEntity<Boolean> deleteRequest(@PathVariable Long requestId){
        return new ResponseEntity<>(requestService.deleteRequest(requestId), HttpStatus.OK);
    }

    @PostMapping("/{requestId}/update-status")
    public ResponseEntity<Request> updateStatus (@PathVariable Long requestId) {
        requestService.updateStatus(requestId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


//    @GetMapping("/hello")
//    public String firstPage() {
//        return "Hello World";
//    }


}
