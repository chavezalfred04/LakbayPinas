package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region10 extends AppCompatActivity {

    TextView text;
    Button btnbukidnon, btncamiguin, btnlanaodelnorte, btnmisamisoccidental, btnmisamisoriental;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region10);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region X");

        btnbukidnon = findViewById(R.id.btnbukidnon);

        btnbukidnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region10.this,Bukidnon.class);
                startActivity(intent);
            }
        });

        btncamiguin = findViewById(R.id.btncamiguin);

        btncamiguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region10.this,Camiguin.class);
                startActivity(intent);
            }
        });

        btnlanaodelnorte = findViewById(R.id.btnlanaodelnorte);

        btnlanaodelnorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region10.this,LanaoDelNorte.class);
                startActivity(intent);
            }
        });

        btnmisamisoccidental = findViewById(R.id.btnmisamisoccidental);

        btnmisamisoccidental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region10.this,MisamisOccidental.class);
                startActivity(intent);
            }
        });

        btnmisamisoriental = findViewById(R.id.btnmisamisoriental);

        btnmisamisoriental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region10.this,MisamisOriental.class);
                startActivity(intent);
            }
        });
    }
}