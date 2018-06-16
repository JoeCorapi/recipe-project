package com.ubnik.spring5.recipes.recipeproject.repositories;

import com.ubnik.spring5.recipes.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Joe Corapi on 6/16/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
