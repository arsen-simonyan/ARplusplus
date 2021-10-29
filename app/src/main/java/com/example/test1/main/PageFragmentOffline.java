package com.example.test1.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.test1.R;
import com.example.test1.main.adapter.NewsAdapter;
import com.example.test1.main.main_data.Items;
import com.example.test1.main.view_model.RoomViewModel;

import java.util.ArrayList;
import java.util.List;

public class PageFragmentOffline extends Fragment {
    private static final String PAGE = "page";

    public static PageFragmentOffline newInstance(Integer counter) {
        PageFragmentOffline fragment = new PageFragmentOffline();
        Bundle args = new Bundle();
        args.putInt(PAGE, counter);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewModelProviders.of(requireActivity()).get(RoomViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LottieAnimationView anim = view.findViewById(R.id.lottie_empty);
        RecyclerView rec = view.findViewById(R.id.list_of_news);


        RecyclerView.LayoutManager manager =
                new LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false);
        rec.setLayoutManager(manager);

        NewsAdapter adapter = new NewsAdapter(new ArrayList<>());

        rec.setAdapter(adapter);

        RoomViewModel rvm = ViewModelProviders.of(this).get(RoomViewModel.class);
        LiveData<List<Items>> data = rvm.getData();

        data.observe(requireActivity(), items -> {
            if(items.size() == 0){
                rec.setVisibility(View.GONE);
                anim.setVisibility(View.VISIBLE);
            }else
            {
                rec.setVisibility(View.VISIBLE);
                anim.setVisibility(View.GONE);
            }
        });
    }
}