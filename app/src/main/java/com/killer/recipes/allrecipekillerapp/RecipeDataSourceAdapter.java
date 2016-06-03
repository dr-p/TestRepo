package com.killer.recipes.allrecipekillerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecipeDataSourceAdapter extends BaseAdapter {
    private Context myContext;
    private LayoutInflater myInflator;
    private RecipeDataSource myDataSource;
    // Mei was here

    /**
     * Constructor
     * @param ctxt
     * @param recipeDataSource
     */
    public RecipeDataSourceAdapter(Context ctxt, RecipeDataSource recipeDataSource) {
        myContext = ctxt;
        myDataSource = recipeDataSource;
        myInflator = (LayoutInflater)myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

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
        thumbNail.setImageResource(myDataSource.getPhotoPool().get(position));
        name = (TextView)convertView.findViewById(R.id.text);
        name.setText(myDataSource.getRecipePool().get(position));

        return convertView;
    }
}