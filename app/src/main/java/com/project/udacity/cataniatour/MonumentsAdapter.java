package com.project.udacity.cataniatour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ROBERTO on 08/01/2018.
 */

public class MonumentsAdapter extends ArrayAdapter<Monuments> {

        ArrayList<Monuments> _list;

    public MonumentsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Monuments> list) {
        super(context, resource, list);
        _list=list;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View rootView=convertView;

        if(convertView==null)
        {
           rootView= LayoutInflater.from(getContext()).inflate(R.layout.monument_item_row,null);
        }
            ImageView imgview=rootView.findViewById(R.id.imgdocument);
            TextView textDescription=rootView.findViewById(R.id.text_description);

            imgview.setImageResource(_list.get(position).getPreview());
            textDescription.setText(getContext().getText(_list.get(position).getTitle()));


        return rootView;
    }


}
