package com.recipe.favrecipe.recipes;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/recipes")
public class FavRecipeController {

    FavRecipeService service;

    public FavRecipeController(FavRecipeService service) {
        this.service = service;
    }

    @PostMapping
    ResponseEntity<FavRecipeDto> createTodo(@RequestBody FavRecipeDto favRecipeDto){

        FavRecipeDto dto = service.addFavRecipe(new FavRecipe(favRecipeDto.idMeal(), favRecipeDto.strMeal(), favRecipeDto.strCategory(), favRecipeDto.strMealThumb()));
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    ResponseEntity< List<FavRecipeDto>> getTodos(){

        List<FavRecipeDto> listDto = service.getFavRecipes();

        return ResponseEntity.ok(listDto);
    }


    @DeleteMapping("/{id}")
    ResponseEntity removeFromFavourites(@PathVariable String id){
        service.removeFav(id);

        return ResponseEntity.noContent().build();
    }

}
