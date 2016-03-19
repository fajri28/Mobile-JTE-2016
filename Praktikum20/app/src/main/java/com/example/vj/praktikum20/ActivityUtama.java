package com.example.vj.praktikum20;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

/**
 * Created by VJ on 3/19/2016.
 */
public class ActivityUtama extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_utama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("test1");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);

    }
}
