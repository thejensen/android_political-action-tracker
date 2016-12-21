package com.epicodus.politicalactiontracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jensese on 12/20/16.
 */

public class ActionListFragment extends Fragment {
    @Bind(R.id.actionListRecyclerView) RecyclerView mActionListRecyclerView;

//    Interface is used.
    public interface OnActionItemSelectedInterface {
        void onListActionItemSelected(int index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        OnActionItemSelectedInterface listener = (OnActionItemSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.action_fragment_list, container, false);
        ButterKnife.bind(this, view);

        ActionListAdapter actionListAdapter = new ActionListAdapter(listener);
        mActionListRecyclerView.setAdapter(actionListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mActionListRecyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
