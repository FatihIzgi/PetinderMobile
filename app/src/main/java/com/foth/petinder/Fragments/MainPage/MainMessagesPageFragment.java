package com.foth.petinder.Fragments.MainPage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Classes.Message.Message;
import com.foth.petinder.Classes.Message.MessageRVAdapter;
import com.foth.petinder.databinding.FragmentMainMessagesPageBinding;

import java.util.ArrayList;
import java.util.List;


public class MainMessagesPageFragment extends Fragment {

    private FragmentMainMessagesPageBinding binding;
    private List<Message> messages = new ArrayList<>();
    private MessageRVAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainMessagesPageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        messages.add(new Message("fizgi","Fatih İzgi","Merhabalar, ben sahiplendirmek istediği..."));
        messages.add(new Message("user_pp_example5","Zehra Mollalar","Verdiğiniz adreste görüşmek üzere :)"));
        messages.add(new Message("user_pp_example6","Buse Eski","Veteriner masraflarına yardımcı olab..."));
        messages.add(new Message("user_pp_example4","İdil Kuşçu","En kısa zamanda yazacağım."));
        messages.add(new Message("kasartarkan","Tarkan Peynirci","Mama desteğiniz için çok teşekkürler :))"));

        binding.messagesRV.setHasFixedSize(true);
        binding.messagesRV.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new MessageRVAdapter(getContext(),messages);

        binding.messagesRV.setAdapter(adapter);


        return view;
    }
}