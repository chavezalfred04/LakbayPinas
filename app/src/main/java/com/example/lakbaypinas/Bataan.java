package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class Bataan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bataan);
        Objects.requireNonNull(getSupportActionBar()).setTitle("BATAAN");
    }
}