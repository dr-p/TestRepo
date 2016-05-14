package com.killer.recipes.allrecipekillerapp;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDisplayRecipe extends AppCompatActivity {

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
            title.setText(bun.getString("title"));
            description.setText(bun.getString("description"));
            Resources res = getResources();
            int resourceId = res.getIdentifier(bun.getString("title").replace(" ", "_").toLowerCase(), "drawable", getPackageName());
            image.setImageResource(resourceId);
        }
    }
}
