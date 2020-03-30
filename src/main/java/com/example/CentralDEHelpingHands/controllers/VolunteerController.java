package com.example.CentralDEHelpingHands.controllers;

import com.example.CentralDEHelpingHands.entites.Volunteer;
import com.example.CentralDEHelpingHands.services.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/volunteers")
class VolunteerController {

    @Autowired
    private VolunteerService volunteerService;

    @PostMapping("/create")
    public ResponseEntity<Volunteer> addVolunteer (@RequestBody Volunteer volunteer){
        volunteerService.createVolunteer(volunteer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
