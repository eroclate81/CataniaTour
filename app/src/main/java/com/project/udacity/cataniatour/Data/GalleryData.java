package com.project.udacity.cataniatour.Data;

import com.project.udacity.cataniatour.R;

import java.util.ArrayList;

/**
 * Created by ROBERTO on 09/01/2018.
 */

public class GalleryData {



    public ArrayList<Integer> getAllplaces()
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(R.drawable.duomo2);
        list.add(R.drawable.duomo3);

        return list;
    }

    public ArrayList<Integer> getAllEtna(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(R.drawable.etna1);
        list.add(R.drawable.etna2);
        list.add(R.drawable.etna3);
        list.add(R.drawable.etna4);
        return list;
    }
    public ArrayList<Integer> getAllFolklore(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(R.drawable.folklore1);
        list.add(R.drawable.folklore2);
        list.add(R.drawable.folklore3);
        list.add(R.drawable.folklore4);
        return list;
    }
    public ArrayList<Integer> getAllMare(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(R.drawable.mare1);
        list.add(R.drawable.mare2);
        list.add(R.drawable.mare3);
        list.add(R.drawable.mare4);
        return list;
    }



}
