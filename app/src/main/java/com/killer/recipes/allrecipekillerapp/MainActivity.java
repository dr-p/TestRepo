package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    // yes finally

    Button ingSearch;
    Button titleSearch;
    Button displayAll;
    Button upload;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingSearch =  (Button) findViewById(R.id.button);
        titleSearch = (Button) findViewById(R.id.button4);
        upload = (Button) findViewById(R.id.button2);
        displayAll = (Button) findViewById(R.id.button3);


        ingSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IngredientSearch.class));
            }
        });

        titleSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,IngredientSearch.class));
            }
        });
/*
        upload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ///startActivity(new Intent(MainActivity.this,IngredientSearch.class));
            }
        });

        displayAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,IngredientSearch.class));
            }
        });
        */


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void setTextViewMainDatabase(View view) {
        RecipeService serv = new RecipeService();
        for (int i = 0; i < 9999; i++) {
            serv.addRecipe(new RecipeServiceNode(new Recipe()));
        }
        //String numberRecipes = String.valueOf((new RecipeService()).count());

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(String.valueOf(serv.getNumRecipes()));
    }

    public void setTextViewMainUpload(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Upload to database GUI to be implemented.");
    }

    public void listView(View view) {
        Intent intent = new Intent(this, ActivityDisplayRecipe.class);
        startActivity(intent);
        /*

         */
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.killer.recipes.allrecipekillerapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.killer.recipes.allrecipekillerapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
