package fr.gino.exo_spring.model;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Herbes_aromatique {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;

    private String name;


}
