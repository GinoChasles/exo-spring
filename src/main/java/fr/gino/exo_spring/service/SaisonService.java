package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Saison;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SaisonService {
    List<Saison> findById(long id);
    List<Saison> findByName(String name);
}
