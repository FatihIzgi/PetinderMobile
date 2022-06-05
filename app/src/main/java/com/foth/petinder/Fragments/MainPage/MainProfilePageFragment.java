package com.foth.petinder.Fragments.MainPage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.R;
import com.foth.petinder.Fragments.MainPage.Adapters.MyPetsRvAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainProfilePageFragment extends Fragment {

    //Adding recycler view
    private RecyclerView myPetsRv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_main_profile_page, container, false);

        //Satırları recycler view yaratmak için ekliyoruz.
        myPetsRv = view.findViewById(R.id.my_pets_rv);
        myPetsRv.setHasFixedSize(true);
        myPetsRv.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false));
        myPetsRv.setAdapter(new MyPetsRvAdapter(getImageList()));
        return view;
    }

    private List<Integer> getImageList(){
        //Image list;
        ArrayList<Integer> imageList = new ArrayList<>();

        imageList.add(R.drawable.pet1);
        imageList.add(R.drawable.pet2);
        imageList.add(R.drawable.pet3);
        imageList.add(R.drawable.pet4);
        imageList.add(R.drawable.pet5);

        return imageList;
    }
}