package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class AgusanDelNorte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agusan_del_norte);
        Objects.requireNonNull(getSupportActionBar()).setTitle("AGUSAN DEL NORTE");
    }
}