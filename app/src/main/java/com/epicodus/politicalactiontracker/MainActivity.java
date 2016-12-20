package com.epicodus.politicalactiontracker;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ActionListFragment.OnActionItemSelectedInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Create a new Fragment that displays on the Main Activity if there isn't already a Fragment created -- new fragments would be created if the user goes to landscape view
        ActionListFragment savedFragment = (ActionListFragment) getFragmentManager().findFragmentById(R.id.placeHolder);
        if (savedFragment == null) {
            ActionListFragment fragment = new ActionListFragment();
            FragmentManager fragmentManager = getFragmentManager();
            android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeHolder, fragment);
            fragmentTransaction.commit();
        }
    }

//    List item selected from the actions list creates a new ViewPagerFragment which replaces the previous fragment's place in the placeholder ViewGroup in the Main Activity layout. Neat.
    @Override
    public void onListActionItemSelected(int index) {
        Toast.makeText(MainActivity.this, Actions.names[index], Toast.LENGTH_SHORT).show();

        ViewPagerFragment fragment = new ViewPagerFragment();
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeHolder, fragment);
        fragmentTransaction.commit();

    }
}
