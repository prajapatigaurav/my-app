package com.doorstepindia.myapplication1.painting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.doorstepindia.myapplication1.LoginActivity;
import com.doorstepindia.myapplication1.R;

public class ExteriorPaintingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exterior_painting);
        ImageView iv = findViewById(R.id.iv);
        Glide.with(this)
                .load("http://searchkero.com/meerut/images/exterior_wall_painting.jpg")
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
