package fr.gino.exo_spring.controller;

import fr.gino.exo_spring.model.Legume;
import fr.gino.exo_spring.service.LegumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/potager")
@CrossOrigin("*")
public class LegumeController {

    @Autowired
    LegumeService service;

    @GetMapping("/legume/{id}")
    public ResponseEntity<List<Legume>> FindById(@PathVariable(value = "id") long id){
        List<Legume> legumeList;
        try{
            legumeList = service.findById(id);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(legumeList);
    }
}
