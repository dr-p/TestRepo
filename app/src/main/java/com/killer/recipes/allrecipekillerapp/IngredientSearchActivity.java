package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class IngredientSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_search);

    }

    public void startIngredientSearch(View view) {
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
    }
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

