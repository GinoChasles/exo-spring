package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Mois;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MoisRepository extends JpaRepository<Mois, Long> {
    public List<Mois> findByName(String name);
}
