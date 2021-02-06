package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class ARMM extends AppCompatActivity {

    TextView text;
    Button btnbasilan, btnlanaodelsur, btnmaguindanao, btnsulu, btntawitawi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_r_m_m);
        Objects.requireNonNull(getSupportActionBar()).setTitle("BARMM");

        btnbasilan = findViewById(R.id.btnbasilan);

        btnbasilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(ARMM.this,Basilan.class);
                startActivity(intent);
            }
        });

        btnlanaodelsur = findViewById(R.id.btnlanaodelsur);

        btnlanaodelsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(ARMM.this,LanaoDelSur.class);
                startActivity(intent);
            }
        });

        btnmaguindanao = findViewById(R.id.btnmaguindanao);

        btnmaguindanao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(ARMM.this,Maguindanao.class);
                startActivity(intent);
            }
        });

        btnsulu = findViewById(R.id.btnsulu);

        btnsulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(ARMM.this,Sulu.class);
                startActivity(intent);
            }
        });

        btntawitawi = findViewById(R.id.btntawitawi);

        btntawitawi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(ARMM.this,Sulu.class);
                startActivity(intent);
            }
        });
    }
}