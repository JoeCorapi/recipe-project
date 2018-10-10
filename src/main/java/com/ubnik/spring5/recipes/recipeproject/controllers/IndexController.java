package com.ubnik.spring5.recipes.recipeproject.controllers;

import com.ubnik.spring5.recipes.recipeproject.domain.Category;
import com.ubnik.spring5.recipes.recipeproject.domain.UnitOfMeasure;
import com.ubnik.spring5.recipes.recipeproject.repositories.CategoryRepository;
import com.ubnik.spring5.recipes.recipeproject.repositories.UnitOfMeasureRepository;
import com.ubnik.spring5.recipes.recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Joe Corapi on 6/6/2018.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model){
        log.debug("Passing model through controller to view");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
