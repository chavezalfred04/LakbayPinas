package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class LaUnion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_union);
        Objects.requireNonNull(getSupportActionBar()).setTitle("LA UNION");
    }
}