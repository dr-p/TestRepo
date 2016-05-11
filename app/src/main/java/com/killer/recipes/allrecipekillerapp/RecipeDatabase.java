package com.killer.recipes.allrecipekillerapp;

/**
 * Created by Chris on 5/11/2016.
 */
public class RecipeDatabase {

    private String title;
    private String description;
    public RecipeDatabase() {
        this.title = "Grilled Chicken With Lemon";
        this.description = "Grilled Chicken with Lemon is a entre made to taste using various herbs. It's strongest flavor is lime";
    }

    public String getTitle() {
        return this.title;
    }
    public String getDescription() {
        return this.description;
    }
}
