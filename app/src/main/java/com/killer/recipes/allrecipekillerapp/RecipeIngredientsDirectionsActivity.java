package com.killer.recipes.allrecipekillerapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeIngredientsDirectionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_ingredients_directions);


        Bundle bun = getIntent().getExtras();
        TextView title = (TextView)findViewById(R.id.textViewRecipeName);
        TextView ingredients = (TextView)findViewById(R.id.textViewIngredients);
        TextView directions = (TextView)findViewById(R.id.textViewDirections);
        ImageView image = (ImageView)findViewById(R.id.imageViewRecipeInstructionWindow);

        if (bun != null) {
            title.setText(bun.getString("title"));
            ingredients.setText(bun.getString("ingredients"));
            directions.setText(bun.getString("directions"));
            Resources res = getResources();
            int resourceId = res.getIdentifier(bun.getString("title").replace(" ", "_").toLowerCase(), "drawable", getPackageName());
            image.setImageResource(resourceId);
        }
    }
}