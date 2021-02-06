package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region1 extends AppCompatActivity {

    TextView text;
    Button btnIlocosNorte, btnIlocosSur, btnLaUnion, btnPangasinan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region1);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region I");


        btnIlocosNorte = findViewById(R.id.btnIlocosNorte);

        btnIlocosNorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region1.this,IlocosNorte.class);
                startActivity(intent);
            }
        });

        btnIlocosSur = findViewById(R.id.btnIlocosSur);

        btnIlocosSur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region1.this,Ilocossur.class);
                startActivity(intent);
            }
        });

        btnLaUnion = findViewById(R.id.btnLaUnion);

        btnLaUnion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region1.this,LaUnion.class);
                startActivity(intent);
            }
        });

        btnPangasinan = findViewById(R.id.btnPangasinan);

        btnPangasinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region1.this,pangasinan.class);
                startActivity(intent);
            }
        });
    }
}