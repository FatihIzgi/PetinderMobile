package com.foth.petinder.Fragments.Aid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Classes.Aid.Aid;
import com.foth.petinder.Classes.User.User;
import com.foth.petinder.databinding.FragmentCreatingNewAidBinding;

import java.util.ArrayList;

public class CreatingNewAidFragment extends Fragment {

    private FragmentCreatingNewAidBinding binding;
    public static ArrayList<Aid> aidList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCreatingNewAidBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        binding.btnCreateAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String location = binding.etLocationAid.getText().toString();
                //String explanation = binding.etExplanationAid.getText().toString();
                aidList.add(new Aid(new User(1,"Fff"),"İzmir/Bornova","Sokak hayvanları için mama yardımı toplamaktayız. İlgiliniz için şimdiden teşekkürler :)"));
                aidList.add(new Aid(new User(1,"Fff"),"Pendik/İstanbul","Yaralı olarak bulduğumuz bu yavru için veteriner aramaktayız."));
                aidList.add(new Aid(new User(1,"Fff"),"İzmir/Karşıyaka","Kedimin aşıları için desteğe ihtiyacım var."));
                aidList.add(new Aid(new User(1,"Fff"),"Bursa/Osmangazi","Köpekler için elinde fazladan oyuncak olan var mıdır ?"));
                aidList.add(new Aid(new User(1,"Fff"),"İzmir/Bornova","Elimdeki fazla kedi mamasını ihtiyacı olanlara ulaştırmak istiyorum."));
            }
        });

        return view;
    }
}