package com.deepak.fragmentwithcalculation.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.deepak.fragmentwithcalculation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Circle extends Fragment implements View.OnClickListener{

    private EditText etCircleRadius;
    private Button btnCalculateCircle;
    private TextView tvRadiusResult;

    public Circle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_circle, container, false);

        etCircleRadius = view.findViewById(R.id.etCircleRadius);
        btnCalculateCircle = view.findViewById(R.id.btnCalculateCircle);
        tvRadiusResult = view.findViewById(R.id.tvRadiusResult);

        btnCalculateCircle.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        float radius, result;

        radius = Float.parseFloat(etCircleRadius.getText().toString());

        result = (radius * radius * 22) / 7;

        tvRadiusResult.append("The radius of "+ radius + " is " + result + ".\n");

    }
}
