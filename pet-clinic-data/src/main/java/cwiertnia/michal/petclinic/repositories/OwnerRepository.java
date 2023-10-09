package cwiertnia.michal.petclinic.repositories;

import cwiertnia.michal.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Optional<Owner> findByLastName(String lastName);
}
