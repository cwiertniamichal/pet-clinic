package cwiertnia.michal.petclinic;

import cwiertnia.michal.petclinic.services.jpa.OwnerServiceJpa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {

		SpringApplication.run(PetClinicApplication.class, args);
	}

}
