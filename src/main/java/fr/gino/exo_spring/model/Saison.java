package fr.gino.exo_spring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Saison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String name;

    @OneToMany(mappedBy = "saison",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private List<Mois> moiss;

    @OneToMany(mappedBy="saison",
            cascade = CascadeType.ALL)
    private List<Fruit> fruits;

    @OneToMany(mappedBy="saison",
            cascade = CascadeType.ALL)
    private List<Legume> legumes;
}
