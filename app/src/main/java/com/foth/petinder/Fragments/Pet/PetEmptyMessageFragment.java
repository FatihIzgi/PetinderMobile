package com.foth.petinder.Fragments.Pet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Fragments.MainPet.MainPetAdoptionFragment;
import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentPetEmptyMessageBinding;

public class PetEmptyMessageFragment extends Fragment {

    private FragmentPetEmptyMessageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPetEmptyMessageBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment();
            }
        });

        return view;
    }

    public boolean loadFragment() {
        Fragment fragment = new MainPetAdoptionFragment();
        if (fragment != null) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentCVf, fragment)
                    .commit();
            return true;
        }
        return false;
    }


}