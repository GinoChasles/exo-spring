package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Saison;
import fr.gino.exo_spring.repository.SaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaisonServiceImpl implements SaisonService {
    @Autowired
    SaisonRepository saisonRepository;

    @Override
    public Optional<Saison> findById(Long id) {return saisonRepository.findById(id);}


}
