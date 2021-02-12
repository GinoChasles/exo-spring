package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Mois;
import fr.gino.exo_spring.repository.MoisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoisServiceImpl implements MoisService {

    @Autowired
    private MoisRepository repository;

    @Override
    public List<Mois> findById(long id) {
        return repository.findByMoisId(id);
    }

    @Override
    public List<Mois> findByName(String name) {
        return repository.findByName(name);
    }
}
