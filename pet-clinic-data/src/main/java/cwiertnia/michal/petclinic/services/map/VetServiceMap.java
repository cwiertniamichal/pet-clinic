package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Vet;
import cwiertnia.michal.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet vet) {
        return save(vet.getId(), vet);
    }
}
