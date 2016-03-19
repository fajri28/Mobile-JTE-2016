package com.example.vj.testawal03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by VJ on 3/19/2016.
 */
public class CounterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);


        Intent pesan = getIntent();
        String pesan1 = pesan.getStringExtra("var1");
        String pesan2 = pesan.getStringExtra("var2");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText("Anda Memilih "+pesan2+" Sebanyak "+pesan1+" Kali");
    }
}

