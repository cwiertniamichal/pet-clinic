package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.PetType;
import cwiertnia.michal.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

}
