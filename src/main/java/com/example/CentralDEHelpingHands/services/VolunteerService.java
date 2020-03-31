package com.example.CentralDEHelpingHands.services;

import com.example.CentralDEHelpingHands.entities.Volunteer;
import com.example.CentralDEHelpingHands.repositories.VolunteerRepository;
import com.example.CentralDEHelpingHands.validators.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;

    public Volunteer createVolunteer (Volunteer volunteer){
        Volunteer newVolunteer = new Volunteer();
        newVolunteer.setFirstName(volunteer.getFirstName());
        newVolunteer.setLastName(volunteer.getLastName());
        newVolunteer.setPhoneNum(volunteer.getPhoneNum());
        newVolunteer.setEmail(volunteer.getEmail());
        //newVolunteer.setSalt(PasswordUtils.getSalt(30));
        newVolunteer.setPassword(volunteer.getPassword());
        newVolunteer.setLink(volunteer.getLink());
        return volunteerRepository.save(volunteer);
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

    public Boolean deleteVolunteerById (Long id){
        if(volunteerRepository.findById(id).isPresent()){
            volunteerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
