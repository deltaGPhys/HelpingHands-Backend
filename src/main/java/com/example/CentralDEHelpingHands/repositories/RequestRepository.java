package com.example.CentralDEHelpingHands.repositories;

import com.example.CentralDEHelpingHands.entites.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}
