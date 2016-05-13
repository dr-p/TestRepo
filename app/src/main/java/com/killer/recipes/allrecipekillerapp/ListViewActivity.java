package com.killer.recipes.allrecipekillerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
