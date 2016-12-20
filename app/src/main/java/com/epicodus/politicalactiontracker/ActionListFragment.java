package com.epicodus.politicalactiontracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jensese on 12/20/16.
 */

public class ActionListFragment extends Fragment {

//    Interface is used.
    public interface OnActionItemSelectedInterface {
        void onListActionItemSelected(int index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        OnActionItemSelectedInterface listener = (OnActionItemSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.action_fragment_list, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.actionListRecyclerView);
        ActionListAdapter actionListAdapter = new ActionListAdapter(listener);
        recyclerView.setAdapter(actionListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
