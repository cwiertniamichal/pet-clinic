package cwiertnia.michal.petclinic.repositories;

import cwiertnia.michal.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
