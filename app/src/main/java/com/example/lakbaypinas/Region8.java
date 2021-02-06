package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region8 extends AppCompatActivity {

    TextView text;
    Button btnbiliran, btneasternsamar, btnleyte, btnnorthernsamar, btnsamar, btnsouthernleyte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region8);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region VIII");

        btnbiliran = findViewById(R.id.btnbiliran);

        btnbiliran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region8.this,Biliran.class);
                startActivity(intent);
            }
        });

        btneasternsamar = findViewById(R.id.btneasternsamar);

        btneasternsamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region8.this,EasternSamar.class);
                startActivity(intent);
            }
        });

        btnleyte = findViewById(R.id.btnleyte);

        btnleyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region8.this,Leyte.class);
                startActivity(intent);
            }
        });

        btnnorthernsamar = findViewById(R.id.btnnorthernsamar);

        btnnorthernsamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region8.this,NorthernSamar.class);
                startActivity(intent);
            }
        });

        btnsamar = findViewById(R.id.btnsamar);

        btnsamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region8.this,Samar.class);
                startActivity(intent);
            }
        });

        btnsouthernleyte = findViewById(R.id.btnsouthernleyte);

        btnsouthernleyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region8.this,SouthernLeyte.class);
                startActivity(intent);
            }
        });

    }
}