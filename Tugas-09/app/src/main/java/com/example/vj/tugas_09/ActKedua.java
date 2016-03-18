package com.example.vj.tugas_09;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by VJ on 3/18/2016.
 */
public class ActKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        ImageView tampil = (ImageView) findViewById(R.id.jawaban);
        TextView pilihan = (TextView) findViewById(R.id.textView);
        TextView tulis = (TextView) findViewById(R.id.textView2);
        String [] nama={"Mobil","Sepeda Motor","Becak Motor","Becak Dayung","Sepeda"};
        int [] gambar= {R.drawable.mobil,R.drawable.motor,R.drawable.becakmotor,R.drawable.becakdayung,R.drawable.sepeda};

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(gambar.length);

        Intent pesan = getIntent();
        int posisi = pesan.getIntExtra("tebak", 0);

        //menampilkan tulisan apa yang dipilih
        pilihan.setText("Anda Memilih " + nama[posisi]);


        //mengecek apakah pilihan sama dengan nilai random

        if(posisi == randomInt){
            tulis.setText("Jawaban Anda Benar");
        }else{
            tulis.setText("Jawaban Anda Salah, Seharusnya "+nama[randomInt]);
        }

        //menampilkan gambar jawaban yang benar setelah dirandom
        tampil.setImageResource(gambar[randomInt]);

    }
}

