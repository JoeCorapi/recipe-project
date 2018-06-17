package com.ubnik.spring5.recipes.recipeproject.repositories;

import com.ubnik.spring5.recipes.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Joe Corapi on 6/16/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{

    Optional<Category> findByDescription(String description);
}
