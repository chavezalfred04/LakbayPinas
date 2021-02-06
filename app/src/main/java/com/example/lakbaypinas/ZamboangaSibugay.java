package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class ZamboangaSibugay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamboanga_sibugay);
        Objects.requireNonNull(getSupportActionBar()).setTitle("ZAMBOANGA SIBUGAY");
    }
}