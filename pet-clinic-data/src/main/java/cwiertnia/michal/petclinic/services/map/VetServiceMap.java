package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Vet;
import cwiertnia.michal.petclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet vet) {
        return save(vet.getId(), vet);
    }
}
