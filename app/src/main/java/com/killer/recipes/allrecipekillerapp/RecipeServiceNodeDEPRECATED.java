package com.killer.recipes.allrecipekillerapp;

/**
 * Created by Christopher on 4/18/2016.
 */
public class RecipeServiceNodeDEPRECATED {
    public RecipeDEPRECATED data;

    // these variables allow this class to act as a tree node
    public RecipeServiceNodeDEPRECATED left;
    public RecipeServiceNodeDEPRECATED right;

    public RecipeServiceNodeDEPRECATED(RecipeDEPRECATED rec)
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