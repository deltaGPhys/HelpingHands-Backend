package controllers;

import models.Recipient;
import models.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.RequestService;

import java.util.List;

@RestController
@RequestMapping("/requests")
class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/create")
    public ResponseEntity<Request> createRequest(@RequestBody Request request, @RequestBody Recipient recipent){
        requestService.createRequest(request, recipent);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Request>> displayAllRequestsbyDate (){
        requestService.displayAllRequestsByDatePosted();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
