package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class OccidentalMindoro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occidental_mindoro);
        Objects.requireNonNull(getSupportActionBar()).setTitle("OCCIDENTAL MINDORO");
    }
}