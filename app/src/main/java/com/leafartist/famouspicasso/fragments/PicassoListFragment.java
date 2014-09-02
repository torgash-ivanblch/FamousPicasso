package com.leafartist.famouspicasso.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.leafartist.famouspicasso.R;
import com.leafartist.famouspicasso.adapter.PicassoImageAdapter;


/**
 * Created by tonyofrancis on 9/2/14.
 */
public class PicassoListFragment extends Fragment {

    private PicassoImageAdapter mAdapter;
    private ListView mListView;

    public PicassoListFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mListView = (ListView) rootView.findViewById(R.id.PicassoListView);

        //Create & set Picasso list adapter
        mAdapter = new PicassoImageAdapter(getActivity(),R.layout.list_image_item,getResources().getStringArray(R.array.paintings_url));

        mListView.setAdapter(mAdapter);

        return rootView;
    }
}
