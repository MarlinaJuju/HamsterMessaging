package com.example.hamstermessaging.ui.news;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamstermessaging.R;
import com.example.hamstermessaging.base.TabFragment;

public class NewsFragment extends TabFragment {

    @Override
    public void setBaseValue() {
        super.setBaseValue();
        title="News";
        menu=R.id.action_news;
        action=R.menu.menu_news;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false);
    }
}
