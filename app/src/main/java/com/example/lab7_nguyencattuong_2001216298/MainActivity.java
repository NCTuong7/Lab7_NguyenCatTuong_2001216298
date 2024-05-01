package com.example.lab7_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnBaiMau,btnBai1,btnBai2,btnBai3,btnBai4,btnBai5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();

    }

    void addControl()
    {
        btnBaiMau = (Button) findViewById(R.id.btnBaiMau);
        btnBai1  = (Button) findViewById(R.id.btnBai1);
        btnBai2  = (Button) findViewById(R.id.btnBai2);
        btnBai3  = (Button) findViewById(R.id.btnBai3);
        btnBai4  = (Button) findViewById(R.id.btnBai4);
        btnBai5  = (Button) findViewById(R.id.btnBai5);
    }

    void addEvent()
    {
        btnBaiMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiMau.class);
                startActivity(intent);
            }
        });

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai1.class);
                startActivity(intent);
            }
        });

        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai2.class);
                startActivity(intent);
            }
        });

        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai3.class);
                startActivity(intent);
            }
        });

        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai4.class);
                startActivity(intent);
            }
        });

        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai5.class);
                startActivity(intent);
            }
        });
    }
}