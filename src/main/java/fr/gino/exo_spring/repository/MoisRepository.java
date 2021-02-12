package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Mois;
import fr.gino.exo_spring.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MoisRepository extends JpaRepository<Mois, Long> {

    public List<Mois> findByName(String name);
    public List<Mois> findByMoisId(Long mois_id);

}
