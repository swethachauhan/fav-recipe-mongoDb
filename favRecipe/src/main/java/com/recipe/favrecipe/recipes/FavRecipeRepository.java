package com.recipe.favrecipe.recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FavRecipeRepository {

    JpaFavRecipeRepository repo;

    @Autowired
    public FavRecipeRepository(JpaFavRecipeRepository repo) {
        this.repo = repo;
    }

    public FavRecipe addFavRecipe(FavRecipe favRecipe) {
        return repo.save(favRecipe);
    }

    public List<FavRecipe> getFavRecipes() {
        return (List<FavRecipe>) repo.findAll();

    }
    public void removeFav(String id) {
        repo.deleteById(id);
    }
}
