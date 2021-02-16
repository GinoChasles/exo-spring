package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService {
@Autowired
    FruitRepository fruitRepository;

    @Override
    public Optional<Fruit> findById(Long id) {
        return fruitRepository.findById(id);
    }
}
