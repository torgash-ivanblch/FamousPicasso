package com.leafartist.famouspicasso.adapter.viewholders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by tonyofrancis on 9/2/14.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageView;


    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mImageView = (ImageView) itemView;
    }


    public ImageView getmImageView() {
        return mImageView;
    }

    public void setmImageView(ImageView mImageView) {
        this.mImageView = mImageView;
    }


}
