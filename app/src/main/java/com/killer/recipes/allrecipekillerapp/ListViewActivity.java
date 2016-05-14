package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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


        /*
        recipesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = parent.getItemAtPosition(position).getClass().getTitle().toString();
                RecipeDataSource item1 = (RecipeDataSource)parent.getAdapter().getItem(1);
                String item = ((TextView)view).getText().toString();
                String selectedFromList = (lv.getItemAtPosition(position));

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

            }
        });*/
    }

    /*
    public void callRecipeView(View view) {
        Intent intent = new Intent(getApplicationContext(), ActivityDisplayRecipe.class);
        Bundle bun = new Bundle();
        //int index = myDs.getRecipePool().indexOf(recipesListView.)
        //bun.putString("title", myDs.getRecipePool());
        //bun.putString("title", model.getTitle());
        //bun.putString("description", model.getDescription());
        intent.putExtras(bun);
        startActivity(intent);
    }*/

}