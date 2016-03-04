package com.example.vj.kalkulatorkompleks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
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
    public void onClickOperasi (View view) {
        EditText num1 = (EditText) findViewById(R.id.real1);
        String num1Str = num1.getText().toString();
        float real1 = Float.valueOf(num1Str);

        EditText num2 = (EditText) findViewById(R.id.real2);
        String num2Str = num2.getText().toString();
        float real2 = Float.valueOf(num2Str);

        EditText num3 = (EditText) findViewById(R.id.imaj1);
        String num3Str = num3.getText().toString();
        float imaj1 = Float.valueOf(num3Str);

        EditText num4 = (EditText) findViewById(R.id.imaj2);
        String num4Str = num4.getText().toString();
        float imaj2 = Float.valueOf(num4Str);

        Spinner Operasi = (Spinner) findViewById(R.id.Operasi);
        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);

        String selectedItem = (String) Operasi.getSelectedItem();
        if (selectedItem.trim().equals("+")) {
            float hasilReal = Float.valueOf(real1 + real2);
            float hasilImaj = Float.valueOf(imaj1 + imaj2);
            String hasilRealStr = Float.toString(hasilReal);
            String hasilImajStr = Float.toString(hasilImaj);
            txtHasil.setText(hasilRealStr+" + ("+ hasilImajStr+"i)");
        } else if (selectedItem.trim().equals("-")) {
            float hasilReal2 = Float.valueOf(real1 - real2);
            float hasilImaj2 = Float.valueOf(imaj1 - imaj2);
            String hasilRealStr2 = Float.toString(hasilReal2);
            String hasilImajStr2 = Float.toString(hasilImaj2);
            txtHasil.setText(hasilRealStr2+" + ("+ hasilImajStr2+"i)");
        } else if (selectedItem.trim().equals("*")) {
            float hasilReal3 = Float.valueOf((real1 * imaj1) - (real2 * imaj2));
            float hasilImaj3 = Float.valueOf((real1 * imaj2) + (real2 * imaj1));
            String hasilRealStr3 = Float.toString(hasilReal3);
            String hasilImajStr3 = Float.toString(hasilImaj3);
            txtHasil.setText(hasilRealStr3+" + ( "+ hasilImajStr3+"i )");
        }
    }
}