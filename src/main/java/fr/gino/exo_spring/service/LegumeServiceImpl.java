package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Legume;
import fr.gino.exo_spring.repository.LegumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LegumeServiceImpl implements LegumeService {
    @Autowired
    LegumeRepository legumeRepository;
    @Override
    public Optional<Legume> findById(Long id) {
        return legumeRepository.findById(id);
    }

    @Override
    public Legume insert(Legume legume) {
        return legumeRepository.save(legume);
    }

    @Override
    public Legume update(Long id, Legume legume) {
        Optional<Legume> optionalLegume = this.findById(id);
        if(optionalLegume.isPresent()){
            Legume legumeToUpdate = optionalLegume.get();
            legumeToUpdate.setName(legume.getName());
            return legumeRepository.save(legumeToUpdate);
        }
        return null;
    }

    @Override
    public Legume delete(Long id) {
        Optional<Legume> legume = this.findById(id);
        if(legume.isPresent()){
            legumeRepository.delete(legume.get());
        }
        return null;
    }
}
