package com.recipe.favrecipe.recipes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.recipe.favrecipe.recipes.FavRecipe;

public record FavRecipeDto(
        @JsonProperty
        String idMeal,
        @JsonProperty
        String strMeal,
        @JsonProperty
        String strCategory,
        @JsonProperty
        String strMealThumb
) {


    public FavRecipeDto(FavRecipe favRecipe) {
        this(favRecipe.getIdMeal(), favRecipe.getStrMeal(), favRecipe.getStrCategory(), favRecipe.strMealThumb);
    }
}
