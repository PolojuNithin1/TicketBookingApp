package com.example.a300272555.movieticketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity1 extends AppCompatActivity {
    EditText username,password,phone;
   // Button btnLogin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        username = (EditText) findViewById(R.id.usernameLogin) ;
        password = (EditText) findViewById(R.id.passwordLogin) ;
        Button btnLogin=(Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {


            String usern = "Neeraj";
            String passw = "Admin";
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                Log.i("LoginActivity",user);
                Log.i("LoginActivity",usern);
                Log.i("LoginActivity",pass);
                Log.i("LoginActivity",passw);

               if (user.equals("") || pass.equals("") ) {
                    Toast.makeText(LoginActivity1.this, "Please enter the credentials", Toast.LENGTH_SHORT).show();
                } else {
                    if (user.equals(usern) && pass.equals(passw) ) {

                        Intent intent = new Intent(getApplicationContext(), MovieScheduler.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(LoginActivity1.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}