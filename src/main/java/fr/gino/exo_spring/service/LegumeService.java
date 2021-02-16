package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Legume;

import java.util.Optional;

public interface LegumeService {
     Optional<Legume> findById(Long id);
}
