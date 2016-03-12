package com.example.vj.contohintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by VJ on 3/12/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedIntanceState) {

        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("varl");

        TextView txtLabel = (TextView) findViewById(R.id.txtLabel);
        txtLabel.setText(pesanStr);
    }
}
