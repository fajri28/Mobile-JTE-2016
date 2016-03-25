package com.example.vj.tugas_10;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by VJ on 3/25/2016.
 */
public class ActivityUbahPin extends Activity{
               @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ubahpin);

            SharedPreferences sharedPreferences = getSharedPreferences("com.example.vj.tugas10.PREF_BERSAMA", Context.MODE_PRIVATE);
            String user = sharedPreferences.getString("user", "admin");
            EditText username = (EditText) findViewById(R.id.user2);
            username.setText(user);

        }

        public void onSimpan(View view){
            EditText ubah = (EditText) findViewById(R.id.user2);
            String username = ubah.getText().toString();

            EditText ubah2 = (EditText) findViewById(R.id.pass2);
            String password = ubah2.getText().toString();


            SharedPreferences sharedPreferences =
                    getSharedPreferences("com.example.vj.tugas10.PREF_BERSAMA", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("user", username);
            editor.putString("pass", password);
            editor.apply();


            Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
            pesan.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(pesan);
            finish();
        }
    }
