package eu.gocoma.tutorials.sfgpetclinic.services;

import eu.gocoma.tutorials.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
