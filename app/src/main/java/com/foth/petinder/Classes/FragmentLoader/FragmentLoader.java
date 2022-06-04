package com.foth.petinder.Classes.FragmentLoader;

import androidx.fragment.app.Fragment;

import com.foth.petinder.Fragments.Pet.PetEmptyMessageFragment;
import com.foth.petinder.R;

public class FragmentLoader extends Fragment {

    private static FragmentLoader singleton;

    private FragmentLoader(){

    };

    public static FragmentLoader getInstance(){
        if(singleton==null){
            synchronized(FragmentLoader.class){
                if(singleton==null){
                    singleton = new FragmentLoader();
                }
            }
        }
        return singleton;
    }






}
