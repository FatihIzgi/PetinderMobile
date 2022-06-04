package com.foth.petinder.Classes.Aid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

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
        public TextView location, aidExplanation;


        public CardViewsHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardViewAids);
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
