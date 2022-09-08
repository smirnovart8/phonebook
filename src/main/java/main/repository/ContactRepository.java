package main.repository;

import main.model.PhoneContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<PhoneContact, Integer> {

}
