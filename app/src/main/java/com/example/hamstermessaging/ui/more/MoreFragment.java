package com.example.hamstermessaging.ui.more;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamstermessaging.R;
import com.example.hamstermessaging.base.TabFragment;

public class MoreFragment extends TabFragment {

    @Override
    public void setBaseValue() {
        super.setBaseValue();
        title="More";
        menu=R.id.action_more;
        action=R.menu.menu_more;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_more, container, false);
    }
}
