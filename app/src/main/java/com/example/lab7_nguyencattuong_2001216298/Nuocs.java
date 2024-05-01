package com.example.lab7_nguyencattuong_2001216298;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Nuocs {
    int idImg;
    String nameImg;


    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getNameImg() {
        return nameImg;
    }

    public void setNameImg(String nameImg) {
        this.nameImg = nameImg;
    }



    public Nuocs(int idImg, String nameImg) {
        this.idImg = idImg;
        this.nameImg = nameImg;
    }

    public Nuocs() {
    }

    @NonNull
    public static ArrayList<Nuocs>  getData ()
    {
        ArrayList <Nuocs> nuocs = new ArrayList<Nuocs>();
        nuocs.add(new Nuocs(R.drawable.vietnam,"Việt Nam"));
        nuocs.add(new Nuocs(R.drawable.my,"Mỹ"));
        nuocs.add(new Nuocs(R.drawable.phap,"Pháp"));
        nuocs.add(new Nuocs(R.drawable.sin,"Singapore"));
        return nuocs;
    }
}
