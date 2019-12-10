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
public class Swapping extends Fragment implements View.OnClickListener {

    private Button btnCalculateSwap;
    private EditText etFirstNumber, etSecondNumber;
    private TextView tvSwapResult;

    public Swapping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);

        etFirstNumber = view.findViewById(R.id.etFirstNumber);
        etSecondNumber = view.findViewById(R.id.etSecondNumber);
        btnCalculateSwap = view.findViewById(R.id.btnCalculateSwap);
        tvSwapResult = view.findViewById(R.id.tvSwapResult);

        btnCalculateSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int first,second,temp, bFirst, bSecond;

        first = Integer.parseInt(etFirstNumber.getText().toString());
        second = Integer.parseInt(etSecondNumber.getText().toString());

        bFirst = first;
        bSecond = second;


        temp = first;
        first = second;
        second = temp;

        tvSwapResult.append("The value before swipping. \n First Number is "+ bFirst + "\n Second Number "
                + bSecond +".\n The value after swipping.\n First number is " + first + " \n Second Number is "+ second + ".\n");

    }
}
