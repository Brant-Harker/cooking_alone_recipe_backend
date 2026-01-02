package com.cooking_alone.recipe_manager.service.impl;

import com.cooking_alone.recipe_manager.dto.RecipeDTO;
import com.cooking_alone.recipe_manager.service.RecipeService;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Override
    public RecipeDTO saveRecipe(RecipeDTO recipeDTO) {
        System.out.println(recipeDTO.getBody());

        return recipeDTO;
    }
}
