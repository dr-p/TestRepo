package com.killer.recipes.allrecipekillerapp;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Christopher on 4/18/2016.
 */
public class RecipeDEPRECATED {
    public static final String TAG = "MyCookbook";

    public String titleText, summaryText, recipeImage, ingredientsText;

    private IngredientDEPRECATED[] ingredientDEPRECATEDs;


    public static class RecipeStep {
        /**
         * Constructor
         */
        RecipeStep() {}
        public String stepImage;
        public String stepText;

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(ConstantsDEPRECATED.RECIPE_FIELD_STEP_TEXT, stepText);
            bundle.putString(ConstantsDEPRECATED.RECIPE_FIELD_STEP_IMAGE, stepImage);
            return bundle;
        }

        public static RecipeStep fromBundle(Bundle bundle) {
            RecipeStep recipeStep = new RecipeStep();
            recipeStep.stepText = bundle.getString(ConstantsDEPRECATED.RECIPE_FIELD_STEP_TEXT);
            recipeStep.stepImage = bundle.getString(ConstantsDEPRECATED.RECIPE_FIELD_STEP_IMAGE);
            return recipeStep;
        }
    }

    ArrayList<RecipeStep> recipeSteps;

    public RecipeDEPRECATED() {
        recipeSteps = new ArrayList<RecipeStep>();
        this.titleText = "";
    }

    public static RecipeDEPRECATED fromJson(Context context, JSONObject json) {
        RecipeDEPRECATED recipeDEPRECATED = new RecipeDEPRECATED();
        try {
            recipeDEPRECATED.titleText = json.getString(ConstantsDEPRECATED.RECIPE_FIELD_TITLE);
            recipeDEPRECATED.summaryText = json.getString(ConstantsDEPRECATED.RECIPE_FIELD_SUMMARY);
            if (json.has(ConstantsDEPRECATED.RECIPE_FIELD_IMAGE)) {
                recipeDEPRECATED.recipeImage = json.getString(ConstantsDEPRECATED.RECIPE_FIELD_IMAGE);
            }
            JSONArray ingredients = json.getJSONArray(ConstantsDEPRECATED.RECIPE_FIELD_INGREDIENTS);
            recipeDEPRECATED.ingredientsText = "";
            /*
            for (int i = 0; i < ingredientDEPRECATEDs.length(); i++) {
                recipeDEPRECATED.ingredientsText += " - "
                        + ingredientDEPRECATEDs.getJSONObject(i).toString(ConstantsDEPRECATED.RECIPE_FIELD_TEXT) + "\n";
            }
            */
            JSONArray steps = json.getJSONArray(ConstantsDEPRECATED.RECIPE_FIELD_STEPS);
            for (int i = 0; i < steps.length(); i++) {
                JSONObject step = steps.getJSONObject(i);
                RecipeStep recipeStep = new RecipeStep();
                recipeStep.stepText = step.getString(ConstantsDEPRECATED.RECIPE_FIELD_TEXT);
                if (step.has(ConstantsDEPRECATED. RECIPE_FIELD_IMAGE)) {
                    recipeStep.stepImage = step.getString(ConstantsDEPRECATED.RECIPE_FIELD_IMAGE);
                }
                recipeDEPRECATED.recipeSteps.add(recipeStep);
            }
        }
        catch (JSONException e) {
            Log.e(TAG, "Error loading recipeDEPRECATED: " + e);
            return null;
        }
        return recipeDEPRECATED;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(ConstantsDEPRECATED.RECIPE_FIELD_TITLE, titleText);
        bundle.putString(ConstantsDEPRECATED.RECIPE_FIELD_SUMMARY, summaryText);
        bundle.putString(ConstantsDEPRECATED.RECIPE_FIELD_IMAGE, recipeImage);
        bundle.putString(ConstantsDEPRECATED.RECIPE_FIELD_INGREDIENTS, ingredientsText);

        if (recipeSteps != null) {
            ArrayList<Parcelable> stepBundles = new ArrayList<Parcelable>(recipeSteps.size());
            for (RecipeStep recipeStep : recipeSteps) {
                stepBundles.add(recipeStep.toBundle());
            }
            bundle.putParcelableArrayList(ConstantsDEPRECATED.RECIPE_FIELD_STEPS, stepBundles);
        }
        return bundle;
    }

    public static RecipeDEPRECATED fromBundle(Bundle bundle) {
        RecipeDEPRECATED recipeDEPRECATED = new RecipeDEPRECATED();
        recipeDEPRECATED.titleText = bundle.getString(ConstantsDEPRECATED.RECIPE_FIELD_TITLE);
        recipeDEPRECATED.summaryText = bundle.getString(ConstantsDEPRECATED.RECIPE_FIELD_SUMMARY);
        recipeDEPRECATED.recipeImage = bundle.getString(ConstantsDEPRECATED.RECIPE_FIELD_IMAGE);
        recipeDEPRECATED.ingredientsText = bundle.getString(ConstantsDEPRECATED.RECIPE_FIELD_INGREDIENTS);
        ArrayList<Parcelable> stepBundles =
                bundle.getParcelableArrayList(ConstantsDEPRECATED.RECIPE_FIELD_STEPS);
        if (stepBundles != null) {
            for (Parcelable stepBundle : stepBundles) {
                recipeDEPRECATED.recipeSteps.add(RecipeStep.fromBundle((Bundle) stepBundle));
            }
        }
        return recipeDEPRECATED;
    }
    public IngredientDEPRECATED[] getIngredientDEPRECATEDs(){
        return this.ingredientDEPRECATEDs;
    }
    public String getName() {
        return this.titleText;
    }
}
