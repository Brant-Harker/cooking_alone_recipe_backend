package com.cooking_alone.recipe_manager.controller;
import com.cooking_alone.recipe_manager.dto.RecipeDTO;
import com.cooking_alone.recipe_manager.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping("/save")
    public ResponseEntity<RecipeDTO> saveRecipe(@RequestBody RecipeDTO recipeDTO) {
        RecipeDTO returnDTO = recipeService.saveRecipe(recipeDTO);

        ResponseEntity<RecipeDTO> responseEntity = new ResponseEntity<>(returnDTO, HttpStatus.CREATED);

        return responseEntity;
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<RecipeDTO> readRecipe(@PathVariable String id){
        RecipeDTO returnDTO = recipeService.readRecipe(id);
        ResponseEntity<RecipeDTO> responseEntity = new ResponseEntity<>(returnDTO, HttpStatus.OK);
        return responseEntity;
    }
}
