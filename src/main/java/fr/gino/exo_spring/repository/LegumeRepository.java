package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Legume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LegumeRepository extends JpaRepository<Legume, Long> {
    public List<Legume> findByName(String name);
    public List<Legume> findLegumeById (Long Legume_id);
}
