package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {

   /* public List<Fruit> findFruitsBySaisonId(long saison_id);*/

}
