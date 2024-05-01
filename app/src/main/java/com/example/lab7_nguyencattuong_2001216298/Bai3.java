package com.example.lab7_nguyencattuong_2001216298;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bai3 extends AppCompatActivity {

    ActionBar actionBar;
    BottomNavigationView  btnav_bai3;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        actionBar = getSupportActionBar();
        btnav_bai3 = (BottomNavigationView) findViewById(R.id.btnav_bai3);
        frameLayout = (FrameLayout) findViewById(R.id.frame_bai3);

        btnav_bai3.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;
                switch (item.getItemId())
                {
                    case R.id.nav_shop:actionBar.setTitle("Shop");
                    loadFragment(new fragment_shop());
                    return true;


                    case R.id.nav_gift: actionBar.setTitle("Gift");
                        loadFragment(new FragmentGift());
                        return true;


                    case R.id.nav_cart:actionBar.setTitle("Cart");
                    return true;

                    case R.id.nav_profile:actionBar.setTitle("Profile");
                    return true;
                }
                return false;
            }
        });
        actionBar.setTitle("Shop");

    }

    public void loadFragment (Fragment fragment)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_bai3,fragment);
        ft.commit();
    }
}