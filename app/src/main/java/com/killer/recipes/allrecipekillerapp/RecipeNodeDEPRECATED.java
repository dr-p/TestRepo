package com.killer.recipes.allrecipekillerapp;

/**
 * Created by Chris on 5/13/2016.
 */
public class RecipeNodeDEPRECATED {
    public RecipeDEPRECATED data;

    // these variables allow this class to act as a tree node
    public RecipeNodeDEPRECATED left;
    public RecipeNodeDEPRECATED right;

    public RecipeNodeDEPRECATED(RecipeDEPRECATED rec)
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