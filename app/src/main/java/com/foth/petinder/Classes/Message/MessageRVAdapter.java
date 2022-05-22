package com.foth.petinder.Classes.Message;

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

public class MessageRVAdapter extends RecyclerView.Adapter<MessageRVAdapter.CardViewsHolder>{

    private Context context;
    private List<Message> messages;

    public MessageRVAdapter(Context context, List<Message> messages) {
        this.context = context;
        this.messages = messages;
    }

    public class CardViewsHolder extends RecyclerView.ViewHolder {

        public CardView cardView;
        public ImageView profilePhoto;
        public TextView userName, startOfMessage;

        public CardViewsHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardViewFMessages);
            profilePhoto = itemView.findViewById(R.id.ivProfilePhotoFMessageCard);
            userName = itemView.findViewById(R.id.twUserNameFMessageCard);
            startOfMessage = itemView.findViewById(R.id.twStartOfMessageFMessageCard);
        }
    }

    @NonNull
    @Override
    public CardViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_messages,parent,false);
        return new CardViewsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewsHolder holder, int position) {
        Message message = messages.get(position);

        holder.profilePhoto.setImageResource(context.getResources().getIdentifier(message.getSenderPhoto(),"drawable",context.getPackageName()));
        holder.userName.setText(message.getSenderName());
        holder.startOfMessage.setText(message.getLastMessage());


    }

    @Override
    public int getItemCount() {
        return messages.size();
    }





}
