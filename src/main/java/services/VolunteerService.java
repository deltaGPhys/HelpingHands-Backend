package services;

import models.Volunteer;
import repositories.VolunteerRepository;
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

    }
}
