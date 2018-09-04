package com.doorstepindia.myapplication1.carcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.doorstepindia.myapplication1.LoginActivity;
import com.doorstepindia.myapplication1.R;

public class InteriorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interior);
        final RelativeLayout rl = findViewById(R.id.rl);
        final TextView tvv = findViewById(R.id.tvv);
        rl.setVisibility(View.GONE);
        ImageView iv = findViewById(R.id.iv);
        Glide.with(this)
                .load("http://searchkero.com/meerut/images/interior_detailing.jpg")
                .into(iv);
        tvv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int visibility = rl.getVisibility();
                if (visibility == View.VISIBLE) {
                    rl.setVisibility(View.GONE);
                } else
                    rl.setVisibility(View.VISIBLE);

                //rl.setVisibility(View.VISIBLE);
            }
        });
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
