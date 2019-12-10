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
public class Automorphic extends Fragment implements View.OnClickListener{

    private Button btnCalculateAutomorphic;
    private EditText etAutomorphicNumber;
    private TextView tvAutomorphicResult;

    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etAutomorphicNumber = view.findViewById(R.id.etAutomorphicNumber);
        btnCalculateAutomorphic = view.findViewById(R.id.btnCalculateAutomorphic);
        tvAutomorphicResult = view.findViewById(R.id.tvAutomorphicResult);

        btnCalculateAutomorphic.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(etAutomorphicNumber.getText().toString());
        int sq = number * number;

        int c = 0;
        int copy = number;

        while (copy>0){
            c++;
            copy = copy/10;
        }

        int end = sq % (int)Math.pow(10,c);

        if (number == end){
            tvAutomorphicResult.append(number +" is a automorphic number.\n");
        }
        else {
            tvAutomorphicResult.append(number + "is not an automorphic number.\n");
        }
    }
}
