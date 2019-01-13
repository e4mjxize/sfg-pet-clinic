package eu.gocoma.tutorials.sfgpetclinic.services;

import eu.gocoma.tutorials.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
