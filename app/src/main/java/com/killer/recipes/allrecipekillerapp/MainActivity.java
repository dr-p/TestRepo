package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Does any changes I make show up?
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setTextViewMainDatabase(View view) {
        RecipeService serv = new RecipeService();
        for (int i = 0; i < 9999; i++) {
            serv.addRecipe(new RecipeServiceNode(new Recipe()));
        }
        //String numberRecipes = String.valueOf((new RecipeService()).count());
        
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(String.valueOf(serv.getNumRecipes()));
    }
    public void setTextViewMainUpload(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("Upload to database GUI to be implemented.");
    }
    public void listView(View view) {
        Intent intent = new Intent(this, ActivityDisplayRecipe.class);
        startActivity(intent);
        /*

         */
    }
}
