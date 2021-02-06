package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region4b extends AppCompatActivity {

    TextView text;
    Button btnmarinduque, btnoccidentalmindoro, btnorientalmindoro, btnpalawan, btnromblon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region4b);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region IV - B");

        btnmarinduque = findViewById(R.id.btnmarinduque);

        btnmarinduque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4b.this,Marinduque.class);
                startActivity(intent);
            }
        });

        btnoccidentalmindoro = findViewById(R.id.btnoccidentalmindoro);

        btnoccidentalmindoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4b.this,OccidentalMindoro.class);
                startActivity(intent);
            }
        });

        btnorientalmindoro = findViewById(R.id.btnorientalmindoro);

        btnorientalmindoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4b.this,OrientalMindoro.class);
                startActivity(intent);
            }
        });

        btnpalawan = findViewById(R.id.btnpalawan);

        btnpalawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4b.this,Palawan.class);
                startActivity(intent);
            }
        });

        btnromblon = findViewById(R.id.btnromblon);

        btnromblon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region4b.this,Romblon.class);
                startActivity(intent);
            }
        });
    }
}