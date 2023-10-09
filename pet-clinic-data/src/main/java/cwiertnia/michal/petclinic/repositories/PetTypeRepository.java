package cwiertnia.michal.petclinic.repositories;

import cwiertnia.michal.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
