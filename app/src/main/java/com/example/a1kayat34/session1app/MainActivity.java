package com.example.a1kayat34.session1app;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //onCreate runs when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //layout file can be in R.layout.activity_main
        setContentView(R.layout.activity_main);

        //Set up toolbar as our action bar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.actionSave){
            new AlertDialog.Builder(this).setPositiveButton("OK", null).setMessage("saving...").show();
            return true;

        }
        return true;
    }
}
