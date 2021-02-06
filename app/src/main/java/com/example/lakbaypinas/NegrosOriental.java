package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class NegrosOriental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negros_oriental);
        Objects.requireNonNull(getSupportActionBar()).setTitle("NEGROS ORIENTAL");
    }
}