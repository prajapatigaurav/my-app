package com.doorstepindia.myapplication1.ac;

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

public class ACInstallActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acinstall);
        Button btn = findViewById(R.id.btn_continue);
        final RelativeLayout rl1 = findViewById(R.id.rl1);
        TextView tvv1 = findViewById(R.id.tvv1);
        ImageView iv = findViewById(R.id.iv);
        Glide.with(this)
                .load("http://searchkero.com/meerut/images/air_installation.jpg")
                .into(iv);
        rl1.setVisibility(View.GONE);
        tvv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int visibility = rl1.getVisibility();
                if (visibility == View.VISIBLE) {
                    rl1.setVisibility(View.GONE);
                } else
                    rl1.setVisibility(View.VISIBLE);

                //rl.setVisibility(View.VISIBLE);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
