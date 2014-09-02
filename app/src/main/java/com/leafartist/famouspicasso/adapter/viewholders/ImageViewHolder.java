package com.leafartist.famouspicasso.adapter.viewholders;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by tonyofrancis on 9/2/14.
 */
public class ImageViewHolder {

    private ImageView imageView;

    public ImageViewHolder()
    {

    }

    public ImageViewHolder(View view)
    {
        imageView = (ImageView) view;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

}
