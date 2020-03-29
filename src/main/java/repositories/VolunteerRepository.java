package repositories;

import models.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends CrudRepository <Volunteer, Long> {
   Volunteer findByEmail(String email);
}
