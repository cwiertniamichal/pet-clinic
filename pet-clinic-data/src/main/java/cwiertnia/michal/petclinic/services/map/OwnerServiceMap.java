package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Owner;
import cwiertnia.michal.petclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner owner) {
        return save(owner.getId(), owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
