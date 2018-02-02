package com.project.udacity.cataniatour;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.project.udacity.cataniatour.Data.MonumentsData;

public class MainActivity extends AppCompatActivity {
     MonumentsData mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * init data
         */
        mList=new MonumentsData(this);

        ListView listview=findViewById(R.id.list_monuments);
        /**
         * declare adapter for listview
         */
        MonumentsAdapter ma=new MonumentsAdapter(this,R.layout.monument_item_row, mList.getAll());
        listview.setAdapter(ma);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /**
                 * start details Activity
                 */
                Intent detailsIntent=new Intent(MainActivity.this,DetailsActivity.class);
                //detailsIntent.putExtra("test",list.get(i).description);
                detailsIntent.putExtra("id",mList.getAll().get(i).getId());
                startActivity(detailsIntent);



            }
        });

    }
}
