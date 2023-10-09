package cwiertnia.michal.petclinic.repositories;

import cwiertnia.michal.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
