package com.epicodus.politicalactiontracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ActionListFragment.OnActionItemSelectedInterface {
    public static final String LIST_FRAGMENT = "list_fragment";
    public static final String VIEW_PAGER_FRAGMENT = "view_pager_fragment";
    @Bind(R.id.addActionButton) Button mAddActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        Create a new Fragment that displays on the Main Activity if there isn't already a Fragment created -- new fragments would be created if the user goes to landscape view, and find its ID by tag, rather than index
        ActionListFragment savedFragment = (ActionListFragment) getSupportFragmentManager()
                .findFragmentByTag(LIST_FRAGMENT);
        if (savedFragment == null) {
            ActionListFragment fragment = new ActionListFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            Add LIST_FRAGMENT tag because the app was looking up list fragment based on the ID of the placeholder view group which might not be holding the ID.
            fragmentTransaction.add(R.id.placeHolder, fragment, LIST_FRAGMENT);
            fragmentTransaction.commit();
        }

        mAddActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActionActivity.class);
                startActivity(intent);
            }
        });
    }

//    List item selected from the actions list creates a new ViewPagerFragment which replaces the previous fragment's place in the placeholder ViewGroup in the Main Activity layout. Neat.
    @Override
    public void onListActionItemSelected(int index) {
        ViewPagerFragment fragment = new ViewPagerFragment();
//        Sending the ViewPager some info!
        Bundle bundle = new Bundle();
        bundle.putInt(ViewPagerFragment.KEY_ACTION_INDEX, index);
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeHolder, fragment, VIEW_PAGER_FRAGMENT);
//        Adding the fragment to the backstack, so the back button goes from the ViewPagerFragment to the ActivityListFragment
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
