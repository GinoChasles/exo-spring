package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Mois;
import fr.gino.exo_spring.repository.FruitRepository;
import fr.gino.exo_spring.repository.MoisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MoisServiceImpl implements MoisService {
    @Autowired
    MoisRepository moisRepository;

    @Override
    public Optional<Mois> findById(Long id) {
        return moisRepository.findById(id);
    }
}
