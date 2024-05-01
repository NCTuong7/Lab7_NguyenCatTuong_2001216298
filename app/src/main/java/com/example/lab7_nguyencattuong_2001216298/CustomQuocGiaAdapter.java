package com.example.lab7_nguyencattuong_2001216298;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomQuocGiaAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    ArrayList<Nuocs> nuocsArrayList;
    int layoutItem;

    public CustomQuocGiaAdapter(FragmentHomeBai5 context, int layoutItem, ArrayList<Nuocs> nuocsArrayList) {
        this.layoutInflater = context.getLayoutInflater();
        this.nuocsArrayList = nuocsArrayList;
        this.layoutItem = layoutItem;
    }

    @Override
    public int getCount() {
        return nuocsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.nuocsArrayList.get(position);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Nuocs nuocs = nuocsArrayList.get(position);
        View rowView = layoutInflater.inflate(layoutItem,null,true);
        ImageView imgHinh5 = (ImageView) rowView.findViewById(R.id.imgHinh5);
        imgHinh5.setImageResource(nuocs.getIdImg());
        TextView tvTenNuoc5 = (TextView) rowView.findViewById(R.id.tvTenNuoc5);
        tvTenNuoc5.setText(nuocs.getNameImg());
        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}


