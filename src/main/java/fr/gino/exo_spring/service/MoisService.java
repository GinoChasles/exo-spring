package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Mois;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MoisService {
    Optional<Mois> findById(Long id);

}
