package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



public class IngredientSearchResultsActivity extends AppCompatActivity {



    private RecipeDataSource myDs;
    private ListView recipesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        myDs = new RecipeDataSource(this);
        recipesListView = (ListView)findViewById(R.id.listView);
        Bundle bun = getIntent().getExtras();
        recipesListView.setAdapter(new RecipeIngredientSearchAdapter(this.getApplicationContext(), this.myDs, bun.getStringArrayList("list")));

        recipesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                int index = myDs.getRecipePool().indexOf(myDs.getRecipePool().get(position));
                Intent intent = new Intent(getApplicationContext(), ActivityDisplayRecipe.class);
                Bundle bun = new Bundle();
                bun.putString("title", myDs.getRecipePool().get(index));
                bun.putString("description", myDs.getDescriptionPool().get(index));
                bun.putString("ingredients", myDs.getIngredientPool().get(index));
                bun.putString("directions", myDs.getInstructionPool().get(index));
                intent.putExtras(bun);
                startActivity(intent);
            }
        });
    }

}
