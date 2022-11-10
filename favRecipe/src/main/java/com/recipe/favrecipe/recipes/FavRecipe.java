package com.recipe.favrecipe.recipes;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;

@Entity
@Table(name="favrecipe")
public class FavRecipe {
    @Id
    @JsonProperty
    String idMeal;
    String strMeal;
    String strCategory;
    String strMealThumb;


    public String getIdMeal() {
        return idMeal;
    }

    public void setIdMeal(String idMeal) {
        this.idMeal = idMeal;
    }

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrMealThumb() {
        return strMealThumb;
    }

    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    @Override
    public String toString() {
        return "FavRecipe{" +
                "idMeal='" + idMeal + '\'' +
                ", strMeal='" + strMeal + '\'' +
                ", strCategory='" + strCategory + '\'' +
                ", strMealThumb='" + strMealThumb + '\'' +
                '}';
    }

    public FavRecipe() {
    }

    public FavRecipe(String idMeal, String strMeal, String strCategory, String strMealThumb) {
        this.idMeal = idMeal;
        this.strMeal = strMeal;
        this.strCategory = strCategory;
        this.strMealThumb = strMealThumb;
    }
}
