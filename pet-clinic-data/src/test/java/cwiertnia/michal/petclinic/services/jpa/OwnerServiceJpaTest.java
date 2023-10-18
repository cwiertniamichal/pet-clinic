package cwiertnia.michal.petclinic.services.jpa;

import cwiertnia.michal.petclinic.model.Owner;
import cwiertnia.michal.petclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerServiceJpaTest {

    public static final String LAST_NAME = "lastName";
    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerServiceJpa service;

    Owner returnOwner;

    @BeforeEach
    public void setUp() {
        returnOwner = Owner.builder().id(1L).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(Optional.of(returnOwner));

        Owner owner = service.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, owner.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Owner owner1 = Owner.builder().id(1L).build();
        Owner owner2 = Owner.builder().id(2L).build();
        when(ownerRepository.findAll()).thenReturn(Set.of(owner1, owner2));

        Set<Owner> owners = service.findAll();

        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(any())).thenReturn(Optional.of(returnOwner));

        Owner foundOwner = service.findById(1L);

        assertNotNull(foundOwner);
        assertEquals(1L, foundOwner.getId());
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(any())).thenReturn(Optional.empty());

        Owner foundOwner = service.findById(1L);

        assertNull(foundOwner);
    }

    @Test
    void save() {
        final long id = 1L;
        Owner ownerToSave = Owner.builder().id(id).build();
        when(ownerRepository.save(any())).thenReturn(ownerToSave);

        Owner savedOwner = service.save(ownerToSave);

        assertNotNull(savedOwner);
        assertEquals(1L, savedOwner.getId());
    }

    @Test
    void delete() {
        service.delete(returnOwner);
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(returnOwner.getId());
        verify(ownerRepository, times(1)).deleteById(any());
    }
}