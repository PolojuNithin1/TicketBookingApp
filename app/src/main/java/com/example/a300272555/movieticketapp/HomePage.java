package com.example.a300272555.movieticketapp;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
// HomePage class is the first activity opened on running the MovieTicketApp
    // two modules : Admin and Guest

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        // Button to go to Admin Module
        Button btnAdmin=(Button) findViewById(R.id.buttonAdmin);
        btnAdmin.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {

                Intent myintent=new Intent(HomePage.this,LoginActivity1.class);


                startActivity(myintent);

            }

        });


        // Button to go to Guest / customer module
        Button btnGuest =(Button) findViewById(R.id.buttonGuest);
        btnGuest.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {

                Intent myintent=new Intent(HomePage.this,LoginActivity.class);

                Bundle bundle=getIntent().getExtras();
                startActivity(myintent);

            }

        });




    }
}
