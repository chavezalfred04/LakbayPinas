package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class ZamboangaDelNorte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamboanga_del_norte);
        Objects.requireNonNull(getSupportActionBar()).setTitle("ZAMBOANGA DEL NORTE");
    }
}