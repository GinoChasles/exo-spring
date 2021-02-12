package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    FruitRepository repository;

    @Override
    public List<Fruit> findById(Long id) {
        return repository.findByFruitId(id);
    }

    @Override
    public List<Fruit> findByName(String name) {
        return repository.findByName(name);
    }
}
