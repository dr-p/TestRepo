package com.killer.recipes.allrecipekillerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Chris on 5/15/2016.
 */
public class RecipeIngredientSearchAdapter extends BaseAdapter {
    private Context myContext;
    private LayoutInflater myInflator;
    private RecipeDataSource myDataSource;
    private ArrayList<String> foundRecipes;
    /**
     * Constructor
     * @param ctxt
     * @param recipeDataSource
     */
    public RecipeIngredientSearchAdapter(Context ctxt, RecipeDataSource recipeDataSource, ArrayList<String> recipes) {
        myContext = ctxt;
        myDataSource = recipeDataSource;
        myInflator = (LayoutInflater)myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        foundRecipes = recipes;
    }

    @Override
    public int getCount() {
        return myDataSource.getDataSourceLength();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView thumbNail;
        TextView name;

        if(convertView == null) {
            convertView = myInflator.inflate(R.layout.list_item_layout, parent, false);
        }

        thumbNail = (ImageView)convertView.findViewById(R.id.thumb);
        name = (TextView)convertView.findViewById(R.id.text);


        for (int i = 0; i < foundRecipes.size(); i++) {
            if (foundRecipes.contains(myDataSource.getRecipePool().get(position))) {

                name.setText((myDataSource.getRecipePool().get(position)));
                thumbNail.setImageResource(myDataSource.getPhotoPool().get(position));
            }
        }
        return convertView;
    }
}
