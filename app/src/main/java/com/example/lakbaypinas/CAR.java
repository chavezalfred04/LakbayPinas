package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class CAR extends AppCompatActivity {

    TextView text;
    Button btnabra, btnapayao, btnbenguet, btnifugao, btnkalinga, btnmountainprovince;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_a_r);
        Objects.requireNonNull(getSupportActionBar()).setTitle("CAR");

        btnabra = findViewById(R.id.btnabra);

        btnabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(CAR.this,Abra.class);
                startActivity(intent);
            }
        });

        btnapayao = findViewById(R.id.btnapayao);

        btnapayao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(CAR.this,Apayao.class);
                startActivity(intent);
            }
        });

        btnbenguet = findViewById(R.id.btnbenguet);

        btnbenguet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(CAR.this,Benguet.class);
                startActivity(intent);
            }
        });

        btnifugao = findViewById(R.id.btnifugao);

        btnifugao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(CAR.this,Ifugao.class);
                startActivity(intent);
            }
        });

        btnkalinga = findViewById(R.id.btnkalinga);

        btnkalinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(CAR.this,Kalinga.class);
                startActivity(intent);
            }
        });

        btnmountainprovince = findViewById(R.id.btnmountainprovince);

        btnmountainprovince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(CAR.this,MountainProvince.class);
                startActivity(intent);
            }
        });


    }
}