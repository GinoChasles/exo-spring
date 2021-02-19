package fr.gino.exo_spring.repository;

import fr.gino.exo_spring.model.Herbes_aromatique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Herbes_aromatiqueRepository extends JpaRepository<Herbes_aromatique, Long> {

}
