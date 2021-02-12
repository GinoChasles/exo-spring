package fr.gino.exo_spring.service;
import fr.gino.exo_spring.model.Legume;
import fr.gino.exo_spring.model.Saison;
import fr.gino.exo_spring.repository.LegumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegumeServiceImpl implements LegumeService{

    @Autowired
    LegumeRepository repository;

    @Override
    public List<Legume> findById(long id) {
        return repository.findLegumeById(id);
    }

    @Override
    public List<Legume> findByName(String name) {
        return repository.findByName(name);
    }
}
