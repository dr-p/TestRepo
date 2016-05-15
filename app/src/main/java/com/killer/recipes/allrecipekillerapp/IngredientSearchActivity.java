package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IngredientSearchActivity extends AppCompatActivity {

    private ArrayList<ArrayList<String>> Ingredients = new ArrayList<>();
    private ArrayList<String> foundRecipes = new ArrayList<>();
    RecipeDataSource myDs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_search);
         myDs = new RecipeDataSource(this);
    }

    public void startIngredientSearch(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);

        String IngA;
        String IngB;
        String IngC;
        String IngD;

            IngA = editText1.getText().toString();

            IngB = editText2.getText().toString();

            IngC = editText3.getText().toString();

            IngD = editText4.getText().toString();


        //searchRecipesByIngredient(IngA, IngB, IngC, IngD);
        ArrayList<String> strTokens;
        for (int i = 0; i < myDs.getIngredientPool().size(); i++) {
            strTokens = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(myDs.getIngredientPool().get(i));
            while(st.hasMoreTokens()) {
                strTokens.add(st.nextToken());
            }
            Ingredients.add((ArrayList<String>) strTokens.clone());
        }

        for (int i = 0; i < Ingredients.size(); i++) {
            if (Ingredients.get(i).contains(IngA) || Ingredients.get(i).contains(IngB) || Ingredients.get(i).contains(IngC) || Ingredients.get(i).contains(IngD)) {
                //Recipes.setText(Recipes.getText() + " " + myDs.getRecipePool().get(i));
                foundRecipes.add(myDs.getRecipePool().get(i));
            }
        }
        Intent in = new Intent(getApplicationContext(), IngredientSearchResultsActivity.class);
        Bundle bun = new Bundle();
        bun.putStringArrayList("list", foundRecipes);
        in.putExtras(bun);
        startActivity(in);

    }

    /*
    public void searchRecipesByIngredient(String ing1, String ing2, String ing3, String ing4) {
        ArrayList<String> strTokens;
        for (int i = 0; i < myDs.getIngredientPool().size(); i++) {
            strTokens = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(myDs.getIngredientPool().get(i));
            while(st.hasMoreTokens()) {
                strTokens.add(st.nextToken());
            }
            Ingredients.add((ArrayList<String>) strTokens.clone());
        }

            for (int i = 0; i < Ingredients.size(); i++) {
                if (Ingredients.get(i).contains(ing1) || Ingredients.get(i).contains(ing2) || Ingredients.get(i).contains(ing3) || Ingredients.get(i).contains(ing4)) {
                    //Recipes.setText(Recipes.getText() + " " + myDs.getRecipePool().get(i));
                    foundRecipes.add(myDs.getRecipePool().get(i));
                }
            }
        Intent in = new Intent(getApplicationContext(), IngredientSearchResultsActivity.class);
        Bundle bun = new Bundle();
        bun.putStringArrayList("list", foundRecipes);
        in.putExtras(bun);
        startActivity(in);

        }*/
    }

    /*
     VIDUSHI
    public void searchByIngredient(View v) {
        if (v.getId() == R.id.buttonSearchIngredients) {
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            EditText editText2 = (EditText) findViewById(R.id.editText2);
            EditText editText3 = (EditText) findViewById(R.id.editText3);
            EditText editText4 = (EditText) findViewById(R.id.editText4);

            String IngA = null;
            if (editText1 != null) {
                IngA = editText1.getText().toString();
            }
            String IngB = null;
            if (editText2 != null) {
                IngB = editText2.getText().toString();
            }
            String IngC = null;
            if (editText3 != null) {
                IngC = editText3.getText().toString();
            }
            String IngD = null;
            if (editText4 != null) {
                IngD = editText4.getText().toString();
            }
            Intent i = new Intent(getApplicationContext(), RecipeSearchResultActivity.class);
            Bundle bun = new Bundle();
            bun.putString("Ingredient1", IngA);
            bun.putString("Ingredient2", IngB);
            bun.putString("Ingredient3", IngC);
            bun.putString("Ingredient4", IngD);

            i.putExtras(bun);
            /*
            i.putExtra("Ingredient1", IngA);
            i.putExtra("Ingredient2", IngB);
            i.putExtra("Ingredient3", IngC);
            i.putExtra("Ingredient4", IngD);
            startActivity(i);
       // }

    }
     VIDUSHI */

