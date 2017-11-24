package com.sam.spring5recipeapp.service;

import com.sam.spring5recipeapp.commands.RecipeCommand;
import com.sam.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
