package com.killer.recipes.allrecipekillerapp;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

public class RecipeDataSource{
    /**
     * Create 3 array lists. 1 for activity_recipe_search_result titles, 1 for activity_recipe_search_result descriptions, 1 for activity_recipe_search_result images
     */
    private ArrayList<Integer> photoPool;
    private ArrayList<Integer> photoPoolClone;
    private ArrayList<String> descriptionPool;
    private ArrayList<String> recipePool;
    private ArrayList<String> recipePoolClone;
    private ArrayList<String> instructionPool;
    private ArrayList<String> ingredientPool;
    private Context appCon;

    /**
     * @return the photoPool the photo pool of activity_recipe_search_result images
     */
    public ArrayList<Integer> getPhotoPool() {
        return photoPool;
    }

    /**
     * @return the descriptionPool the description pool of activity_recipe_search_result descriptions
     */
    public ArrayList<String> getDescriptionPool() {
        return descriptionPool;
    }

    /**
     * @return the recipePool the activity_recipe_search_result pool of recipes
     */
    public ArrayList<String> getRecipePool() {
        return recipePool;
    }

    /**
     * @return the instructionpool the instructions for the recipes
     */
    public ArrayList<String> getInstructionPool() { return instructionPool; }

    /**
     * @return the ingredientpool the ingredients for the recipes
     */
    public ArrayList<String> getIngredientPool() { return ingredientPool; }

    /**
     * Constructor
     */
    public RecipeDataSource(Context con) {
        photoPool = new ArrayList<>();
        descriptionPool = new ArrayList<>();
        recipePool = new ArrayList<>();
        this.appCon = con;
        ingredientPool = new ArrayList<>();
        instructionPool = new ArrayList<>();
        setupPhotoPool();
        setupRecipePool();
        setupDescriptionPool();
        setupIngredientPool();
        setupInstructionPool();
        recipePoolClone = new ArrayList<>();
        photoPoolClone = new ArrayList<>();
    }

    public void setupPhotoPool() {
        photoPool.add(R.drawable.chicken_noodle_soup);
        photoPool.add(R.drawable.lentil_soup);
        photoPool.add(R.drawable.hot_artichoke_dip);
        photoPool.add(R.drawable.guacamole);
        photoPool.add(R.drawable.crispy_edamame);
        photoPool.add(R.drawable.grilled_chicken_with_lemon);
        photoPool.add(R.drawable.spinach_enchiladas);
        photoPool.add(R.drawable.vegetable_lasagna);
        photoPool.add(R.drawable.penne_pasta_salad);
        photoPool.add(R.drawable.red_lentil_curry);
        photoPool.add(R.drawable.lemon_bars);
        photoPool.add(R.drawable.strawberry_shortcake);
        photoPool.add(R.drawable.chocolate_cupcakes);
    }
    public void setupPhotoPoolClone(ArrayList<String> found) {
        for (int i = 0; i < recipePool.size(); i++) {
            if (found.contains(recipePool.get(i))) {
                photoPoolClone.add(photoPool.get(i));
            } else {
                photoPoolClone.add(R.drawable.dummy);
            }
        }
    }
    public ArrayList<Integer> getPhotoPoolClone() {
        return photoPoolClone;
    }

    public void setupRecipePool() {

        recipePool.add(this.appCon.getResources().getString((R.string.recipe1)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe2)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe3)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe4)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe5)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe6)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe7)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe8)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe9)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe10)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe11)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe12)));
        recipePool.add(this.appCon.getResources().getString((R.string.recipe13)));
    }
    public void setupRecipePoolClone(ArrayList<String> found) {

        for (int i = 0; i < recipePool.size(); i++) {
            if (found.contains(recipePool.get(i))) {
                recipePoolClone.add(recipePool.get(i));
            } else {
                recipePoolClone.add("");
            }
        }
    }
    public ArrayList<String> getRecipePoolClone() {
        return recipePoolClone;
    }

    public void setupDescriptionPool() {
        descriptionPool.add(this.appCon.getResources().getString(R.string.description1));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description2));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description3));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description4));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description5));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description6));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description7));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description8));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description9));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description10));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description11));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description12));
        descriptionPool.add(this.appCon.getResources().getString(R.string.description13));
    }

    public void setupInstructionPool() {
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction1));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction2));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction3));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction4));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction5));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction6));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction7));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction8));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction9));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction10));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction11));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction12));
        instructionPool.add(this.appCon.getResources().getString(R.string.instruction13));
    }

    public void setupIngredientPool() {
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient1));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient2));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient3));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient4));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient5));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient6));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient7));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient8));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient9));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient10));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient11));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient12));
        ingredientPool.add(this.appCon.getResources().getString(R.string.ingredient13));
    }

    public int getDataSourceLength() {
        return recipePool.size();
    }
}
