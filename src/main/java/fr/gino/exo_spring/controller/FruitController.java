package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.repository.FruitRepository;
import fr.gino.exo_spring.service.FruitService;
import lombok.Value;
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
    public ResponseEntity<Fruit> findById(@PathVariable(value = "id") long id) {
        Optional<Fruit> fruitList;
        try {
            fruitList = fruitService.findById(id);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return fruitList.map(fruit -> ResponseEntity.ok().body(fruit)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @CrossOrigin
    @PostMapping("/fruit")
    ResponseEntity<Fruit> addFruit (@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(fruitService.insert(fruit));
    }

    @CrossOrigin
    @PutMapping("/fruit/{id}")
    ResponseEntity<Fruit> updateFruit(@PathVariable(value = "id") Long id, @RequestBody Fruit fruit){
        Fruit updateFruit = fruitService.update(id, fruit);
        if(updateFruit == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updateFruit);
    }
    @CrossOrigin
    @DeleteMapping("/fruit/{id}")
    ResponseEntity<Fruit> deleteFruit(@PathVariable(value = "id")Long id){
        Optional<Fruit> fruit = fruitService.findById(id);
        if(fruit.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        fruitService.delete(fruit.get().getId());
        return ResponseEntity.accepted().build();
    }

 /*   @CrossOrigin
    @GetMapping("/fruit/{id}/saison")
    public ResponseEntity<List<Fruit>> getAllFruit(@PathVariable(value = "id")long id) {
        List<Fruit> listFruit;
        try{
            listFruit = fruitService.findFruitsBySaisonId(id);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        //return listFruit.map(fruit -> ResponseEntity.ok().body(fruit));
        return ResponseEntity.ok().body(listFruit);
    }*/

}
