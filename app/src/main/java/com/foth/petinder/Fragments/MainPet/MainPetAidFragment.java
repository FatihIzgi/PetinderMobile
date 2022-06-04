package com.foth.petinder.Fragments.MainPet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Classes.Aid.Aid;
import com.foth.petinder.Classes.Aid.AidRVAdapter;
import com.foth.petinder.Classes.ExampleObjectsProvider;
import com.foth.petinder.Classes.User.User;
import com.foth.petinder.Fragments.Aid.CreatingNewAidFragment;
import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentMainpetAidBinding;

import java.util.ArrayList;
import java.util.List;

public class MainPetAidFragment extends Fragment {

    private FragmentMainpetAidBinding binding;
    private AidRVAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainpetAidBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new CreatingNewAidFragment());
            }
        });


        adapter = new AidRVAdapter(getContext(),CreatingNewAidFragment.aidList);

        binding.AidsRv.setHasFixedSize(true);
        binding.AidsRv.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new AidRVAdapter(getContext(),CreatingNewAidFragment.aidList);

        binding.AidsRv.setAdapter(adapter);


        return view;
    }
    public boolean loadFragment(Fragment fragment) {
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