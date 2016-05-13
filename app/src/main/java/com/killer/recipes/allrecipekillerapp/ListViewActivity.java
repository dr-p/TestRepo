package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    private RecipeDataSource myDs;
    private ListView recipesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        myDs = new RecipeDataSource();
        recipesListView = (ListView)findViewById(R.id.listView);
        recipesListView.setAdapter(new RecipeDataSourceAdapter(this.getApplicationContext(), this.myDs));
    }

    public void callRecipeView(View view) {
        Intent intent = new Intent(getApplicationContext(), ActivityDisplayRecipe.class);
        Bundle bun = new Bundle();
        //int index = myDs.getRecipePool().indexOf(recipesListView.)
        //bun.putString("title", myDs.getRecipePool());
        //bun.putString("title", model.getTitle());
        //bun.putString("description", model.getDescription());
        intent.putExtras(bun);
        startActivity(intent);
    }
}