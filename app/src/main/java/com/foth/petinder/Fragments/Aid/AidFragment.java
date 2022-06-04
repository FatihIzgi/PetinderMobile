package com.foth.petinder.Fragments.Aid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.databinding.FragmentAidBinding;


public class AidFragment extends Fragment {

    private FragmentAidBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAidBinding.inflate(inflater,container,false);
        View view = binding.getRoot();


        return view;

    }
}