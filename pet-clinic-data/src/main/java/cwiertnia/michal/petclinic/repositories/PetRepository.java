package cwiertnia.michal.petclinic.repositories;

import cwiertnia.michal.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
