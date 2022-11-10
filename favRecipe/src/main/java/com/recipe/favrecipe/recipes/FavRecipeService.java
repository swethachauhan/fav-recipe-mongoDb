package com.recipe.favrecipe.recipes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavRecipeService {

    FavRecipeRepository repo;

    public FavRecipeService(FavRecipeRepository repo) {
        this.repo = repo;
    }

    public FavRecipeDto addFavRecipe(FavRecipe favRecipe) {
        return new FavRecipeDto(repo.addFavRecipe(favRecipe));

    }

    public List<FavRecipeDto> getFavRecipes() {

        return repo.getFavRecipes().stream()
                .map(recipe -> new FavRecipeDto(recipe)).toList();


    }

    public void removeFav(String id) {
        repo.removeFav(id);
    }
}
