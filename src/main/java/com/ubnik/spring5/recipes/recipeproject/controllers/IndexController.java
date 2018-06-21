package com.ubnik.spring5.recipes.recipeproject.controllers;

import com.ubnik.spring5.recipes.recipeproject.domain.Category;
import com.ubnik.spring5.recipes.recipeproject.domain.UnitOfMeasure;
import com.ubnik.spring5.recipes.recipeproject.repositories.CategoryRepository;
import com.ubnik.spring5.recipes.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Joe Corapi on 6/6/2018.
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category ID is: "+ categoryOptional.get().getId());
        System.out.println("UoM ID is: " + unitOfMeasureOptional.get().getId());

        return"index";
    }
}
