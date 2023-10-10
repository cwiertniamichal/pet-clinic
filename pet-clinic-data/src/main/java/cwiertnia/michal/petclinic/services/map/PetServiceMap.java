package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Pet;
import cwiertnia.michal.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
