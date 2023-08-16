package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Pet;
import cwiertnia.michal.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet pet) {
        return save(pet.getId(), pet);
    }
}
