package com.ubnik.spring5.recipes.recipeproject.domain;

/**
 * Created by Joe Corapi on 6/14/2018.
 */
public class Notes {

    private Recipe recipe;
    private String recipeNotes;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
