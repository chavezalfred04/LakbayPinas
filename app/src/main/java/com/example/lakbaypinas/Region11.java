package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region11 extends AppCompatActivity {

    TextView text;
    Button btndavaodeoro, btndavaodelnorte, btndavaodelsur, btndavaooccidental, btndavaooriental;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region11);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region XI");

        btndavaodeoro = findViewById(R.id.btndavaodeoro);

        btndavaodeoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region11.this,CompostelaValley.class);
                startActivity(intent);
            }
        });

        btndavaodelnorte = findViewById(R.id.btndavaodelnorte);

        btndavaodelnorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region11.this,DavaoDelNorte.class);
                startActivity(intent);
            }
        });

        btndavaodelsur = findViewById(R.id.btndavaodelsur);

        btndavaodelsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region11.this,DavaoDelSur.class);
                startActivity(intent);
            }
        });

        btndavaooccidental = findViewById(R.id.btndavaooccidental);

        btndavaooccidental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region11.this,DavaoOccidental.class);
                startActivity(intent);
            }
        });

        btndavaooriental = findViewById(R.id.btndavaooriental);

        btndavaooriental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region11.this,DavaoOriental.class);
                startActivity(intent);
            }
        });
    }
}