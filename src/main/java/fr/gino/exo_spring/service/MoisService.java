package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Mois;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MoisService {
    List<Mois> findById(long id);
    List<Mois> findByName(String name);
}
