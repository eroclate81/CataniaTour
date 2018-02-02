        package com.project.udacity.cataniatour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.udacity.cataniatour.Data.MonumentsData;

        public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        /**
         * get ID from Extra
         */
        int result=getIntent().getIntExtra ("id",-1);
        /**
         * init Array data
         */
        MonumentsData mlist=new MonumentsData(this);
        /**
         * get selected element fro marray
          */
        Monuments mItem=mlist.getAll().get(result);
        /**
         * get view from layout
         */
        ImageView imgPreview=findViewById(R.id.imgPreview);
        TextView textDescription=findViewById(R.id.textDescription);
        TextView textTitle=findViewById(R.id.textTitle);
        GridView gridImages=findViewById(R.id.gridImages);
        /**
         * setting value to view
         */
        imgPreview.setImageResource(mItem.getPreview());
        textTitle.setText(getText(mItem.getTitle()));
        textDescription.setText(mItem.getDescription());

        /**
         * setting to gridview image to show
         */
        imagesAdapter imageAdapter=new imagesAdapter(this,mItem.getGallery());
        gridImages.setAdapter(imageAdapter);


    }
}
