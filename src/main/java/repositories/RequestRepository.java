package repositories;

import models.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}
