package cwiertnia.michal.petclinic.services;

import cwiertnia.michal.petclinic.model.Owner;
import cwiertnia.michal.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
