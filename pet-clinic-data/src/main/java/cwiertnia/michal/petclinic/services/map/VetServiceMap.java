package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Vet;
import cwiertnia.michal.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
}
