package com.doorstepindia.myapplication1;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class CarCareActivity extends AppCompatActivity {
    RecyclerView recyclerView, recyclerView1;
    List<Book> bookList;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_care);
        //getSupportActionBar().hide();


        Toolbar toolbar = findViewById(R.id.collapsing_toolbar);
        // Use Toolbar to replace default activity action bar.
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Display home menu item.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // Set collapsing tool bar title.
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar_layout);
        collapsingToolbarLayout.setTitle("Car Care");


        recyclerView1 = findViewById(R.id.recyclerview_id1);
        bookList = new ArrayList<>();

        bookList.add(new Book("Complete Car Wash", R.drawable.complete_car_wash));
        bookList.add(new Book("Exterior Detaining", R.drawable.exterior_detailing));
        bookList.add(new Book("Interior Detaining", R.drawable.interior_detailing));
        bookList.add(new Book("Teflon Coating", R.drawable.teflon_coating));
        bookList.add(new Book("Complete Car Antimicrobial Protection", R.drawable.bactibarrier_car_wash));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterCarCare adapter2 = new RecyclerViewAdapterCarCare(this, bookList);
        recyclerView1.setAdapter(adapter2);



      /*  img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values


        img.setImageResource(image);*/

    }
}
