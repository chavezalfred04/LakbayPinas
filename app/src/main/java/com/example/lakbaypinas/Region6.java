package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region6 extends AppCompatActivity {

    TextView text;
    Button btnaklan, btnantique, btncapiz, btnguimaras, btniloilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region6);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region VI");

        btnaklan = findViewById(R.id.btnaklan);

        btnaklan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region6.this,Aklan.class);
                startActivity(intent);
            }
        });

        btnantique = findViewById(R.id.btnantique);

        btnantique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region6.this,Antique.class);
                startActivity(intent);
            }
        });

        btncapiz = findViewById(R.id.btncapiz);

        btncapiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region6.this,Capiz.class);
                startActivity(intent);
            }
        });

        btnguimaras = findViewById(R.id.btnguimaras);

        btnguimaras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region6.this,Guimaras.class);
                startActivity(intent);
            }
        });

        btniloilo = findViewById(R.id.btniloilo);

        btniloilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region6.this,Iloilo.class);
                startActivity(intent);
            }
        });
    }
}