package services;

import models.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repositories.RecipientRepository;
import repositories.VolunteerRepository;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private VolunteerRepository volunteerRepository;
    private RecipientRepository recipientRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        try{
//            Volunteer volunteer = volunteerRepository.findByEmail(username);
//            return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
//        }catch(UsernameNotFoundException e){
//            throw new UsernameNotFoundException("Username or password does not exist", e);
//        }
        return null;
    }
}
