package fr.gino.exo_spring.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Legume {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;

    private String name;
    @ManyToOne @JoinColumn(name = "saison_id")
    private Saison saison;


}