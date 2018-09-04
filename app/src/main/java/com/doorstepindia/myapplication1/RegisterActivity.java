package com.doorstepindia.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    EditText et_name, et_email, et_password, et_phone, et_city, et_address;
    String name, email, password, phone, city, address, sum;
    Button btn_submit, btn_share;
    String url = "http://www.searchkero.com/meerut/insert.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_email = findViewById(R.id.et_email);
        et_name = findViewById(R.id.et_name);
        btn_share = findViewById(R.id.btn_share);
        et_password = findViewById(R.id.et_password);
        et_phone = findViewById(R.id.et_phone);
        et_address = findViewById(R.id.et_address);
        et_city = findViewById(R.id.et_city);
        btn_submit = findViewById(R.id.btn_submit);
        name = et_name.getText().toString();
        email = et_email.getText().toString();
        password = et_password.getText().toString();
        phone = et_phone.getText().toString();
        city = et_city.getText().toString();
        address = et_address.getText().toString();
        sum = "Name : " + name + "\nEmail : " + email + "\nPhone : " + phone + "\nCity : " + city + "\nLocation : " + address;

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"pradeeptihadia@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "");
                intent.putExtra(Intent.EXTRA_TEXT, sum);
                intent.setType("email/rfc822");
                startActivity(Intent.createChooser(intent, "send via gmail...."));
            }
        });
        btn_submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //       sum="Name : "+name+"\nEmail : "+email+"\nPhone : "+phone+"\nCity : "+city+"\nLocation : "+address;
                Intent intent1 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent1);
                StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        et_name.setText("");
                        et_phone.setText("");
                        et_email.setText("");
                        et_city.setText("");
                        et_password.setText("");
                        et_address.setText("");
                        Toast.makeText(getApplicationContext(), "data submitted...", Toast.LENGTH_SHORT).show();
                    }
                },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }) {
               /*     @Override
                    protected Map<String,String> getParams(){
                        Map<String,String> params = new HashMap<String, String>();
                        params.put("name",nam);
                        params.put("feedback",feed);

                        return params;
                    }
*/

                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("name", name);
                        params.put("email", email);
                        params.put("password", password);
                        params.put("phone", phone);
                        params.put("city", city);
                        params.put("address", address);
                        return params;
                    }
                };

                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
                requestQueue.add(stringRequest);

            }
        });
    }
}
