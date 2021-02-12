package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {

    public List<Fruit> findByName(String name);
    public List<Fruit> findByFruitId(Long fruit_id);
}
