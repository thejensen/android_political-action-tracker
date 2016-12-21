package com.epicodus.politicalactiontracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jensese on 12/20/16.
 */

public class ViewPagerFragment extends Fragment {
    public static final String KEY_ACTION_INDEX = "action_index";
    public static final String KEY_DESCRIPTION_INDEX = "description_index";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        Receive object in the Bundle depending on the index of the click in the list of actions
        int index = getArguments().getInt(KEY_ACTION_INDEX);
        getActivity().setTitle(Actions.name[index]);
        View view = inflater.inflate(R.layout.fragment_view_pager, container, false);

        final ActionDescriptionFragment actionDescriptionFragment = new ActionDescriptionFragment();
        Bundle bundleDesc = new Bundle();
        bundleDesc.putInt(KEY_DESCRIPTION_INDEX, index);
        actionDescriptionFragment.setArguments(bundleDesc);

        final ActionActFragment actionActFragment = new ActionActFragment();
        Bundle bundleAct = new Bundle();
        bundleAct.putInt(KEY_ACTION_INDEX, index);
        actionActFragment.setArguments(bundleAct);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager);
//        getChildFragmentManager is used when dealing with fragments within fragments
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return position == 0 ? actionDescriptionFragment : actionActFragment;
            }

//            How many tabs in the pager! 2!
            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return position == 0 ? "Description" : "Act";
            }
        });

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

//
    @Override
    public void onStop() {
        super.onStop();
        getActivity().setTitle(getResources().getString(R.string.app_name));
    }



}
