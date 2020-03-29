package repositories;

import models.Recipient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends CrudRepository <Recipient, Long> {
}
