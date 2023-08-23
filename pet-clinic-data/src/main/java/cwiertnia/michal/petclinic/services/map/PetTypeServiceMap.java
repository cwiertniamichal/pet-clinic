package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.PetType;
import cwiertnia.michal.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

}
