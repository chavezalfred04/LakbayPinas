package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region2 extends AppCompatActivity {

    TextView text;
    Button btnbatanes, btncagayan, btnisabela, btnnuevavizcaya, btnquirino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region2);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region II");

        btnbatanes = findViewById(R.id.btnbatanes);

        btnbatanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region2.this,Batanes.class);
                startActivity(intent);
            }
        });

        btncagayan = findViewById(R.id.btncagayan);

        btncagayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region2.this,Cagayan.class);
                startActivity(intent);
            }
        });

        btnisabela = findViewById(R.id.btnisabela);

        btnisabela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region2.this,Isabela.class);
                startActivity(intent);
            }
        });

        btnnuevavizcaya = findViewById(R.id.btnnuevavizcaya);

        btnnuevavizcaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region2.this,NuevaVizcaya.class);
                startActivity(intent);
            }
        });

        btnquirino = findViewById(R.id.btnquirino);

        btnquirino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region2.this,Quirino.class);
                startActivity(intent);
            }
        });
    }
}