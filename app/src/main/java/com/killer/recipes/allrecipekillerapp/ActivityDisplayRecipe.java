package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDisplayRecipe extends AppCompatActivity {

    private String ingredients;
    private String directions;
    private String recipeName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_recipe);


        /* Code to get data out of the bundle passed from main activity */
        Bundle bun = getIntent().getExtras();
        TextView title = (TextView)findViewById(R.id.titleTextView);
        TextView description = (TextView)findViewById(R.id.descriptionTextView);
        ImageView image = (ImageView)findViewById(R.id.recipeImageView);
        if (bun != null) {
            this.ingredients = bun.getString("ingredients");
            this.directions = bun.getString("directions");
            this.recipeName = bun.getString("title");
            title.setText(bun.getString("title"));
            description.setText(bun.getString("description"));
            Resources res = getResources();
            int resourceId = res.getIdentifier(bun.getString("title").replace(" ", "_").toLowerCase(), "drawable", getPackageName());
            image.setImageResource(resourceId);
        }
    }
    public void viewRecipeDirections(View view) {
        Intent intent = new Intent(getApplicationContext(), RecipeIngredientsDirectionsActivity.class);
        Bundle bund = new Bundle();
        bund.putString("ingredients", this.ingredients);
        bund.putString("directions", this.directions);
        bund.putString("title", this.recipeName);
        intent.putExtras(bund);
        startActivity(intent);
    }
}