package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class NuevaVizcaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_vizcaya);
        Objects.requireNonNull(getSupportActionBar()).setTitle("NUEVA VIZCAYA");
    }
}