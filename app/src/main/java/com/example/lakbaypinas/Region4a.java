package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region4a extends AppCompatActivity {

    TextView text;
    Button btnbatangas, btncavite, btnlaguna, btnquezon, btnrizal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region4a);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region IV - A");

        btnbatangas = findViewById(R.id.btnbatangas);

        btnbatangas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4a.this,Batangas.class);
                startActivity(intent);
            }
        });

        btncavite = findViewById(R.id.btncavite);

        btncavite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4a.this,Cavite.class);
                startActivity(intent);
            }
        });

        btnlaguna = findViewById(R.id.btnlaguna);

        btnlaguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4a.this,Laguna.class);
                startActivity(intent);
            }
        });

        btnquezon = findViewById(R.id.btnquezon);

        btnquezon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4a.this,Quezon.class);
                startActivity(intent);
            }
        });

        btnrizal = findViewById(R.id.btnrizal);

        btnrizal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4a.this,Rizal.class);
                startActivity(intent);
            }
        });
    }
}