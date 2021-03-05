package fr.gino.exo_spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;

    private String name;


    @ManyToMany
    @JoinTable(name = "fruit_mois",
            joinColumns = @JoinColumn(name = "fruit_id"),
            inverseJoinColumns = @JoinColumn(name = "mois_id")
    )
    List<Mois> mois;
}


