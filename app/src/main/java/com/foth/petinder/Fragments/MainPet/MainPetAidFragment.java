package com.foth.petinder.Fragments.MainPet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foth.petinder.Classes.Aid.Aid;
import com.foth.petinder.Classes.Aid.AidRVAdapter;
import com.foth.petinder.Classes.Message.Message;
import com.foth.petinder.R;
import com.foth.petinder.databinding.FragmentMainpetAidBinding;
import com.foth.petinder.databinding.FragmentPetAidBinding;

import java.util.ArrayList;
import java.util.List;

public class MainPetAidFragment extends Fragment {

    private FragmentMainpetAidBinding binding;
    private List<Aid> aids = new ArrayList<>();
    private AidRVAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainpetAidBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        aids.add(new Aid("user_pp_example1","İzmir/Bornova","Evil hayvanımın mama ihtiyacını karşılayabilmek için mama desteğine ihtiyacım var."));
        aids.add(new Aid("user_pp_example2","İstanbul/Pendik","Sokakata bulduğum bu 2 kedinin veterinere götürülmesi gerekmektedir."));
        aids.add(new Aid("user_pp_example3","İzmir/Karşıyaka","Mahallemizdeki başıboş köpekler için aşı ihtiyacımız vardır."));
        aids.add(new Aid("user_pp_example4","Bursa/Osmangazi","Papağanlar için getirilen xXx yeminin temin edilememesi sonucu zor durumda kaldım."));
        aids.add(new Aid("user_pp_example5","Eskişehir/Sivrihisar","Sokakataki 2 kedinin veterinere götürülmesi gerekmektedir."));
        aids.add(new Aid("user_pp_example6","Rize/Çayeli","Dün sokak köpeklerinin dövüştürüldüğüne dair alınan haber doğrultusunda hukuki desteğe ihtiyacım var."));
        aids.add(new Aid("user_pp_example7","Hatay/Samandağ","Kedim için tırmalama tahtası almak istiyorum fakat öğrenciyim ve desteklerinizi bekliyorum."));

        adapter = new AidRVAdapter(getContext(),aids);

        binding.AidsRv.setHasFixedSize(true);
        binding.AidsRv.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new AidRVAdapter(getContext(),aids);

        binding.AidsRv.setAdapter(adapter);


        return view;
    }
}