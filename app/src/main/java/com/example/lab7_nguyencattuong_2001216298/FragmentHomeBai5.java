package com.example.lab7_nguyencattuong_2001216298;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHomeBai5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHomeBai5 extends Fragment {

    ListView lvNuocs;
    ArrayList <Nuocs> nuocsArrayList;
    Nuocs nuocs;
    CustomQuocGiaAdapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentHomeBai5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentHomeBai5.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentHomeBai5 newInstance(String param1, String param2) {
        FragmentHomeBai5 fragment = new FragmentHomeBai5();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_bai5,container,false);
        lvNuocs = (ListView) view.findViewById(R.id.lvNuocs);
        nuocsArrayList = nuocs.getData();
            adapter = new CustomQuocGiaAdapter(this, R.layout.layout_nuoc_item,nuocsArrayList);
            lvNuocs.setAdapter(adapter);
        return view;
    }
}