package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/potager")
@CrossOrigin("*")
public class FruitController {

    @Autowired
    FruitService service;

    @GetMapping("/fruit/{id}")
    public ResponseEntity<List<Fruit>> findById(@PathVariable(value = "id") long id){
        List<Fruit> fruitList;
        try {
            fruitList = service.findById(id);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(fruitList);
    };
}
