package com.doorstepindia.myapplication1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/*
public class LoginActivity extends AppCompatActivity{
EditText et_username,et_password;
Button btn_login,btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_password=findViewById(R.id.et_password);
        et_username=findViewById(R.id.et_username);
        btn_login=findViewById(R.id.btn_login);
        btn_register=findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });


    }
}*/

public class LoginActivity extends AppCompatActivity {
    public static final String LOGIN_URL = "http://www.searchkero.com/meerut/login.php";

    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    EditText et_email, et_password;
    Button btn_login, btn_register;
    //  EditText et_email_l,et_password_l;
//    CheckBox show_l;
    //   Button btn_login_l,btn_register_l;
    ProgressDialog loading;
    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_password = findViewById(R.id.et_password);
        et_email = findViewById(R.id.et_username);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

/*

        et_email_l = (EditText) findViewById(R.id.et_roll_l);
        et_password_l = (EditText) findViewById(R.id.et_password_l);
        show_l = (CheckBox) findViewById(R.id.show_l);
        btn_login_l = (Button) findViewById(R.id.btn_login_l);
        btn_register_l = (Button) findViewById(R.id.btn_register_l);

        btn_register_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(i);
                finish();
            }
        });


        show_l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()

                                          {
                                              @Override
                                              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                  if (isChecked) {
                                                      et_password_l.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                                                  } else {
                                                      et_password_l.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                                                  }
                                              }
                                          }

        );
*/

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();


            }
        });


    }


    private void login() {
        loading = ProgressDialog.show(this, "Please wait...", "Proccessing...", false, false);

        email = et_email.getText().toString().trim();
        password = et_password.getText().toString().trim();

        if (et_email.getText().toString().trim().equalsIgnoreCase("")) {
            et_email.setError("This field can not be blank");
            et_email.requestFocus();
            loading.dismiss();
        }

        if (et_password.getText().toString().length() < 6) {
            et_password.setError("Password should be atleast of 6 charactors");
            et_password.requestFocus();
            loading.dismiss();
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, LOGIN_URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.trim().equals("Success")) {
                        openProfile();
                        loading.dismiss();

                        new Methords(getApplicationContext()).saveLoginDetails(email, password);

                    } else {
                        Toast.makeText(LoginActivity.this, response, Toast.LENGTH_LONG).show();
                        loading.dismiss();
                    }


                }

            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(LoginActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
                    loading.dismiss();

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> map = new HashMap<String, String>();
                    map.put(KEY_EMAIL, email);
                    map.put(KEY_PASSWORD, password);
                    return map;
                }
            };
            RetryPolicy policy = new DefaultRetryPolicy(20000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            stringRequest.setRetryPolicy(policy);
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }

    }

    private void openProfile() {
        loading.dismiss();

        Intent i = new Intent(getApplicationContext(), PaymentActivity.class);
        startActivity(i);
        finish();

    }


}
