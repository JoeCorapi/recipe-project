package com.ubnik.spring5.recipes.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Joe Corapi on 6/6/2018.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
        return"index";
    }
}
