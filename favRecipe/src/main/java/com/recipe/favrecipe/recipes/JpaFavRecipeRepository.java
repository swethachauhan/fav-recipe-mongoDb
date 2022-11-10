package com.recipe.favrecipe.recipes;


import com.recipe.favrecipe.recipes.FavRecipe;
import org.springframework.data.repository.CrudRepository;


public interface JpaFavRecipeRepository extends CrudRepository<FavRecipe, String> {
}
