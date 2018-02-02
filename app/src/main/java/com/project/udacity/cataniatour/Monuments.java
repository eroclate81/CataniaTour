package com.project.udacity.cataniatour;

import java.security.PublicKey;
import java.util.ArrayList;

/**
 * Created by ROBERTO on 08/01/2018.
 */

public class Monuments {
     private int _id;
     private int mImgpreview;
     private String mDescription;
     private int mTitle;
     private ArrayList<Integer> mGallery;


    public int getId(){
        return _id;
    }

    public String getDescription(){
         return mDescription;
    }

    public int getPreview(){
        return mImgpreview;
    }

     public int getTitle(){
          return mTitle;
     }
     public ArrayList<Integer> getGallery(){
          return mGallery;
     }

     public  Monuments(int id, int resource,int title,String description ,ArrayList<Integer> gallery)
     {
          _id=id;
          mImgpreview=resource;
          mTitle=title;
          mDescription=description;
          mGallery=gallery;
     }




}
