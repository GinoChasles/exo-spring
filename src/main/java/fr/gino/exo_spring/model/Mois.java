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

public class Mois {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToOne @JoinColumn(name = "saison_id")
    @JsonBackReference
    private Saison saison;

    @ManyToMany(mappedBy = "mois")
    private List<Fruit> fruitList;

    @ManyToMany
    @JoinTable(name = "mois_legume",
            joinColumns = @JoinColumn(name = "mois_id"),
            inverseJoinColumns = @JoinColumn(name = "legume_id")
    )
    List<Legume> legumes;
}