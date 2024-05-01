package com.example.lab7_nguyencattuong_2001216298;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai2 extends AppCompatActivity {
    ListView lvBai2;
    ArrayAdapter<String> adapter;
    ArrayList<String> lvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        lvData = new ArrayList<String>() ;
    //    {"Python", "Java", "Ruby", "C++","C#","Asp.net","PHP"};
        lvData.add("Python");
        lvData.add("Java");
        lvData.add("Ruby");
        lvData.add("C++");
        lvData.add("C#");
        lvData.add("Asp.net");
        lvData.add("PHP");

        addControl();

        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,lvData);
        lvBai2.setAdapter(adapter);
        addEvent();
    }

    void addControl()
    {
        lvBai2 = (ListView) findViewById(R.id.lvBai2);
    }

    void addEvent()
    {
            lvBai2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                    registerForContextMenu(lvBai2.getRootView());
                    return false;
                }
            });


    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu_bai2,menu);
        if (menu instanceof MenuInflater)
        {
            MenuBuilder menuBuilder = (MenuBuilder) menu;
            menuBuilder.setOptionalIconsVisible(true);
        }
    }



}