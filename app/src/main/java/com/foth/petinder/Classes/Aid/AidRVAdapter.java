package com.foth.petinder.Classes.Aid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.recyclerview.widget.RecyclerView;

import com.foth.petinder.Classes.FragmentLoader.FragmentLoader;
import com.foth.petinder.Classes.Message.Message;
import com.foth.petinder.Classes.Message.MessageRVAdapter;
import com.foth.petinder.Fragments.Aid.AidFragment;
import com.foth.petinder.Fragments.MainPage.MainHomePageFragment;
import com.foth.petinder.Fragments.Pet.PetAdaptionFragment;
import com.foth.petinder.Fragments.Pet.PetAidFragment;
import com.foth.petinder.MainActivity;
import com.foth.petinder.R;

import java.util.List;

public class AidRVAdapter extends RecyclerView.Adapter<AidRVAdapter.CardViewsHolder>{

    private Context context;
    private List<Aid> aids;

    public AidRVAdapter(Context context, List<Aid> aids){
        this.context = context;
        this.aids = aids;
    }

    public class CardViewsHolder extends RecyclerView.ViewHolder {

        public CardView cardView;
        public ImageView profilePhto;
        public TextView location, aidExplanation;


        public CardViewsHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardViewAids);
            profilePhto = itemView.findViewById(R.id.ivProfilePhotoFAidCard);
            location = itemView.findViewById(R.id.aidLocationAids);
            aidExplanation = itemView.findViewById(R.id.twAidExplanationAids);
        }
    }

    @NonNull
    @Override
    public CardViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_aids,parent,false);
        return new CardViewsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewsHolder holder, int position) {

        Aid aid = aids.get(position);

        holder.profilePhto.setImageResource(context.getResources().getIdentifier(aid.getProfilePhoto(),"drawable",context.getPackageName()));
        holder.location.setText(aid.getLocation());
        holder.aidExplanation.setText(aid.getExplanation());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

    @Override
    public int getItemCount() {
        return aids.size();
    }

}
