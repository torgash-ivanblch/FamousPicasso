package com.leafartist.famouspicasso;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


import com.leafartist.famouspicasso.fragments.PicassoListFragment;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Activity Fragments here
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PicassoListFragment())
                    .commit();
        }
    }

}
