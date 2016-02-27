package com.example.vj.kalkulator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

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

    public void onClickSamaDgn(View view) {
        EditText numAngka1 = (EditText) findViewById(R.id.numAngka1);
        String angka1Str = numAngka1.getText().toString();
        float angka1 = Long.valueOf(angka1Str);

        EditText numAngka2 = (EditText) findViewById(R.id.numAngka2);
        String angka2Str = numAngka2.getText().toString();
        float angka2 = Long.valueOf(angka2Str);

        TextView txtHasil = (TextView) findViewById(R.id.lbHasil);

        switch (view.getId()){
            case R.id.kali:
                float hasil = Float.valueOf(angka1*angka2);
                String hasilStr = Float.toString(hasil);
               txtHasil.setText(hasilStr);
                break;
            case R.id.bagi:
                float hasil2 = Float.valueOf(angka1/angka2);
                String hasil2Str = Float.toString(hasil2);
                txtHasil.setText(hasil2Str);
                break;
            case R.id.tambah:
                float hasil3 = Float.valueOf(angka1+angka2);
                String hasil3Str = Float.toString(hasil3);
                txtHasil.setText(hasil3Str);
                break;
            case R.id.kurang:
                float hasil4 = Float.valueOf(angka1-angka2);
                String hasil4Str = Float.toString(hasil4);
                txtHasil.setText(hasil4Str);
                break;
        }
    }
}
