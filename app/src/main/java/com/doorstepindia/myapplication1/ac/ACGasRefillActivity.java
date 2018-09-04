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

public class ACGasRefillActivity extends AppCompatActivity {
    RelativeLayout rl;
    TextView tv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acgas_refill);
        Button btn = findViewById(R.id.btn_continue);
        rl = findViewById(R.id.rl);
        iv = findViewById(R.id.iv);
        tv = findViewById(R.id.tvv);
        // rl.setVisibility(View.GONE);
        Glide.with(this)
                .load("http://searchkero.com/meerut/images/ac_gas_refilling.jpg")
                .into(iv);

       /* tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int visibility=rl.getVisibility();
                if(visibility==View.VISIBLE)
                {
                    rl.setVisibility(View.GONE);
                }
                else
                    rl.setVisibility(View.VISIBLE);

             //rl.setVisibility(View.VISIBLE);
            }
        });*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
