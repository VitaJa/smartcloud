package com.example.smartclouds;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ContentAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public ContentAdapter(Context context, FragmentManager fragmentManager, int totalTabs){
        super(fragmentManager);
        context = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                OrnamentFragment designFragment = new OrnamentFragment();
                return designFragment;
            case 1:
                FinishingFragment finishingFragment = new FinishingFragment();
                return finishingFragment;
            case 2:
                OrnamentFragment ornamentFragment = new OrnamentFragment();
                return ornamentFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
