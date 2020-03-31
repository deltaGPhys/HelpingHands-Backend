package com.example.CentralDEHelpingHands.controllers;

import com.example.CentralDEHelpingHands.entities.Volunteer;
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
        return new ResponseEntity<>(volunteerService.createVolunteer(volunteer), HttpStatus.CREATED);
    }

    @GetMapping("/find")
    public ResponseEntity<Volunteer> findVolunteerByEmail(String email){
        return null;
    }

    @GetMapping("/find-all")
    public ResponseEntity<Iterable<Volunteer>> findAllVolunteers (){
        return new ResponseEntity<>(volunteerService.findAllVolunteers(), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Boolean> deleteVolunteerById (@PathVariable Long id){
        return new ResponseEntity<>(volunteerService.deleteVolunteerById(id), HttpStatus.OK);
    }

}
