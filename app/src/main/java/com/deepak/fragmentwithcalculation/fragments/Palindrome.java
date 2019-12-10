package com.deepak.fragmentwithcalculation.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deepak.fragmentwithcalculation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Palindrome extends Fragment {


    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_palindrome, container, false);
    }

}
