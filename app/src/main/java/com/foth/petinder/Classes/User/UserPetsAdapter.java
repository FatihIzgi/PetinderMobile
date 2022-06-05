package com.foth.petinder.Classes.User;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.foth.petinder.Classes.Pet.Pet;
import com.foth.petinder.R;

import java.util.List;

public class UserPetsAdapter extends RecyclerView.Adapter<UserPetsAdapter.CardViewsHolder>{

    private Context context;
    private List<Pet> userPetList;

    public UserPetsAdapter(Context context, List<Pet> userPetList){
        this.context = context;
        this.userPetList = userPetList;
    }

    public class CardViewsHolder extends RecyclerView.ViewHolder {
        public ImageView userPetImage;
        public TextView userPetName;

        public CardViewsHolder(@NonNull View itemView) {
            super(itemView);
            userPetImage = itemView.findViewById(R.id.userPetPhoto);
            userPetName = itemView.findViewById(R.id.twUserPetName);
        }
    }


    @NonNull
    @Override
    public CardViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_user_pets,parent,false);
        return new CardViewsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewsHolder holder, int position) {

        Pet pet = userPetList.get(position);
        holder.userPetImage.setImageResource(context.getResources().getIdentifier(pet.getPhotos().get(0),"drawable",context.getPackageName()));
        holder.userPetName.setText(pet.getName());

    }

    @Override
    public int getItemCount() {
        return userPetList.size();
    }

}
