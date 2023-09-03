package com.example.aroundbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class khulna extends AppCompatActivity implements View.OnClickListener{
    places_description obj1 = new places_description();
    places_route obj2 = new places_route();
    places_food obj3 = new places_food();
    places_hotel obj4 = new places_hotel();
    ImageView im1,im2,im3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);
        im1 = (ImageView) findViewById(R.id.im1);
        im1.setOnClickListener(this);
        im2 = (ImageView) findViewById(R.id.im2);
        im2.setOnClickListener(this);
        im3 = (ImageView) findViewById(R.id.im3);
        im3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im1:

                obj1.check = obj2.check = obj3.check = obj4.check = 6;
                startActivity(new Intent(this, bottomNav.class));
                break;
            case R.id.im2:

                obj1.check = obj2.check = obj3.check = obj4.check = 18;
                startActivity(new Intent(this, bottomNav.class));
                break;
            case R.id.im3:

                obj1.check = obj2.check = obj3.check = obj4.check = 25;
                startActivity(new Intent(this, bottomNav.class));
                break;


        }
    }
}