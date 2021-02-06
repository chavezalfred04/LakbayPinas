package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Region9 extends AppCompatActivity {

    TextView text;
    Button btnzamboangadelnorte, btnzamboangadelsur, btnzamboangasibugay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region9);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Region IX");

        btnzamboangadelnorte = findViewById(R.id.btnzamboangadelnorte);

        btnzamboangadelnorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region9.this,ZamboangaDelNorte.class);
                startActivity(intent);
            }
        });

        btnzamboangadelsur = findViewById(R.id.btnzamboangadelsur);

        btnzamboangadelsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region9.this,ZamboangDelSur.class);
                startActivity(intent);
            }
        });

        btnzamboangasibugay = findViewById(R.id.btnzamboangasibugay);

        btnzamboangasibugay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Region9.this,ZamboangaSibugay.class);
                startActivity(intent);
            }
        });
    }
}