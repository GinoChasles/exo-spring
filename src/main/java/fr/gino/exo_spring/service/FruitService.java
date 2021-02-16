package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitService {

    Optional<Fruit> findById(Long id);
}
