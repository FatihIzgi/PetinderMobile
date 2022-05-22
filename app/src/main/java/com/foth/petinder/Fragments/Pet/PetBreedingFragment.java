package com.foth.petinder.Fragments.Pet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Fragments.ContactViaMessage.ContactViaMessageFragment;
import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentPetBreedingBinding;

public class PetBreedingFragment extends Fragment {

    private FragmentPetBreedingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPetBreedingBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        binding.btnGetContactForBreeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new ContactViaMessageFragment());
            }
        });

        return view;
    }
    public boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentCV, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}