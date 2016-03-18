package com.example.vj.tugas_08;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

/**
 * Created by VJ on 3/18/2016.
 */
public class ActKedua extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_kedua);

            Intent pesan = getIntent();
            int posisi = pesan.getIntExtra("posisi", 0);

            ImageView tampil = (ImageView) findViewById(R.id.imageView);
            TextView tulis = (TextView) findViewById(R.id.textView);
            String [] nama={"","Mobil","Sepeda Motor","Becak Motor","Becak Dayung","Sepeda"};
            int [] gambar= {0,R.drawable.mobil,R.drawable.motor,R.drawable.becakmotor,R.drawable.becakdayung,R.drawable.sepeda};

            tampil.setImageResource(gambar[posisi]);
            tulis.setText("Anda Memilih Gambar "+nama[posisi]);
        }

    }

