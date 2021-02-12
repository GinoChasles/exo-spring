package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SaisonRepository extends JpaRepository<Saison, Long> {

    public List<Saison> findByName(String name);
    public List<Saison> findBySaisonId(Long saison_id);
}
