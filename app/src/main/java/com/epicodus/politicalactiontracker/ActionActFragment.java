package com.epicodus.politicalactiontracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jensese on 12/20/16.
 */

public class ActionActFragment extends Fragment {
    @Bind(R.id.actionActLayout) LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        This bundle comes from the ViewPagerFragment!
        int index = getArguments().getInt(ViewPagerFragment.KEY_ACTION_INDEX);
        View view = inflater.inflate(R.layout.fragment_action_act, container, false);
        ButterKnife.bind(this, view);

        String shareable = Actions.iDidThis[index];
        setUpCheckBoxes(shareable, linearLayout);

        return view;
    }

    private void setUpCheckBoxes(String shareable, ViewGroup container) {
        CheckBox checkBox = new CheckBox(getActivity());
        checkBox.setPadding(8, 16, 8, 16);
        checkBox.setTextSize(20f);
        checkBox.setText(shareable);
        container.addView(checkBox);
    }
}
