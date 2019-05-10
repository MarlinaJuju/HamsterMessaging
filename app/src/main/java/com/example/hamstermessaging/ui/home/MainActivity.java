

package com.example.hamstermessaging.ui.home;

import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.hamstermessaging.R;
import com.example.hamstermessaging.ui.chats.ChatFragment;
import com.example.hamstermessaging.ui.friends.FriendsFragment;
import com.example.hamstermessaging.ui.more.MoreFragment;
import com.example.hamstermessaging.ui.news.NewsFragment;
import com.example.hamstermessaging.ui.timeline.TimelineFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;
import butterknife.OnPageChange;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.viewpager)
    ViewPager mSlidingViewPager;
    @BindView(R.id.main_toolbar)
    Toolbar mToolbar;
    @BindView(R.id.bottom_navigation)
    BottomNavigationView mBottomNavigationView;

    Unbinder mUnbinder;

    TabHomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUnbinder= ButterKnife.bind(this);

        adapter=new TabHomeAdapter(getSupportFragmentManager());
        adapter.addFragment(new FriendsFragment());
        adapter.addFragment(new ChatFragment());
        adapter.addFragment(new TimelineFragment());
        adapter.addFragment(new NewsFragment());
        adapter.addFragment(new MoreFragment());

        mSlidingViewPager.setAdapter(adapter);
        mToolbar.setTitle(adapter.getPageTitle(0));
        mToolbar.inflateMenu(R.menu.menu_friends);

        mBottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            int position=adapter.getPositionByMenuItem(menuItem.getItemId());
            mSlidingViewPager.setCurrentItem(position);
            mToolbar.getMenu().clear();
            mToolbar.inflateMenu(adapter.getAction(position));
            return true;
        });
    }

    @OnPageChange(R.id.viewpager)
    void onPageSelected(int position) {
        mToolbar.setTitle(adapter.getPageTitle(position));
        mBottomNavigationView.setSelectedItemId(adapter.getMenuItem(position));
    }
}
