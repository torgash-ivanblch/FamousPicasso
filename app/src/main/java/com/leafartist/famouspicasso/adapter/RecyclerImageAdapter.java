package com.leafartist.famouspicasso.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leafartist.famouspicasso.R;
import com.leafartist.famouspicasso.adapter.viewholders.RecyclerViewHolder;
import com.squareup.picasso.Picasso;


/**
 * Created by tonyofrancis on 9/2/14.
 */
public class RecyclerImageAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private int mResource;
    private Context mContext;
    private String[] mData;


    public RecyclerImageAdapter(Context context,int resource, String[] objects)
    {
        mContext = context;
        mResource = resource;
        mData = objects;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        /* This method inflates the view from the resource file,
        *  then adds it to a new viewHolder object.
        * */

        View rootView = LayoutInflater.from(mContext).inflate(mResource,viewGroup,false);


        return new RecyclerViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder viewHolder, int i) {

        /* This method binds the data from the viewHolder to a view*/

        /* The Picasso library (http://square.github.io/picasso/) is used for downloading and
         * caching images. This is done asynchronously.
         */

        Picasso.with(mContext)
                .load(mData[i])
                .resize(256,256)
                .placeholder(R.drawable.camera)
                .into(viewHolder.getmImageView());

    }

    @Override
    public int getItemCount() {
       return mData.length;
    }
}
