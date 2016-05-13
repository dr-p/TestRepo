package com.killer.recipes.allrecipekillerapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.*;
import java.lang.*;

import android.util.Log;

/**
 * Created by vidushikapoor on 5/6/16.
 */
public class IngredientSearchDisplay extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_search_result);
        String A = getIntent().getStringExtra("Ingredient1");
        String B = getIntent().getStringExtra("Ingredient2");
        String C = getIntent().getStringExtra("Ingredient3");
        String D = getIntent().getStringExtra("Ingredient4");
        TextView tv1 = (TextView) findViewById(R.id.TVIngredient);
        TextView tv2 = (TextView) findViewById(R.id.TVIngredient2);
        TextView tv3 = (TextView) findViewById(R.id.TVIngredient3);
        TextView tv4 = (TextView) findViewById(R.id.TVIngredient4);
        Log.d("TAG", tv1.toString());
        tv1.setText(A + ",");
        tv2.setText(B + ",");
        tv3.setText(C + ",");
        tv4.setText(D);


        String[] recipe1 = getResources().getStringArray(R.array.Recipe1);
        String[] recipe2 = getResources().getStringArray(R.array.Recipe2);
        String[] recipe3 = getResources().getStringArray(R.array.Recipe3);
        String[] recipe4 = getResources().getStringArray(R.array.Recipe4);
        String[] recipe5 = getResources().getStringArray(R.array.Recipe5);
        String[] ingredients = {A, B, C, D};

        if (Arrays.asList(recipe1).containsAll(Arrays.asList(ingredients))) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe1));
        }
        else if (Arrays.asList(recipe2).containsAll(Arrays.asList(ingredients))) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe2));
        }
        else if (Arrays.asList(recipe3).containsAll(Arrays.asList(ingredients))) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe3));
        }
        else if (Arrays.asList(recipe4).containsAll(Arrays.asList(ingredients))) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe4));
        }
        else if (Arrays.asList(recipe5).containsAll(Arrays.asList(ingredients))) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe5));
        }
        else {
            String message = "No activity_recipe_search_result found";
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(message);
        }
        /*  From Here
        for (int j = 0; j <= ingredients.length; j++) {
            while (i < recipe1.length) {
                if (Arrays.asList(recipe1[i]).contains(ingredients[j])) {
                    count1 = count1 + 1;
                    i = i + 1;
                } else {
                    i = i + 1;
                }
            }
            while (i < recipe2.length) {
                if (Arrays.asList(recipe2[i]).contains(ingredients[j])) {
                    count2 = count2 + 1;
                    i = i + 1;
                } else {
                    i = i + 1;
                }
            }
            while (i < recipe3.length) {
                if (Arrays.asList(recipe3[i]).contains(ingredients[j])) {
                    count3 = count3 + 1;
                    i = i + 1;
                } else {
                    i = i + 1;
                }
            }
            while (i < recipe4.length) {
                if (Arrays.asList(recipe4[i]).contains(ingredients[j])) {
                    count4 = count4 + 1;
                    i = i + 1;
                } else {
                    i = i + 1;
                }
            }
            while (i < recipe5.length) {
                if (Arrays.asList(recipe5[i]).contains(ingredients[j])) {
                    count5 = count5 + 1;
                    i = i + 1;
                } else {
                    i = i + 1;
                }
            }
        }
        if (count1 > 3) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe1));
        } else if (count2 > 3) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe2));
        } else if (count3 > 3) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe3));
        } else if (count4 > 3) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe4));
        } else if (count5 > 3) {
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(Arrays.toString(recipe5));
        } else {
            String message = "No activity_recipe_search_result found";
            TextView recipePrint = (TextView) findViewById(R.id.Recipe);
            recipePrint.setText(message);
        } To Here
        */
    }

}
