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

    @Override
    public RecipeDTO readRecipe(String uuid) {
        RecipeDTO dummy = new RecipeDTO();
        dummy.setBody("Step 1: Shake your bacon");
        return dummy;
    }
}
