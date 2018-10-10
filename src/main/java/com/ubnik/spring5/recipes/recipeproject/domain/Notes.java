package com.ubnik.spring5.recipes.recipeproject.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Joe Corapi on 6/14/2018.
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
