package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;

import java.util.List;
public interface FruitService {
    List<Fruit> findById(Long id);
    List<Fruit> findByName(String name);
}
