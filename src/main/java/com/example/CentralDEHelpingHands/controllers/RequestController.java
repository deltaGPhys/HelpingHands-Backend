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

//    @PostMapping("/create")
//    public ResponseEntity<Request> createRequest(@RequestBody Request request, Long recipientId){
//        return new ResponseEntity<>(requestService.createRequest(request, recipientId),HttpStatus.CREATED);
//    }

        @PostMapping("/create")
    public ResponseEntity<Request> createRequest(@RequestBody Request request){
        return new ResponseEntity<>(requestService.createRequest(request),HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{requestId}")
    public ResponseEntity<Boolean> deleteRequest(@PathVariable Long requestId){
        return new ResponseEntity<>(requestService.deleteRequest(requestId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Request>> displayAllRequestsbyDate (){
        return new ResponseEntity<>(requestService.displayAllRequestsByDatePosted(), HttpStatus.OK);
    }

    @GetMapping("/hello")
    public String firstPage() {
        return "Hello World";
    }


}
