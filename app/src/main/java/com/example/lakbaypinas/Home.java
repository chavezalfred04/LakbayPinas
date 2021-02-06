package com.example.lakbaypinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        
        btn1 = findViewById(R.id.btn1);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =  new Intent(Home.this,Region1.class);
            startActivity(intent);
        }
    });
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region2.class);
                startActivity(intent);
            }
        });
        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region3.class);
                startActivity(intent);
            }
        });
        btn4 = findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this, Region4a.class);
                startActivity(intent);
            }
        });
        btn5 = findViewById(R.id.btn5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region4b.class);
                startActivity(intent);
            }
        });
        btn6 = findViewById(R.id.btn6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region5.class);
                startActivity(intent);
            }
        });
        btn7 = findViewById(R.id.btn7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,CAR.class);
                startActivity(intent);
            }
        });
        btn8 = findViewById(R.id.btn8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,NCR.class);
                startActivity(intent);
            }
        });
        btn9 = findViewById(R.id.btn9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region6.class);
                startActivity(intent);
            }
        });
        btn10 = findViewById(R.id.btn10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region7.class);
                startActivity(intent);
            }
        });
        btn11 = findViewById(R.id.btn11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region8.class);
                startActivity(intent);
            }
        });
        btn12 = findViewById(R.id.btn12);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region9.class);
                startActivity(intent);
            }
        });
        btn13 = findViewById(R.id.btn13);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region10.class);
                startActivity(intent);
            }
        });
        btn14 = findViewById(R.id.btn14);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region11.class);
                startActivity(intent);
            }
        });
        btn15 = findViewById(R.id.btn15);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region12.class);
                startActivity(intent);
            }
        });
        btn16 = findViewById(R.id.btn16);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,Region13.class);
                startActivity(intent);
            }
        });
        btn17 = findViewById(R.id.btn17);

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Home.this,ARMM.class);
                startActivity(intent);
            }
        });
    }
}