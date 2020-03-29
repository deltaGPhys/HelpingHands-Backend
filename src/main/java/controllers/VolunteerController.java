package controllers;

import models.Volunteer;
import services.VolunteerService;
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
