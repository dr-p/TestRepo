package com.killer.recipes.allrecipekillerapp;

/**
 * Created by Christopher on 4/18/2016.
 */
public class RecipeServiceNode {
    public Recipe data;

    // these variables allow this class to act as a tree node
    public RecipeServiceNode left;
    public RecipeServiceNode right;

    public RecipeServiceNode(Recipe rec)
    {
        this.data = rec;
    }

    // accessors and mutators

    @Override
    public String toString()
    {
        return this.data.toString() + " ";
    }
}
