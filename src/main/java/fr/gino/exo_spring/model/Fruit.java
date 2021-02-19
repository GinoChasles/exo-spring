package fr.gino.exo_spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;

    private String name;

    @ManyToMany(mappedBy = "fruits")
    private List<Mois> moisList;
}


