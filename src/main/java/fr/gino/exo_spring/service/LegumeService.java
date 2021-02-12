package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Legume;

import java.util.List;

public interface LegumeService {
    List<Legume> findById(long id);
    List<Legume> findByName(String name);
}
