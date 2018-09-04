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

public class PlumbingActivity extends AppCompatActivity {
    RecyclerView recyclerView, recyclerView1;
    List<Book> bookList;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumbing);
//        getSupportActionBar().hide();

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
        collapsingToolbarLayout.setTitle("Plumbing Work");

        recyclerView1 = findViewById(R.id.recyclerview_id1);
        bookList = new ArrayList<>();

        bookList.add(new Book("Gerenal Plumbing Work", R.drawable.general_plumbing_work));
        bookList.add(new Book("Water Tank Installation", R.drawable.water_tank_installation));
        bookList.add(new Book("Overhead Water Tank Cleaning", R.drawable.overhead_water_tank_cleaning));
        bookList.add(new Book("Under Ground Water Tank Cleaning", R.drawable.under_ground_water_tank_cleaning));
        bookList.add(new Book("Small Bathroom Fittings Installation", R.drawable.small_bathroom_fittings_nstallation));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterPlumbing adapter2 = new RecyclerViewAdapterPlumbing(this, bookList);
        recyclerView1.setAdapter(adapter2);


    }
}
