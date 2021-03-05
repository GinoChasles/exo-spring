package fr.gino.exo_spring.service;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Mois;
import fr.gino.exo_spring.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@Service
public class FruitServiceImpl implements FruitService {
@Autowired
    FruitRepository fruitRepository;

    @Override
    public Optional<Fruit> findById(Long id) {
        return fruitRepository.findById(id);
    }

    @Override
    public Fruit insert(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit update(Long id, Fruit fruit){
        Optional<Fruit> optionalFruit = this.findById(id);

        if(optionalFruit.isPresent()) {
            Fruit fruitToUpdate = optionalFruit.get();
            fruitToUpdate.setName(fruit.getName());
            return fruitRepository.save(fruitToUpdate);
        }
        return null;
    }

    @Override
    public Fruit delete(Long id){
        Optional<Fruit> fruit = this.findById(id);
        if (fruit.isPresent()) {
            fruitRepository.delete(fruit.get());
        }
        return null;
    }

    @Override
    public List<Fruit> findAll(){ return fruitRepository.findAll();}

//    @Override
  //  public Fruit addFruitToMois(Fruit fruit, Mois mois) {
    //    return fruitRepository.save(fruit);
    //}
}
