package com.mauriciohincapie.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Portada extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portada);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portada, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.hoteles) {
            Intent i=new Intent(this,hoteles.class);
            startActivity(i);
            return true;

        }
        if (id == R.id.restaurantes) {
            Intent i=new Intent(this,restaurantes.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.bares) {
            Intent i=new Intent(this,bares.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.turisticos) {
            Intent i=new Intent(this,turisticos.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.demografia) {
            Intent i=new Intent(this,demografia.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.about) {
            Intent i=new Intent(this,about.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
