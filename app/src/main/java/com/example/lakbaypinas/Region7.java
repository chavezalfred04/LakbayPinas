package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region7 extends AppCompatActivity {

    TextView text;
    Button btnbohol, btncebu, btnnegrosoriental, btnsiquijor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region7);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region VII");

        btnbohol = findViewById(R.id.btnbohol);

        btnbohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region7.this,Bohol.class);
                startActivity(intent);
            }
        });

        btncebu = findViewById(R.id.btncebu);

        btncebu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region7.this,Cebu.class);
                startActivity(intent);
            }
        });

        btnnegrosoriental = findViewById(R.id.btnnegrosoriental);

        btnnegrosoriental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region7.this,NegrosOriental.class);
                startActivity(intent);
            }
        });

        btnsiquijor = findViewById(R.id.btnsiquijor);

        btnsiquijor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region7.this,Siquijor.class);
                startActivity(intent);
            }
        });
    }
}