package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Saison;
import fr.gino.exo_spring.repository.SaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaisonServiceImpl implements SaisonService{

    @Autowired
    private SaisonRepository repository;

    @Override
    public List<Saison> findById(long id) {
        return repository.findBySaisonId(id);
    }

    @Override
    public List<Saison> findByName(String name) {
        return repository.findByName(name);
    }
}
