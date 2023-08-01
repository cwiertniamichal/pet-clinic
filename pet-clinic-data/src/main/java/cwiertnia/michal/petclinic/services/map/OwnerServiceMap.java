package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Owner;
import cwiertnia.michal.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner owner) {
        return save(owner.getId(), owner);
    }
}
