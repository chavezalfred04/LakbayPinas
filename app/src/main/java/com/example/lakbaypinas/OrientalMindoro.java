package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class OrientalMindoro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oriental_mindoro);
        Objects.requireNonNull(getSupportActionBar()).setTitle("ORIENTAL MINDORO");
    }
}