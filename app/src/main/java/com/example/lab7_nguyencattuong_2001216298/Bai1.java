package com.example.lab7_nguyencattuong_2001216298;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

public class Bai1 extends AppCompatActivity {
TextView tvContextMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        addControl();
        addEvent();
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu_bai1,menu);
        if(menu instanceof MenuInflater)
        {
            MenuBuilder menuBuilder = (MenuBuilder) menu;
            menuBuilder.setOptionalIconsVisible(true);
        }

    }

    void addControl()
    {
        tvContextMenu = (TextView) findViewById(R.id.tvContextMenu);
    }

    void addEvent()
    {
tvContextMenu.setLongClickable(true);
registerForContextMenu(tvContextMenu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        if(item.getItemId() == R.id.menuitem_insert)
            Toast.makeText(this, "Insert", Toast.LENGTH_SHORT).show();
        else if (item.getItemId() == R.id.menuitem_delete)
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        else if(item.getItemId() == R.id.menuitem_switch)
            Toast.makeText(this, "Switch", Toast.LENGTH_SHORT).show();
        else if (item.getItemId() == R.id.menuitem_add)
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Remove", Toast.LENGTH_SHORT).show();

        return super.onContextItemSelected(item);
        
    }
}