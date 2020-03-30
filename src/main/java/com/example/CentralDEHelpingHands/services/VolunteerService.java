package com.example.CentralDEHelpingHands.services;

import com.example.CentralDEHelpingHands.entites.Volunteer;
import com.example.CentralDEHelpingHands.repositories.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;

    public void createVolunteer (Volunteer volunteer){
        Volunteer newVolunteer = new Volunteer();
        newVolunteer.setFirstName(volunteer.getFirstName());
        newVolunteer.setLastName(volunteer.getLastName());
        newVolunteer.setPhoneNum(volunteer.getPhoneNum());
        newVolunteer.setEmail(volunteer.getEmail());
        newVolunteer.setPassword(volunteer.getPassword());
        newVolunteer.setLink(volunteer.getLink());
        volunteerRepository.save(volunteer);
    }

    public void updateVolunteer(Volunteer volunteer){
        Volunteer volunteerToUpdate = volunteerRepository.findById(volunteer.getId()).get();
        volunteerToUpdate.setFirstName(volunteer.getFirstName());
        volunteerToUpdate.setLastName(volunteer.getLastName());
        volunteerToUpdate.setPhoneNum(volunteer.getPhoneNum());
        volunteerToUpdate.setLink(volunteer.getLink());
        volunteerRepository.save(volunteer);
    }

    public Iterable<Volunteer> findAllVolunteers () {
        return volunteerRepository.findAll();
    }

    public Boolean emailAvailable (String email){
        Iterable <Volunteer> volunteers = volunteerRepository.findAll();
        for(Volunteer volunteer : volunteers){
            if(email.equals(volunteer.getEmail())){
                return false;
            }
        }
        return true;
    }
}
