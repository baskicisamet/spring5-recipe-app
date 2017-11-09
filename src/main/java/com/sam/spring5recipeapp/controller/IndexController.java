package com.sam.spring5recipeapp.controller;

import com.sam.spring5recipeapp.domain.Category;
import com.sam.spring5recipeapp.domain.UnitOfMeasure;
import com.sam.spring5recipeapp.repository.CategoryRepository;
import com.sam.spring5recipeapp.repository.UnitOfMeasureRepository;
import com.sam.spring5recipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

       model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }



}
