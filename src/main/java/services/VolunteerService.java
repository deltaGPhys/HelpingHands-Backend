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
        volunteer.setFirstName(volunteer.getFirstName());
        volunteer.setLastName(volunteer.getLastName());
        volunteer.setPhoneNum(volunteer.getPhoneNum());
        volunteer.setEmail(volunteer.getEmail());
        volunteer.setPassword(volunteer.getPassword());
        volunteer.setLink(volunteer.getLink());
        volunteerRepository.save(volunteer);
    }

    public void updateVolunteer(Volunteer volunteer){

    }
}
