package com.leafartist.famouspicasso.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.leafartist.famouspicasso.R;
import com.leafartist.famouspicasso.adapter.PicassoImageAdapter;
import com.leafartist.famouspicasso.adapter.RecyclerImageAdapter;


/**
 * Created by tonyofrancis on 9/2/14.
 */
public class PicassoListFragment extends Fragment {

//    private PicassoImageAdapter mAdapter;
//    private ListView mListView;


    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private RecyclerImageAdapter mRecyclerAdapter;

    public PicassoListFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        View rootView = inflater.inflate(R.layout.recycler_layout, container, false);

//        mListView = (ListView) rootView.findViewById(R.id.PicassoListView);
//
//        //Create & set Picasso list adapter
//        mAdapter = new PicassoImageAdapter(getActivity(),R.layout.list_image_item,getResources().getStringArray(R.array.paintings_url));
//
//        mListView.setAdapter(mAdapter);


        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.PicassoRecyclerView);

        mRecyclerView.setHasFixedSize(true); // improves performance because we know the data size

        /*
        *  The RecyclerView does not manage the layout and visuals of child views itself.
        *  It requires a LayoutManager to handle all visuals for its child views.
        *  Here we are using a LinearLayoutManager to handle visuals.
        * */

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Create & set RecyclerView adapter
        mRecyclerAdapter = new RecyclerImageAdapter(getActivity(),R.layout.list_image_item,getResources().getStringArray(R.array.paintings_url));
        mRecyclerView.setAdapter(mRecyclerAdapter);


        return rootView;
    }
}
