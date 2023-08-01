package cwiertnia.michal.petclinic.services;

import cwiertnia.michal.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
