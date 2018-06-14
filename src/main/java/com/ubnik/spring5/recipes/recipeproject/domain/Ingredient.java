package com.ubnik.spring5.recipes.recipeproject.domain;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * Created by Joe Corapi on 6/14/2018.
 */
@Entity
public class Ingredient {

    private String description;
    private BigDecimal amount;

    private Recipe recipe;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
