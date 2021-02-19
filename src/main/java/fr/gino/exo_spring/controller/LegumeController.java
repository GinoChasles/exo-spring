package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Legume;
import fr.gino.exo_spring.service.LegumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/potager")

public class LegumeController {

    @Autowired
    LegumeService legumeService;

    @CrossOrigin
    @GetMapping("/legume/{id}")
    public ResponseEntity<Legume> findById(@PathVariable(value = "id") long id){
        Optional<Legume> legumeList;
        try{
            legumeList = legumeService.findById(id);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return legumeList.map(legume -> ResponseEntity.ok().body(legume)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @CrossOrigin
    @PostMapping("/legume")
    ResponseEntity<Legume> addLegume (@RequestBody Legume legume){
        return ResponseEntity.ok().body(legumeService.insert(legume));
    }

    @CrossOrigin
    @PutMapping("/legume/{id}")
    ResponseEntity<Legume> updateLegume(@PathVariable(value = "id") Long id, @RequestBody Legume legume){
        Legume updateLegume = legumeService.update(id, legume);
        if(updateLegume == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updateLegume);
    }

    @CrossOrigin
    @DeleteMapping("/legume/{id}")
    ResponseEntity<Legume> deleteLegume(@PathVariable (value = "id") Long id){
        Optional<Legume> legume = legumeService.findById(id);
        if(legume.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        legumeService.delete(legume.get().getId());
        return ResponseEntity.accepted().build();
    }

}