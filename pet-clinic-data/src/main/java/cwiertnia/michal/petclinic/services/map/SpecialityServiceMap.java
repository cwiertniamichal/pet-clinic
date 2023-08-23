package cwiertnia.michal.petclinic.services.map;

import cwiertnia.michal.petclinic.model.Speciality;
import cwiertnia.michal.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
