package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Mois;

import java.util.List;
import java.util.Optional;

public interface FruitService {

    Optional<Fruit> findById(Long id);
    Fruit insert(Fruit fruit);
    Fruit update(Long id, Fruit fruit);
    Fruit delete(Long id);
    //List<Fruit> findAll();
    //Fruit addFruitToMois(Fruit fruit, Mois mois);
}
