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

import com.example.test1.R;
import com.example.test1.main.adapter.NewsAdapter;
import com.example.test1.main.main_data.BasicResponse;
import com.example.test1.main.main_data.Items;
import com.example.test1.main.view_model.MainViewModel;

import java.util.ArrayList;
import java.util.List;

public class PageFragmentOnline extends Fragment {
    private static final String PAGE = "page";

    public static PageFragmentOnline newInstance(Integer counter) {
        PageFragmentOnline fragment = new PageFragmentOnline();
        Bundle args = new Bundle();
        args.putInt(PAGE, counter);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewModelProviders.of(requireActivity()).get(MainViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rec = view.findViewById(R.id.list_of_news);

        RecyclerView.LayoutManager manager =
                new LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false);
        rec.setLayoutManager(manager);

        NewsAdapter adapter = new NewsAdapter(new ArrayList<>());

        rec.setAdapter(adapter);

        MainViewModel mvm = ViewModelProviders.of(this).get(MainViewModel.class);
        LiveData<BasicResponse> data = mvm.getData();

        data.observe(requireActivity(), basicResponse ->
        {
            List<Items> items = basicResponse.getBody().getResults();

            adapter.setList(items);
        });
    }
}