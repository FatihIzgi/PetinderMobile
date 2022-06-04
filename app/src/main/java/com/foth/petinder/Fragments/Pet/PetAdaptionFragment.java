package com.foth.petinder.Fragments.Pet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Classes.Pet.Pet;
import com.foth.petinder.Fragments.ContactViaMessage.ContactViaMessageFragment;
import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentPetAdaptionBinding;
import com.foth.petinder.databinding.FragmentPetBreedingBinding;

import java.util.ArrayList;

public class PetAdaptionFragment extends Fragment {

    private FragmentPetAdaptionBinding binding;
    public static Pet currentPet = new Pet();
    private int photoListIndex;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPetAdaptionBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        loadPage(currentPet);
        photoListIndex = 0;

        binding.imageNextPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Güncel foto indeksi = ", String.valueOf(photoListIndex));
                if(photoListIndex<currentPet.getPhotos().size()) {
                    if(photoListIndex!=currentPet.getPhotos().size()-1){
                        photoListIndex++;
                    }
                    changePetPhoto(currentPet);
                    Log.i("Basınca bu oldu = ", String.valueOf(photoListIndex));
                }
            }
        });

        binding.imagePrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Güncel foto indeksi = ", String.valueOf(photoListIndex));
                if(photoListIndex>0){
                    photoListIndex--;
                    changePetPhoto(currentPet);
                    Log.i("Basınca bu oldu = ", String.valueOf(photoListIndex));
                }
            }
        });

        binding.btnGetContactForAdoption.setOnClickListener(new View.OnClickListener() {
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

    public void loadPage(Pet pet){
        binding.uuserName.setText(pet.getUser().getName());
        binding.petPhoto.setImageResource(getResources().getIdentifier(pet.getPhotos().get(0), "drawable",getContext().getPackageName()));
        binding.petName.setText(pet.getName());
    }

    public void changePetPhoto(Pet pet){
        if(photoListIndex>=0 && photoListIndex<pet.getPhotos().size()){
            binding.petPhoto.setImageResource(getResources().getIdentifier(pet.getPhotos().get(photoListIndex), "drawable",getContext().getPackageName()));
        }

    }

}