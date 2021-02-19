package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Saison;

import java.util.List;
import java.util.Optional;

public interface SaisonService {
    Optional<Saison> findById(Long id);
}
