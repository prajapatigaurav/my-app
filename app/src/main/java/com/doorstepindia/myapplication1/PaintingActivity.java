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

public class PaintingActivity extends AppCompatActivity {
    RecyclerView recyclerView, recyclerView1;
    List<Book> bookList;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);
        //  getSupportActionBar().hide();


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
        collapsingToolbarLayout.setTitle("Painting Work");

        recyclerView1 = findViewById(R.id.recyclerview_id1);
        bookList = new ArrayList<>();

        bookList.add(new Book("Fresh Painting", R.drawable.fresh_painting));
        bookList.add(new Book("Exterior Painting", R.drawable.exterior_wall_painting));
        bookList.add(new Book("Textured Painting", R.drawable.textured_wall_painting));
        /*
        bookList.add(new Book("Exhaust Fan Installation Or Repair",R.drawable.exhaust_fan_installation_or_repair));
        bookList.add(new Book("MCB Or Fuse Repair",R.drawable.mcb_or_fuse_repair));
*/

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterPainting adapter2 = new RecyclerViewAdapterPainting(this, bookList);
        recyclerView1.setAdapter(adapter2);




        /*img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;


        img.setImageResource(image);*/

    }
}
