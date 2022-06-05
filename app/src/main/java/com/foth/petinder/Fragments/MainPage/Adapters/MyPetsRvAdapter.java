package com.foth.petinder.Fragments.MainPage.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.foth.petinder.R;

import java.util.List;

public class MyPetsRvAdapter extends RecyclerView.Adapter<MyPetsRvAdapter.MyView> {

    private List<Integer> list; //This list holds dogs' pics.

    //View holder class which
    //extends RecyclerView.ViewHolder
    public class MyView extends RecyclerView.ViewHolder {


        //Images
        ImageView dogImage;

        //constructor with dogs' pics parameter
        public MyView(View view){
            super(view);

            dogImage = (ImageView) view.findViewById(R.id.myPetsDogImageView);

        }
    }

    public MyPetsRvAdapter(List<Integer> dogImagesList){
        this.list = dogImagesList;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType){

        View itemView = LayoutInflater.from(parent.getContext())
                                        .inflate(R.layout.profile_page_my_pets_rv_item,parent,false);

        //Return itemview
        return new MyView(itemView);
    }

    @Override
    public void onBindViewHolder(final MyView holder, final int position){

        int uri = list.get(position);
        Glide.with(holder.itemView.getContext()).load(uri).into(holder.dogImage);
    }

    @Override
    public int getItemCount(){
        return list.size();
    }
}
