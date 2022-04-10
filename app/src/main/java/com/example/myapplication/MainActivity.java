package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnRekam, btnTeks, btnTentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRekam = (Button) findViewById(R.id.btnRekam);
        btnTentang = (Button) findViewById(R.id.btnTentang);
        btnTeks = (Button) findViewById(R.id.btnTeks);

        btnRekam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActMulai = new Intent(getApplicationContext(), MulaiActivity.class);
                startActivity(BukaActMulai);
            }
        });

        btnTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActTeks = new Intent(getApplicationContext(), TekstospeechActivity.class);
                startActivity(BukaActTeks);
            }
        });

        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaTentang();
            }
        });
    }
    public void BukaTentang(){
        Intent BukaActTentang = new Intent(getApplicationContext(), TentangActivity.class);
        startActivity(BukaActTentang);
    }

}