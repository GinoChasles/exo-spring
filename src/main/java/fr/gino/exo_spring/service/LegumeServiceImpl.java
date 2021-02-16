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
}
