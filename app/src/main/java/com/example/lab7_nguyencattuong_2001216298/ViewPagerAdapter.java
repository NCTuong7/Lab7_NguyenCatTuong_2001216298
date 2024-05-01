package com.example.lab7_nguyencattuong_2001216298;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new FragmentCuli();
            case 1:
                return new FragmentMoka();
            case 2:
                return new FragmentRobusta();
            default:
                return new FragmentCuli();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position)
        {
            case 0:
                title = "Culi";
                break;
            case 1:
                title = "Moka";
                break;
            case 2:
                title = "Robusta";
                break;
            default:
                title = "Culi";
        }
        return title;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
