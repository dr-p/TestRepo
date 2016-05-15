package com.killer.recipes.allrecipekillerapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    //private RecipeDataSource myDs; to be implemented if upload feature is enableed


    String[] items = new String[4];
    //ArrayList<String> listItems;
    //ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    TextView ingredientsView, title, ingredient, recipe;
    Button mButton;
    String Ing1, Ing2, Ing3, Ing4;

    /* STEVEN */
    Button ingSearch;
    Button titleSearch;
    Button displayAll;
    Button upload;
    RecipeDatabaseDEPRECATED model = new RecipeDatabaseDEPRECATED();

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /* STEVEN */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* VIDUSHI */
        /**
        ingredientsView = (TextView) findViewById(R.id.txtitem);
        //title = (TextView) findViewById(R.id.textView1);
        //ingredient = (TextView) findViewById(R.id.textView2);
        //activity_recipe_search_result = (TextView) findViewById(R.id.textView3);
        if (editText1 != null && editText2!=null && editText3 != null && editText4 != null) {
            Ing1 = editText1.getText().toString();
            Ing2 = editText2.getText().toString();
            Ing3 = editText3.getText().toString();
            Ing4 = editText4.getText().toString();
            items[0] = Ing1;
            items[1] = Ing2;
            items[2] = Ing3;
            items[3] = Ing4;
        }

        //title.setText("1");
        //ingredient.setText("2");
        //activity_recipe_search_result.setText("3");



        /* VIDUSHI */
        /*
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, com.killer.recipes.allrecipekillerapp.IngredientSearchActivity.class);
                startActivity(i);
            }
        });
        */
        //myDs = new RecipeDataSource(this);


        /* STEVEN */

        ingSearch =  (Button) findViewById(R.id.buttonSearchIngredients);
        titleSearch = (Button) findViewById(R.id.buttonSearchTitle);
        upload = (Button) findViewById(R.id.buttonUpload);
        displayAll = (Button) findViewById(R.id.buttonListView);

        ingSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IngredientSearchActivity.class)); //to be implemented
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
        */

        displayAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent ls = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(ls);
            }
        });



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
       client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        /* STEVEN */

    }

    public void toBeImplemented(View view) {
        Toast.makeText(getBaseContext(), "To be implemented.", Toast.LENGTH_LONG).show();
    }


    /* DEPRECATED METHOD NOT NEEDED ANYMORE
    public void setTextViewMainDatabase(View view) {
        RecipeTreeDEPRECATED serv = new RecipeTreeDEPRECATED();
        for (int i = 0; i < 9999; i++) {
            serv.addRecipe(new RecipeNodeDEPRECATED(new RecipeDEPRECATED()));
        }
        //String numberRecipes = String.valueOf((new RecipeTreeDEPRECATED()).count());

        //TextView tv = (TextView) findViewById(R.id.textView);
        //tv.setText(String.valueOf(serv.getNumRecipes()));
    }*/

    public void setTextViewMainUpload(View view) {
        //TextView tv = (TextView) findViewById(R.id.textView);
        //tv.setText("Upload to database GUI to be implemented.");
    }

    public void listView(View view) {

        Intent intent = new Intent(this, ActivityDisplayRecipe.class);
        startActivity(intent);
    }


    /* STEVEN */
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
        /* STEVEN */
    }




}

/**
 * Vidushi commented this portion on her files out. Including it in here just in case needed.
 */
      /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/