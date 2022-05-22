package com.foth.petinder.Fragments.ContactViaMessage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentContactViaMessageBinding;

public class ContactViaMessageFragment extends Fragment {

    private FragmentContactViaMessageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentContactViaMessageBinding.inflate(inflater,container,false);
        View view = binding.getRoot();


        return view;
    }
}