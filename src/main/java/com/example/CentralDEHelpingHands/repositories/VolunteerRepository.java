package com.example.CentralDEHelpingHands.repositories;

import com.example.CentralDEHelpingHands.entities.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends CrudRepository <Volunteer, Long> {
   Volunteer findByEmail(String email);
}
