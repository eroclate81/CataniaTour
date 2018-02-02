package com.project.udacity.cataniatour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by ROBERTO on 09/01/2018.
 */

public class imagesAdapter extends BaseAdapter {

    Context mContext;
    ArrayList<Integer> mList;


    public  imagesAdapter(Context context, ArrayList<Integer> list)
    {
        mContext=context;
        mList=list;
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup)
    {
        ImageView imageView;
        if (convertView == null) {
            // If the view is not recycled, this creates a new ImageView to hold an image
            imageView = new ImageView(mContext);
            // Define the layout parameters
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200,200));

        } else {
            imageView = (ImageView) convertView;
        }

        // Set the image resource and return the newly created ImageView
        imageView.setImageResource(mList.get(position));
        return imageView;





}
}
