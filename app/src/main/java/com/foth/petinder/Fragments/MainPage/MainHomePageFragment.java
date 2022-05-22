package com.foth.petinder.Fragments.MainPage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Fragments.MainPet.MainPetAdoptionFragment;
import com.foth.petinder.Fragments.MainPet.MainPetAidFragment;
import com.foth.petinder.Fragments.MainPet.MainPetBreedingFragment;
import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentMainHomePageBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainHomePageFragment extends Fragment {

    private FragmentContainerView fragmentCVf;
    private FragmentMainHomePageBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainHomePageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        loadAdoptionFragmentAsDefaultOnTheHomePage();


        binding.upnav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.mainPetAdoptionFragment:
                        fragment = new MainPetAdoptionFragment();
                        break;
                    case R.id.mainPetBreedingFragment:
                        fragment = new MainPetBreedingFragment();
                        break;
                    case R.id.mainPetAidFragment:
                        fragment = new MainPetAidFragment();
                        break;
                }
                return loadFragment(fragment);
            }
        });

        return view;
    }

    public boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getParentFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentCVf, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    private boolean loadAdoptionFragmentAsDefaultOnTheHomePage() {
        Fragment fragment = new MainPetAdoptionFragment();
        if (fragment != null) {
            getParentFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentCVf, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}