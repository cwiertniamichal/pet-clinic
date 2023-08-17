package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Pet;
import cwiertnia.michal.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
