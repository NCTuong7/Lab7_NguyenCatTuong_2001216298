package com.example.lab7_nguyencattuong_2001216298;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Bai4 extends AppCompatActivity {
DrawerLayout drawer_layout;
Toolbar toolbar_bai4;
NavigationView  nav_drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        toolbar_bai4 = (Toolbar) findViewById(R.id.toolbar_bai4);
        setSupportActionBar(toolbar_bai4);

        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle =   new ActionBarDrawerToggle(this, drawer_layout,toolbar_bai4,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

        nav_drawer = (NavigationView) findViewById(R.id.nav_drawer);
        nav_drawer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.menuitem_home:toolbar_bai4.setTitle("Home");
                    loadFragment(new FragmentHome4());
                    return true;

                }
                return false;
            }
        });

    }

    public void loadFragment (Fragment fragment)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_bai4,fragment);
        ft.commit();
    }
}