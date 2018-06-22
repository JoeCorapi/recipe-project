package com.ubnik.spring5.recipes.recipeproject.services;

import com.ubnik.spring5.recipes.recipeproject.domain.Recipe;

import java.util.Set;

/**
 * Created by Joe Corapi on 6/21/2018.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
