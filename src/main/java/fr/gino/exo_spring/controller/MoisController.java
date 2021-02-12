package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Fruit;
import fr.gino.exo_spring.model.Mois;
import fr.gino.exo_spring.service.MoisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/mois")
public class MoisController {

    @Autowired
    MoisService moisService;

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Mois> findById(@PathVariable(value = "id") long id){
        Optional<Mois> moisList;
        try {
            moisList = moisService.findById(id);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return moisList.map(mois -> ResponseEntity.ok().body(mois)).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
