package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Saison;
import fr.gino.exo_spring.service.SaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/saison")
public class SaisonController {
    @Autowired
    SaisonService saisonService;

    @CrossOrigin
    @GetMapping("/fruit/{id}")
    public ResponseEntity<Saison> findById(@PathVariable(value = "id")long id){
        Optional<Saison> saisonList;
        try {
            saisonList = saisonService.findById(id);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return saisonList.map(saison -> ResponseEntity.ok().body(saison)).orElseGet(()-> ResponseEntity.notFound().build());
    }
}
