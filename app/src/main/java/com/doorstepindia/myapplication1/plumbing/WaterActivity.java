package com.doorstepindia.myapplication1.plumbing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.doorstepindia.myapplication1.LoginActivity;
import com.doorstepindia.myapplication1.R;

public class WaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        ImageView iv = findViewById(R.id.iv);
        Glide.with(this)
                .load("http://searchkero.com/meerut/images/water_tank_installation.jpg")
                .into(iv);
        Button btn = findViewById(R.id.btn_continue);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
