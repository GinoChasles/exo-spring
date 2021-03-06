package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Legume;

import java.util.Optional;

public interface LegumeService {
     Optional<Legume> findById(Long id);
     Legume insert(Legume legume);
     Legume update(Long id, Legume legume);
     Legume delete(Long id);
}
