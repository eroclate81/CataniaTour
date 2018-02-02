package com.project.udacity.cataniatour.Data;

import android.content.Context;

import com.project.udacity.cataniatour.Data.GalleryData;
import com.project.udacity.cataniatour.Monuments;
import com.project.udacity.cataniatour.R;


import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by ROBERTO on 09/01/2018.
 */

public class MonumentsData
{

    ArrayList<Monuments> list=new ArrayList<>();

    /**
     * init data
     * @param context
     */
    public MonumentsData(Context context)
    {
        list.add(new Monuments(0, R.drawable.duomo,R.string.duomo,context.getString(R.string.desc_duomo),new GalleryData().getAllplaces()));
        list.add(new Monuments(1,R.drawable.etna,R.string.etna,context.getString(R.string.desc_etna),new GalleryData().getAllEtna()));
        list.add(new Monuments(2,R.drawable.mare,R.string.acitrezza,context.getString(R.string.desc_acitrezza),new GalleryData().getAllMare()));
        list.add(new Monuments(3,R.drawable.folklore,R.string.folklore,context.getString(R.string.desc_folklore), new GalleryData().getAllFolklore()));
    }

    public ArrayList<Monuments> getAll(){
    return list;
}

}
