package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region5 extends AppCompatActivity {

    TextView text;
    Button btnalbay, btncamarinesnorte, btncamarinessur, btncatanduanes, btnmasbate, btnsorsogon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region5);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region V");

        btnalbay = findViewById(R.id.btnalbay);

        btnalbay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region5.this,Albay.class);
                startActivity(intent);
            }
        });

        btncamarinesnorte = findViewById(R.id.btncamarinesnorte);

        btncamarinesnorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region5.this,CamarinesNorte.class);
                startActivity(intent);
            }
        });

        btncamarinessur = findViewById(R.id.btncamarinessur);

        btncamarinessur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region5.this,CamarinesSur.class);
                startActivity(intent);
            }
        });

        btncatanduanes = findViewById(R.id.btncatanduanes);

        btncatanduanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region5.this,Catanduanes.class);
                startActivity(intent);
            }
        });

        btnmasbate = findViewById(R.id.btnmasbate);

        btnmasbate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region5.this,Masbate.class);
                startActivity(intent);
            }
        });

        btnsorsogon = findViewById(R.id.btnsorsogon);

        btnsorsogon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region5.this,Sorsogon.class);
                startActivity(intent);
            }
        });
    }
}