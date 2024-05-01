package com.example.lab7_nguyencattuong_2001216298;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bai5 extends AppCompatActivity {
ActionBar actionBarBai5;
BottomNavigationView nav_bai5;
FrameLayout frame_bai5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        actionBarBai5 = getSupportActionBar();
        nav_bai5 = (BottomNavigationView) findViewById(R.id.navBai5);
        frame_bai5 = (FrameLayout) findViewById(R.id.frame_bai5);
        nav_bai5.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.item_home:actionBarBai5.setTitle("Home");
                    loadFragment(new FragmentHomeBai5());
                    return true;

                    case R.id.item_timKiem:actionBarBai5.setTitle("Search");
                    loadFragment(new FragmentSreach5());
                    return true;

                    case R.id.item_cafe:actionBarBai5.setTitle("Cafe");
                    loadFragment(new FragmentCaffe());
                    return true;
                }
                return false;
            }
        });

    }

    public void loadFragment(Fragment fragment)
    {
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.frame_bai5, fragment);
        ft.commit();
    }
}