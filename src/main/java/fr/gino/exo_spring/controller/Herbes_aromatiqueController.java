package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Herbes_aromatique;
import fr.gino.exo_spring.service.Herbes_aromatiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/potager")
public class Herbes_aromatiqueController {
    @Autowired
    Herbes_aromatiqueService herbes_aromatiqueService;
    @GetMapping("/herbes/{id}")
    public ResponseEntity<Herbes_aromatique> findById(@PathVariable(value = "id") long id) {
        Optional<Herbes_aromatique> herbes_aromatiqueList;
        try {
            herbes_aromatiqueList = herbes_aromatiqueService.findById(id);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return herbes_aromatiqueList.map(herbes_aromatique -> ResponseEntity.ok().body(herbes_aromatique)).orElseGet(() -> ResponseEntity.notFound().build());
    }



}
