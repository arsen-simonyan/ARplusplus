package com.example.test1.main.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.test1.main.PageFragmentOffline;
import com.example.test1.main.PageFragmentOnline;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private static final int TABS_SIZE = 2;

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return  position == 0 ?
                PageFragmentOnline.newInstance(position) :
                PageFragmentOffline.newInstance(position);
    }

    @Override public int getItemCount() {
        return TABS_SIZE;
    }
}
