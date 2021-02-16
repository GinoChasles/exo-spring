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
}