package com.foth.petinder.Classes.Pet;

import android.text.Layout;
import android.widget.ImageView;

import com.foth.petinder.R;

import java.util.ArrayList;

public class PetOptions {
    private ArrayList<String> options = new ArrayList();

    public void setOptions(){
        options.add("Köpek");
        options.add("Kedi");
        options.add("Balık");
        options.add("Tavşan");
        options.add("Kuş");
        options.add("Kaplumbağa");
        options.add("Örümcek");
        options.add("Hamster");
        options.add("Diğer");
    }

    public void setIcons(ImageView imageView, String option){
        if(option.equals("Köpek")){
            imageView.setImageResource(R.drawable.spinner_dog);
        }
        if(option.equals("Kedi")){
            imageView.setImageResource(R.drawable.spinner_cat);
        }
        if(option.equals("Balık")){
            imageView.setImageResource(R.drawable.spinner_fish);
        }
        if(option.equals("Tavşan")){
            imageView.setImageResource(R.drawable.spinner_rabbit);
        }
        if(option.equals("Kuş")){
            imageView.setImageResource(R.drawable.spinner_bird);
        }
        if(option.equals("Kaplumbağa")){
            imageView.setImageResource(R.drawable.spinner_turtle);
        }
        if(option.equals("Örümcek")){
            imageView.setImageResource(R.drawable.spinner_spider);
        }
        if(option.equals("Hamster")){
            imageView.setImageResource(R.drawable.spinner_hamster);
        }
        if(option.equals("Diğer")){
            imageView.setImageResource(R.drawable.spinner_other);
        }

    }

    public ArrayList<String> getOptions(){
        setOptions();
        return options;
    }

}
