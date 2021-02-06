package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region3 extends AppCompatActivity {

    TextView text;
    Button btnaurora, btnbataan, btnbulacan, btnnuevaecija, btnpampanga, btntarlac, btnzambales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region3);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region III");

        btnaurora = findViewById(R.id.btnaurora);

        btnaurora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region3.this,Aurora.class);
                startActivity(intent);
            }
        });

        btnbataan = findViewById(R.id.btnbataan);

        btnbataan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region3.this,Bataan.class);
                startActivity(intent);
            }
        });
        btnbulacan = findViewById(R.id.btnbulacan);

        btnbulacan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region3.this,Bulacan.class);
                startActivity(intent);
            }
        });

        btnnuevaecija = findViewById(R.id.btnnuevaecija);

        btnnuevaecija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region3.this,NuevaEcija.class);
                startActivity(intent);
            }
        });

        btnpampanga = findViewById(R.id.btnpampanga);

        btnpampanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region3.this,Pampanga.class);
                startActivity(intent);
            }
        });

        btntarlac = findViewById(R.id.btntarlac);

        btntarlac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region3.this,Tarlac.class);
                startActivity(intent);
            }
        });

        btnzambales = findViewById(R.id.btnzambales);

        btnzambales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region3.this,Zambales.class);
                startActivity(intent);
            }
        });
    }
}