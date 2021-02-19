package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Herbes_aromatique;

import java.util.Optional;

public interface Herbes_aromatiqueService {
    Optional<Herbes_aromatique> findById(long id);
}
