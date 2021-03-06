package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SaisonRepository extends JpaRepository<Saison, Long> {
    public List<Saison> findByName(String name);
}
