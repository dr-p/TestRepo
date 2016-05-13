package com.killer.recipes.allrecipekillerapp;

import java.util.ArrayList;

public class RecipeDataSource {
    /**
     * Create 3 array lists. 1 for recipe titles, 1 for recipe descriptions, 1 for recipe images
     */
    private ArrayList<Integer> photoPool;
    private ArrayList<Integer> descriptionPool;
    private ArrayList<Integer> recipePool;

    /**
     * @return the photoPool the photo pool of recipe images
     */
    public ArrayList<Integer> getPhotoPool() {
        return photoPool;
    }

    /**
     * @return the descriptionPool the description pool of recipe descriptions
     */
    public ArrayList<Integer> getDescriptionPool() {
        return descriptionPool;
    }

    /**
     * @return the recipePool the recipe pool of recipes
     */
    public ArrayList<Integer> getRecipePool() {
        return recipePool;
    }

    /**
     * Constructor
     */
    public RecipeDataSource() {
        photoPool = new ArrayList<Integer>();
        descriptionPool = new ArrayList<Integer>();
        recipePool = new ArrayList<Integer>();
        //load the array lists when you construct a RecipeDataSource
        setupPhotoPool();
        setupRecipePool();
        setupDescriptionPool();
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

    public void setupRecipePool() {
        recipePool.add(R.string.recipe1);
        recipePool.add(R.string.recipe2);
        recipePool.add(R.string.recipe3);
        recipePool.add(R.string.recipe4);
        recipePool.add(R.string.recipe5);
        recipePool.add(R.string.recipe6);
        recipePool.add(R.string.recipe7);
        recipePool.add(R.string.recipe8);
        recipePool.add(R.string.recipe9);
        recipePool.add(R.string.recipe10);
        recipePool.add(R.string.recipe11);
        recipePool.add(R.string.recipe12);
        recipePool.add(R.string.recipe13);
    }

    public void setupDescriptionPool() {
        descriptionPool.add(R.string.description1);
        descriptionPool.add(R.string.description2);
        descriptionPool.add(R.string.description3);
        descriptionPool.add(R.string.description4);
        descriptionPool.add(R.string.description5);
        descriptionPool.add(R.string.description6);
        descriptionPool.add(R.string.description7);
        descriptionPool.add(R.string.description8);
        descriptionPool.add(R.string.description9);
        descriptionPool.add(R.string.description10);
        descriptionPool.add(R.string.description11);
        descriptionPool.add(R.string.description12);
        descriptionPool.add(R.string.description13);
    }

    public int getDataSourceLength() {
        return recipePool.size();
    }
}
