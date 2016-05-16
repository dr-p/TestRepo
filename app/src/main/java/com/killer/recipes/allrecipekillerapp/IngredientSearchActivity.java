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
        EditText eTextFieldUno = (EditText) findViewById(R.id.editText1);
        EditText eTextFieldDos = (EditText) findViewById(R.id.editText2);
        EditText eTextFieldTres = (EditText) findViewById(R.id.editText3);
        EditText eTextFieldCuatro = (EditText) findViewById(R.id.editText4);

        String ingredientA, ingredientB, ingredientC, ingredientD;

            ingredientA = eTextFieldUno.getText().toString();
            ingredientB = eTextFieldDos.getText().toString();
            ingredientC = eTextFieldTres.getText().toString();
            ingredientD = eTextFieldCuatro.getText().toString();


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
            if (Ingredients.get(i).contains(ingredientA) || Ingredients.get(i).contains(ingredientB) || Ingredients.get(i).contains(ingredientC) || Ingredients.get(i).contains(ingredientD)) {
                foundRecipes.add(myDs.getRecipePool().get(i));
            }
        }
        Intent in = new Intent(getBaseContext(), IngredientSearchResultsActivity.class);
        Bundle bun = new Bundle();
        bun.putStringArrayList("list", foundRecipes);
        in.putExtras(bun);
        startActivity(in);

    }

    }

