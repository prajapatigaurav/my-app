package com.doorstepindia.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.doorstepindia.myapplication1.ac.ACGasRefillActivity;
import com.doorstepindia.myapplication1.ac.ACInstallActivity;
import com.doorstepindia.myapplication1.ac.ACNotCoolingActivity;
import com.doorstepindia.myapplication1.ac.ACServiceActivity;
import com.doorstepindia.myapplication1.ac.ACUnistallActivity;
import com.doorstepindia.myapplication1.carcare.CarWashActivity;
import com.doorstepindia.myapplication1.carcare.ExteriorActivity;
import com.doorstepindia.myapplication1.carcare.InteriorActivity;
import com.doorstepindia.myapplication1.carcare.ProtectionActivity;
import com.doorstepindia.myapplication1.carcare.TeflonActivity;
import com.doorstepindia.myapplication1.carpentry.DoorOrWindowActivity;
import com.doorstepindia.myapplication1.carpentry.FurnitureAssemblyActivity;
import com.doorstepindia.myapplication1.carpentry.FurnitureRepairActivity;
import com.doorstepindia.myapplication1.carpentry.GeneralCarpentryActivity;
import com.doorstepindia.myapplication1.carpentry.NewFurnitureActivity;
import com.doorstepindia.myapplication1.electrical.CeilingFanActivity;
import com.doorstepindia.myapplication1.electrical.ExhaustActivity;
import com.doorstepindia.myapplication1.electrical.GeneralActivity;
import com.doorstepindia.myapplication1.electrical.MCBActivity;
import com.doorstepindia.myapplication1.electrical.WallFanActivity;
import com.doorstepindia.myapplication1.painting.ExteriorPaintingActivity;
import com.doorstepindia.myapplication1.painting.FreshPaintingActivity;
import com.doorstepindia.myapplication1.painting.TexturedPaintingActivity;
import com.doorstepindia.myapplication1.plumbing.GeneralPlumbingActivity;
import com.doorstepindia.myapplication1.plumbing.OverheadActivity;
import com.doorstepindia.myapplication1.plumbing.SmallActivity;
import com.doorstepindia.myapplication1.plumbing.UnderGroundActivity;
import com.doorstepindia.myapplication1.plumbing.WaterActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter adapter;
    RecyclerViewAdapter1 adapter1;
    RecyclerView recyclerView, recyclerView1;
    List<Book> bookList, bookList1;
    EditText searchView;
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //spinner or search view
        final Spinner spinner = findViewById(R.id.spinner);
        final List<String> list = new ArrayList<String>();
        list.add("search here...");

        list.add("AC Service");
        list.add("AC Install");
        list.add("AC Uninstall");
        list.add("AC Not Cooling");
        list.add("AC Gas Refill");
        list.add("Complete Car Protection");
        list.add("Complete Car Wash");
        list.add("Ceiling Fan Repair");
        list.add("Door or Window Repair");
        list.add("Exhaust Fan Repair");
        list.add("Exterior Painting");
        list.add("Exterior Detailing");
        list.add("Furniture Repair");
        list.add("Furniture Assembly and Installation");
        list.add("Fresh Painting");
        list.add("General Electrical Work");
        list.add("General Plumbing Work");
        list.add("General Carpentry Work");
        list.add("Interior Detailing");
        list.add("MCB or Fuse Repair");
        list.add("New Furniture Making");
        list.add("Overhead Water Tank Cleaning");
        list.add("Small Bathroom Fittings");
        list.add("Textured Painting");
        list.add("Teflon Coating");
        list.add("UnderGround Water Tank Cleaning");
        list.add("Wall Fan Repair");
        list.add("Water Tank Installation");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1:
                        Intent intent = new Intent(MainActivity.this, ACServiceActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent1 = new Intent(MainActivity.this, ACInstallActivity.class);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2 = new Intent(MainActivity.this, ACUnistallActivity.class);
                        startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3 = new Intent(MainActivity.this, ACNotCoolingActivity.class);
                        startActivity(intent3);
                        break;

                    case 5:
                        Intent intent4 = new Intent(MainActivity.this, ACGasRefillActivity.class);
                        startActivity(intent4);
                        break;

                    case 6:
                        Intent intent5 = new Intent(MainActivity.this, ProtectionActivity.class);
                        startActivity(intent5);
                        break;
                    case 7:
                        Intent intent6 = new Intent(MainActivity.this, CarWashActivity.class);
                        startActivity(intent6);
                        break;
                    case 8:
                        Intent intent7 = new Intent(MainActivity.this, CeilingFanActivity.class);
                        startActivity(intent7);
                        break;
                    case 9:
                        Intent intent8 = new Intent(MainActivity.this, DoorOrWindowActivity.class);
                        startActivity(intent8);
                        break;
                    case 10:
                        Intent intent9 = new Intent(MainActivity.this, ExhaustActivity.class);
                        startActivity(intent9);
                        break;
                    case 11:
                        Intent intent10 = new Intent(MainActivity.this, ExteriorPaintingActivity.class);
                        startActivity(intent10);
                        break;
                    case 12:
                        Intent intent11 = new Intent(MainActivity.this, ExteriorActivity.class);
                        startActivity(intent11);
                        break;


                    case 13:
                        Intent intent12 = new Intent(MainActivity.this, FurnitureRepairActivity.class);
                        startActivity(intent12);
                        break;
                    case 14:
                        Intent intent13 = new Intent(MainActivity.this, FurnitureAssemblyActivity.class);
                        startActivity(intent13);
                        break;
                    case 15:
                        Intent intent14 = new Intent(MainActivity.this, FreshPaintingActivity.class);
                        startActivity(intent14);
                        break;
                    case 16:
                        Intent intent15 = new Intent(MainActivity.this, GeneralActivity.class);
                        startActivity(intent15);
                        break;
                    case 17:
                        Intent intent16 = new Intent(MainActivity.this, GeneralPlumbingActivity.class);
                        startActivity(intent16);
                        break;
                    case 18:
                        Intent intent17 = new Intent(MainActivity.this, GeneralCarpentryActivity.class);
                        startActivity(intent17);
                        break;

                    case 19:
                        Intent intent18 = new Intent(MainActivity.this, InteriorActivity.class);
                        startActivity(intent18);
                        break;
                    case 20:
                        Intent intent19 = new Intent(MainActivity.this, MCBActivity.class);
                        startActivity(intent19);
                        break;
                    case 21:
                        Intent intent20 = new Intent(MainActivity.this, NewFurnitureActivity.class);
                        startActivity(intent20);
                        break;
                    case 22:
                        Intent intent21 = new Intent(MainActivity.this, OverheadActivity.class);
                        startActivity(intent21);
                        break;
                    case 23:
                        Intent intent22 = new Intent(MainActivity.this, SmallActivity.class);
                        startActivity(intent22);
                        break;
                    case 24:
                        Intent intent23 = new Intent(MainActivity.this, TexturedPaintingActivity.class);
                        startActivity(intent23);
                        break;
                    case 25:
                        Intent intent24 = new Intent(MainActivity.this, TeflonActivity.class);
                        startActivity(intent24);
                        break;

                    case 26:
                        Intent intent25 = new Intent(MainActivity.this, UnderGroundActivity.class);
                        startActivity(intent25);
                        break;
                    case 27:

                        Intent intent26 = new Intent(MainActivity.this, WallFanActivity.class);
                        startActivity(intent26);
                        break;
                    case 28:
                        Intent intent27 = new Intent(MainActivity.this, WaterActivity.class);
                        startActivity(intent27);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        spinner.setOnItemSelectedListener(onItemSelectedListener);


        //    searchView=findViewById(R.id.searchView);

//        getSupportActionBar().hide();
        bookList1 = new ArrayList<>();

        bookList1.add(new Book("AC Service", R.drawable.ac_service));
        bookList1.add(new Book("AC Install", R.drawable.air_installation));
        bookList1.add(new Book("AC Unistall", R.drawable.ac_unistallation));
        bookList1.add(new Book("AC Not Cooling", R.drawable.ac_not_coolingg));
        bookList1.add(new Book("AC Gas Refill", R.drawable.ac_gas_refilling));

        bookList1.add(new Book("Gerenal Carpentry Work", R.drawable.general_carpentry_work));
        bookList1.add(new Book("New Furniture Making", R.drawable.new_furniture_making));
        bookList1.add(new Book("Furniture Repair", R.drawable.furniture_repair));
        bookList1.add(new Book("Furniture Assembly And Installation", R.drawable.furniture_assembly_and_installation));
        bookList1.add(new Book("Door Or Window Repair", R.drawable.door_or_indow_repair));

        bookList1.add(new Book("Gerenal Electrical Work", R.drawable.general_electrical_work));
        bookList = new ArrayList<>();
        recyclerView1 = findViewById(R.id.recyclerview_id1);
        recyclerView = findViewById(R.id.recyclerview_id);
        adapter = new RecyclerViewAdapter(bookList, this);
        bookList.add(new Book("AC", R.drawable.acca));
        bookList.add(new Book("Electrical", R.drawable.electrical1));
        bookList.add(new Book("Plumbing", R.drawable.plumbing1));
        bookList.add(new Book("Painting", R.drawable.painting1));
        bookList.add(new Book("Carpentry", R.drawable.carpentry1));
        bookList.add(new Book("CCTV", R.drawable.cctvv2));
        bookList.add(new Book("Appliance", R.drawable.appliances1));
        bookList.add(new Book("Car Care", R.drawable.carcare1));

        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        adapter = new RecyclerViewAdapter(bookList, getApplicationContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter1 adapter1 = new RecyclerViewAdapter1(bookList1, this);
        recyclerView1.setAdapter(adapter1);

        viewPager = findViewById(R.id.viewPager);

        sliderDotspanel = findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dots));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dots));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dots));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dots));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);

    }

    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    } else if (viewPager.getCurrentItem() == 2) {
                        viewPager.setCurrentItem(3);
                    } else {
                        viewPager.setCurrentItem(0);
                    }

                }
            });

        }


    }


}
