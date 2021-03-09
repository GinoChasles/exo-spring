package fr.gino.exo_spring.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @OneToMany(mappedBy = "saison")
    private List<Mois> mois;


}
