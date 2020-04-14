package com.shh.fragmentdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.shh.fragmentdemo.base.BaseFragment;

import java.util.List;

public class SubStatePagerAdapter extends FragmentStatePagerAdapter {
    private List<BaseFragment> fragments;
    private List<String> titles;

    public SubStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setData(List<BaseFragment> fragments, List<String> titles) {
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }
}
