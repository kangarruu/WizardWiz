package com.example.android.wizardwiz;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class WizardFragmentPageAdapter extends FragmentPagerAdapter{
    private Context mContext;

    public WizardFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new EatFragment();
        } else if (position == 1){
            return new StayFragment();
        } else if (position == 2){
            return new ShopFragment();
        } else {
            return new SeeFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.eat);
        } else if (position == 1) {
            return mContext.getString(R.string.stay);
        } else if (position == 2) {
            return mContext.getString(R.string.shop);
        } else {
            return mContext.getString(R.string.see);
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
}
