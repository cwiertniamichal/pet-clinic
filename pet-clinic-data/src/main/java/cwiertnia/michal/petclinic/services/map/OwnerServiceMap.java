package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Owner;
import cwiertnia.michal.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
