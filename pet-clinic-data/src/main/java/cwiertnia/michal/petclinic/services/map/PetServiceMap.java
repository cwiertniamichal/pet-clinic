package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Pet;
import cwiertnia.michal.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet save(Pet pet) {
        return save(pet.getId(), pet);
    }
}
