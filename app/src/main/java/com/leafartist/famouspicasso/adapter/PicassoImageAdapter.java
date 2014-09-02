package com.leafartist.famouspicasso.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.leafartist.famouspicasso.R;
import com.leafartist.famouspicasso.adapter.viewholders.ImageViewHolder;
import com.squareup.picasso.Picasso;

/**
 * Created by tonyofrancis on 9/2/14.
 */
public class PicassoImageAdapter extends ArrayAdapter<String> {

    private Context mContext;
    private int mResource;
    private String[] mData;

    public PicassoImageAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);

        mContext = context;
        mData = objects;
        mResource = resource;
    }

    @Override
    public int getCount() {
        return mData.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rootView = convertView;

        /*
        * This Adapter Uses the ViewHolder Pattern
        * */

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            rootView = inflater.inflate(mResource, parent, false);

            rootView.setTag( new ImageViewHolder(rootView));
        }


        ImageViewHolder holder = (ImageViewHolder) rootView.getTag();



        /* The Picasso library (http://square.github.io/picasso/) is used for downloading and
         * caching images. This is done asynchronously.
        */

        Picasso.with(mContext)
                .load(mData[position])
                .resize(256,256)
                .placeholder(R.drawable.camera)
                .into(holder.getImageView());


        return rootView;

    }
}
