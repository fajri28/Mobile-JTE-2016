package com.example.vj.testawal03;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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
    public void onClick (View view){

        final RadioButton A = (RadioButton)findViewById(R.id.a);
        final RadioButton B = (RadioButton)findViewById(R.id.b);
        final RadioButton C = (RadioButton)findViewById(R.id.c);
        final RadioButton D = (RadioButton)findViewById(R.id.d);
        final RadioButton E = (RadioButton)findViewById(R.id.e);

        final Intent pesan = new Intent(getApplicationContext(), CounterActivity.class);


        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                pesan.putExtra("var1", (String.valueOf(a)));
                pesan.putExtra("var2","A");
                startActivity(pesan);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                pesan.putExtra("var1", (String.valueOf(b)));
                pesan.putExtra("var2","B");
                startActivity(pesan);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                pesan.putExtra("var1", (String.valueOf(c)));
                pesan.putExtra("var2","C");
                startActivity(pesan);
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d++;
                pesan.putExtra("var1", (String.valueOf(d)));
                pesan.putExtra("var2","D");
                startActivity(pesan);
            }
        });

        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e++;
                pesan.putExtra("var1", (String.valueOf(e)));
                pesan.putExtra("var2","E");
                startActivity(pesan);
            }
        });

         }
    int a =0;
    int b =0;
    int c =0;
    int d =0;
    int e =0;
  }

