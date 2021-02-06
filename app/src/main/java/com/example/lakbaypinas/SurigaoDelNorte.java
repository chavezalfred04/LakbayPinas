package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class SurigaoDelNorte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surigao_del_norte);
        Objects.requireNonNull(getSupportActionBar()).setTitle("SURIGAO DEL NORTE");
    }
}