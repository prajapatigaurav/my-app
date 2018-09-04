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

public class CarpentryActivity extends AppCompatActivity {
    RecyclerView recyclerView, recyclerView1;
    List<Book> bookList;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpentry);
        //   getSupportActionBar().hide();


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
        collapsingToolbarLayout.setTitle("Carpentry");


        recyclerView1 = findViewById(R.id.recyclerview_id1);
        bookList = new ArrayList<>();

        bookList.add(new Book("Gerenal Carpentry Work", R.drawable.general_carpentry_work));
        bookList.add(new Book("New Furniture Making", R.drawable.new_furniture_making));
        bookList.add(new Book("Furniture Repair", R.drawable.furniture_repair));
        bookList.add(new Book("Furniture Assembly And Installation", R.drawable.furniture_assembly_and_installation));
        bookList.add(new Book("Door Or Window Repair", R.drawable.door_or_indow_repair));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterCarpentry adapter2 = new RecyclerViewAdapterCarpentry(this, bookList);
        recyclerView1.setAdapter(adapter2);



      /*  img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;


        img.setImageResource(image);
*/
    }
}
