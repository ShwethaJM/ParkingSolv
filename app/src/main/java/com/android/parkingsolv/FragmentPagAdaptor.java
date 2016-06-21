package com.android.parkingsolv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by HARSHA on 20-06-2016.
 */
public class FragmentPagAdaptor extends FragmentPagerAdapter {
    public FragmentPagAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new TodayOffersFragment();
            case 1: return new MyCashFragment();
            case 2: return new CheckOfferFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
