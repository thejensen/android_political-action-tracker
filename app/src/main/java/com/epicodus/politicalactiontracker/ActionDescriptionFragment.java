package com.epicodus.politicalactiontracker;

import android.content.Intent;
import android.net.Uri;
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

public class ActionDescriptionFragment extends Fragment implements View.OnClickListener {
    @Bind(R.id.actionImageView) ImageView mActionImageView;
    @Bind(R.id.actionNameTextView) TextView mActionNameTextView;
    @Bind(R.id.dateTextView) TextView mDateTextView;
    @Bind(R.id.actionCategoryTextView) TextView mActionCategoryTextView;
    @Bind(R.id.causeTextView) TextView mCauseTextView;
    @Bind(R.id.linkTextView) TextView mLinkTextView;
    @Bind(R.id.descriptionTextView) TextView mDescriptionTextView;
    @Bind(R.id.locationTextView) TextView mLocationTextView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int index = getArguments().getInt(ViewPagerFragment.KEY_DESCRIPTION_INDEX);
        View view = inflater.inflate(R.layout.fragment_action_description, container, false);
        ButterKnife.bind(this, view);

        mActionImageView.setImageResource(Action.resourceIds[index]);
        mActionNameTextView.setText(Action.name[index]);
        mDateTextView.setText(Action.date[index]);
        mActionCategoryTextView.setText(Action.categoryAction[index]);
        mCauseTextView.setText(Action.categoryCause[index]);
        mDescriptionTextView.setText(Action.description[index]);
        mLocationTextView.setText(Action.location[index]);

        mLinkTextView.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int index = getArguments().getInt(ViewPagerFragment.KEY_DESCRIPTION_INDEX);

        if (v == mLinkTextView) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(Action.link[index]));
            startActivity(webIntent);
        }
    }
}
