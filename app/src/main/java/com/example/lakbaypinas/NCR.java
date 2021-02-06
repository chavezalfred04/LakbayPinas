package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class NCR extends AppCompatActivity {

    TextView text;
    Button btnmetropolitanmanila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_c_r);
        Objects.requireNonNull(getSupportActionBar()).setTitle("NCR");

        btnmetropolitanmanila = findViewById(R.id.btnmetropolitanmanila);

        btnmetropolitanmanila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(NCR.this,MetroPololitanManila.class);
                startActivity(intent);
            }
        });


    }
}