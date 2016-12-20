package com.epicodus.politicalactiontracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by jensese on 12/20/16.
 */

public class ViewPagerFragment extends Fragment {
    public static final String KEY_ACTION_INDEX = "action_index";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        Receive object in the Bundle depending on the index of the click in the list of actions
        int index = getArguments().getInt(KEY_ACTION_INDEX);
        Toast.makeText(getActivity(), Actions.names[index], Toast.LENGTH_SHORT).show();

        View view = inflater.inflate(R.layout.fragment_view_pager, container, false);
        return view;
    }
}
