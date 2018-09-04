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

public class ACActivity extends AppCompatActivity {
    //  RecyclerViewAdapter2 adapter2;
    RecyclerView recyclerView, recyclerView1;
    List<Book> bookList;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac);

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
        collapsingToolbarLayout.setTitle("AC Services");

        recyclerView1 = findViewById(R.id.recyclerview_id1);
        bookList = new ArrayList<>();
        bookList.add(new Book("AC Service", R.drawable.ac_service));
        bookList.add(new Book("AC Install", R.drawable.ac_unistallation));
        bookList.add(new Book("AC Unistall", R.drawable.ac_unistallation));
        bookList.add(new Book("AC Not Cooling", R.drawable.ac_not_coolingg));
        bookList.add(new Book("AC Gas Refill", R.drawable.ac_gas_refilling));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterAC adapter2 = new RecyclerViewAdapterAC(this, bookList);
        recyclerView1.setAdapter(adapter2);
/*

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_ac);
*/

  /*      img = (ImageView) findViewById(R.id.bookthumbnail);
    // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;

        img.setImageResource(image);
*/
    }

}
