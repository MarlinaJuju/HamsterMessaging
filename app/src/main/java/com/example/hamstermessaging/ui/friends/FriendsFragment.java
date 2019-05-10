package com.example.hamstermessaging.ui.friends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamstermessaging.R;
import com.example.hamstermessaging.base.TabFragment;

public class FriendsFragment extends TabFragment {

    @Override
    public void setBaseValue() {
        super.setBaseValue();
        title="Friends";
        menu=R.id.action_friends;
        action=R.menu.menu_friends;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }
}
