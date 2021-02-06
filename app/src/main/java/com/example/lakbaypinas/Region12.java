package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region12 extends AppCompatActivity {

    TextView text;
    Button btncotabato, btnsarangani, btnsouthcotabato, btnsultankudarat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region12);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region XII");

        btncotabato = findViewById(R.id.btncotabato);

        btncotabato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region12.this,Cotabato.class);
                startActivity(intent);
            }
        });

        btnsarangani = findViewById(R.id.btnsarangani);

        btnsarangani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region12.this,Sarangani.class);
                startActivity(intent);
            }
        });

        btnsouthcotabato = findViewById(R.id.btnsouthcotabato);

        btnsouthcotabato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region12.this,SouthCotabato.class);
                startActivity(intent);
            }
        });

        btnsultankudarat = findViewById(R.id.btnsultankudarat);

        btnsultankudarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region12.this,SultanKudarat.class);
                startActivity(intent);
            }
        });
    }
}