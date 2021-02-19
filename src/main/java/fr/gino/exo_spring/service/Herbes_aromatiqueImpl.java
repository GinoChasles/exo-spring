package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Herbes_aromatique;
import fr.gino.exo_spring.repository.Herbes_aromatiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class Herbes_aromatiqueImpl implements Herbes_aromatiqueService {
    @Autowired
    Herbes_aromatiqueRepository herbes_aromatiqueRepository;
    @Override
    public Optional<Herbes_aromatique> findById(long id){
return herbes_aromatiqueRepository.findById(id);
};

}
