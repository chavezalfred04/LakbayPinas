package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class AgusanDelSur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agusan_del_sur);
        Objects.requireNonNull(getSupportActionBar()).setTitle("AGUSAN DEL SUR");
    }
}