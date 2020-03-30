package com.example.CentralDEHelpingHands.repositories;

import com.example.CentralDEHelpingHands.entites.Recipient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends CrudRepository <Recipient, Long> {
}
