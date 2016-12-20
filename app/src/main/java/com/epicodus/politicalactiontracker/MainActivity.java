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

        ActionListFragment fragment = new ActionListFragment();
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeHolder, fragment);
        fragmentTransaction.commit();

    }

    @Override
    public void onListActionItemSelected(int index) {
        Toast.makeText(MainActivity.this, Actions.names[index], Toast.LENGTH_SHORT).show();
    }
}
