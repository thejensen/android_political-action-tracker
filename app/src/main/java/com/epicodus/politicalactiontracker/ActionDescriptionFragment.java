package com.epicodus.politicalactiontracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jensese on 12/20/16.
 */

public class ActionDescriptionFragment extends Fragment {
    @Bind(R.id.actionImageView) ImageView mActionImageView;
    @Bind(R.id.actionNameTextView) TextView mActionNameTextView;
    @Bind(R.id.dateTextView) TextView mDateTextView;
    @Bind(R.id.actionCategoryTextView) TextView mActionCategoryTextView;
    @Bind(R.id.causeTextView) TextView mCauseTextView;
    @Bind(R.id.linkTextView) TextView mLinkTextView;
    @Bind(R.id.descriptionTextView) TextView mDescriptionTextView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int index = getArguments().getInt(ViewPagerFragment.KEY_DESCRIPTION_INDEX);
        View view = inflater.inflate(R.layout.fragment_action_description, container, false);
        ButterKnife.bind(this, view);

        mActionImageView.setImageResource(Actions.resourceIds[index]);
        mActionNameTextView.setText(Actions.names[index]);
        mDateTextView.setText(Actions.date[index]);
        mActionCategoryTextView.setText(Actions.categoryAction[index]);
        mCauseTextView.setText(Actions.categoryCause[index]);
        mLinkTextView.setText(Actions.link[index]);
        mDescriptionTextView.setText(Actions.description[index]);

        return view;
    }
}
