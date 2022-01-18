package com.example.todamanager02.boarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.todamanager02.databinding.FragmentBoardBinding;


import java.util.ArrayList;


public class BoardFragment extends Fragment {
    private FragmentBoardBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBoardBinding.inflate(getLayoutInflater(),container,false);
        return binding.getRoot();

    }
}