package com.foth.petinder.Fragments.MainPage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

import com.foth.petinder.Classes.Message.MessageRVAdapter;
import com.foth.petinder.Classes.Pet.Pet;
import com.foth.petinder.Classes.User.User;
import com.foth.petinder.Classes.User.UserPetsAdapter;
import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentMainMessagesPageBinding;
import com.foth.petinder.databinding.FragmentMainProfilePageBinding;

import java.util.ArrayList;

public class MainProfilePageFragment extends Fragment {

    private FragmentMainProfilePageBinding binding;
    private UserPetsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = binding = FragmentMainProfilePageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        User user50 = new User(1,"Kullanıcı5");

        ArrayList<String> kopek1Photos = new ArrayList<>();
        ArrayList<String> kopek2Photos = new ArrayList<>();
        ArrayList<String> kopek3Photos = new ArrayList<>();
        ArrayList<String> kopek4Photos = new ArrayList<>();
        ArrayList<String> kedi1Photos = new ArrayList<>();
        ArrayList<String> kedi2Photos = new ArrayList<>();
        ArrayList<String> kedi3Photos = new ArrayList<>();

        kopek1Photos.add("dog");
        kopek1Photos.add("dog2");
        kopek1Photos.add("dog3");
        kopek1Photos.add("dog4");
        kopek2Photos.add("dog2");
        kopek3Photos.add("dog3");
        kopek3Photos.add("dog4");
        kopek4Photos.add("dog4");
        kopek4Photos.add("dog3");
        kopek4Photos.add("dog");

        kedi1Photos.add("cat");
        kedi1Photos.add("cat2");
        kedi2Photos.add("cat2");
        kedi3Photos.add("cat");

        Pet pet100 = new Pet(3,user50,"Köpek1",kopek1Photos,"Köpek",false,true);
        Pet pet130 = new Pet(3,user50,"Köpek2",kopek2Photos,"Köpek",false,true);
        Pet pet160 = new Pet(2,user50,"Köpek3",kopek3Photos,"Köpek",false,true);
        Pet pet170 = new Pet(3,user50,"Köpek4",kopek4Photos,"Köpek",false,true);
        Pet pet140= new Pet(1,user50,"Kedi1",kedi1Photos,"Kedi",true,false);
        Pet pet400 = new Pet(4,user50,"Kedi2",kedi2Photos,"Kedi",true,false);
        Pet pet200 = new Pet(4,user50,"Kedi3",kedi3Photos,"Kedi",true,false);

        ArrayList<Pet> user50sPets = new ArrayList<>();
        user50sPets.add(pet100);
        user50sPets.add(pet130);
        user50sPets.add(pet160);
        user50sPets.add(pet170);
        user50sPets.add(pet140);
        user50sPets.add(pet400);
        user50sPets.add(pet200);

        user50.setPets(user50sPets);

        binding.rvUserPets.setHasFixedSize(true);
        binding.rvUserPets.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        adapter = new UserPetsAdapter(getContext(),user50.getPets());

        binding.rvUserPets.setAdapter(adapter);




        return view;
    }
}