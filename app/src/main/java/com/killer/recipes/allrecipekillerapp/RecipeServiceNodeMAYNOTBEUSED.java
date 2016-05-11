package com.killer.recipes.allrecipekillerapp;

/**
 * Created by Christopher on 4/18/2016.
 */
public class RecipeServiceNodeMAYNOTBEUSED {
    public RecipeMAYNOTBEUSED data;

    // these variables allow this class to act as a tree node
    public RecipeServiceNodeMAYNOTBEUSED left;
    public RecipeServiceNodeMAYNOTBEUSED right;

    public RecipeServiceNodeMAYNOTBEUSED(RecipeMAYNOTBEUSED rec)
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
//test commit
//steven was here