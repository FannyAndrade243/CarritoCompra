package com.example.fanny.telefonocompras;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

   // private ImageButton logo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1inicio_layout,container,false);
        //logo = (ImageButton) view.findViewById(R.id.logo);



        return view;
    }
}