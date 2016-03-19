package com.example.vj.praktikum21;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by VJ on 3/19/2016.
 */
public class ActivityUtama extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_utama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);
    }
    public void OnClick2(View view){
        Intent pesan1 = new Intent(getApplicationContext(), ActivityUbah.class);
        //pesan1.putExtra("ubah",pesanStr);
        startActivity(pesan1);
        finish();
        }
}


