package com.example.hamstermessaging.ui.home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hamstermessaging.base.TabFragment;

import java.util.ArrayList;
import java.util.List;

public class TabHomeAdapter extends FragmentStatePagerAdapter {

    private final List<TabFragment> mFragmentList=new ArrayList<>();
    private final List<String> mFragmentTitleList=new ArrayList<>();
    private final List<Integer> mFragmentMenuList=new ArrayList<>();

    TabHomeAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(TabFragment fragment){
        mFragmentTitleList.add(fragment.title);
        mFragmentList.add(fragment);
        mFragmentMenuList.add(fragment.menu);
    }

    public int getMenuItem(int position){
        return mFragmentList.get(position).menu;
    }

    public int getAction(int position){
        return mFragmentList.get(position).action;
    }

    public int getPositionByMenuItem(int menuItem){
        return mFragmentMenuList.indexOf(menuItem);
    }
}
