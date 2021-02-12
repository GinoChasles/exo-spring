package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.repository.FruitRepository;
import fr.gino.exo_spring.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/potager")
public class FruitController {
    @Autowired
    FruitService fruitService;

@CrossOrigin
    @GetMapping("/fruit/{id}")
    public ResponseEntity<Fruit> findById(@PathVariable(value = "id") long id){
        Optional<Fruit> fruitList;
        try {
            fruitList = fruitService.findById(id);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    return fruitList.map(fruit -> ResponseEntity.ok().body(fruit)).orElseGet(() -> ResponseEntity.notFound().build());
}
}
