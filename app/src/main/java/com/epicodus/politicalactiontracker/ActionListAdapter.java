package com.epicodus.politicalactiontracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.support.v7.widget.RecyclerView.ViewHolder;

/**
 * Created by jensese on 12/20/16.
 */

public class ActionListAdapter extends RecyclerView.Adapter {
    private final ActionListFragment.OnActionItemSelectedInterface mListener;

    public ActionListAdapter(ActionListFragment.OnActionItemSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.action_list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
//        TODO: Someday soon the names array will NOT be sufficient to populate the recyclerview, once I start adding them to the database like a databoss.
        return Action.name.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @Bind(R.id.actionItemTextView) TextView mActionItemTextView;
        @Bind(R.id.actionItemImageView) ImageView mActionItemImageView;
        private int mIndex;

        public ListViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position) {
            mIndex = position;
            mActionItemTextView.setText(Action.name[position]);
            mActionItemImageView.setImageResource(Action.resourceIds[position]);
//            TODO: Add more stuff here...
        }

        @Override
        public void onClick(View v) {
            mListener.onListActionItemSelected(mIndex);
        }
    }
}
