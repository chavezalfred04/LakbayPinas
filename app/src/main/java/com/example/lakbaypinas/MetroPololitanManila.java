package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class MetroPololitanManila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_pololitan_manila);
        Objects.requireNonNull(getSupportActionBar()).setTitle("METROPOLITAN MANILA");
    }
}