package com.sam.spring5recipeapp.controller;

import com.sam.spring5recipeapp.domain.Category;
import com.sam.spring5recipeapp.domain.UnitOfMeasure;
import com.sam.spring5recipeapp.repository.CategoryRepository;
import com.sam.spring5recipeapp.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("category id : " + category.get().getId());
        System.out.println("unitOfMeasure id : " + unitOfMeasure.get().getId());

        return "index";
    }



}
