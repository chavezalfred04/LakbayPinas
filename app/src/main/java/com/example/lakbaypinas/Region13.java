package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region13 extends AppCompatActivity {

    TextView text;
    Button btnagusandelnorte, btnagusandelsur, btndinagatislands, btnsurigaodelnorte, btnsurigaodelsur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region13);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region XIII");

        btnagusandelnorte = findViewById(R.id.btnagusandelnorte);

        btnagusandelnorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region13.this,AgusanDelNorte.class);
                startActivity(intent);
            }
        });

        btnagusandelsur = findViewById(R.id.btnagusandelsur);

        btnagusandelsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region13.this,AgusanDelSur.class);
                startActivity(intent);
            }
        });

        btndinagatislands = findViewById(R.id.btndinagatislands);

        btndinagatislands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region13.this,DinagatIslands.class);
                startActivity(intent);
            }
        });

        btnsurigaodelnorte = findViewById(R.id.btnsurigaodelnorte);

        btnsurigaodelnorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region13.this,SurigaoDelNorte.class);
                startActivity(intent);
            }
        });

        btnsurigaodelsur = findViewById(R.id.btnsurigaodelsur);

        btnsurigaodelsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region13.this,SurigaoDelSur.class);
                startActivity(intent);
            }
        });
    }
}