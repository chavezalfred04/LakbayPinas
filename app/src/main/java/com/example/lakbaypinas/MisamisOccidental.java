package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class MisamisOccidental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misamis_occidental);
        Objects.requireNonNull(getSupportActionBar()).setTitle("MISAMIS OCCIDENTAL");
    }
}