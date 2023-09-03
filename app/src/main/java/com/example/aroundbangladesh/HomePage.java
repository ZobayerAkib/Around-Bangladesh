package com.example.aroundbangladesh;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.smarteist.autoimageslider.SliderView;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
public class HomePage extends AppCompatActivity implements View.OnClickListener {
public int check = 0;


    private EditText search;
    ExpandableListView expandableListView;
    List<String> listGroup;
    HashMap<String,List<String>> listItem;
    NavigationView nav;
    ActionBarDrawerToggle toggel;
    DrawerLayout drawerLayout;
    ImageView im1,im2,im3,im4,im5,im6,im11,im22,im33,im44,im55,im66,im77,im88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        nav =(NavigationView)findViewById(R.id.navmenu);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);

        toggel=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(toggel);
        toggel.syncState();


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menu_home:


                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_toprated:
                        Intent intent =new Intent(HomePage.this,Toprated.class);
                        startActivity(intent);

                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_map:
                        Intent intent2 = new Intent(HomePage.this,map.class);
                        startActivity(intent2);

                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_logout:
                        try{
                            FirebaseAuth.getInstance().signOut();
                        }catch (Exception e){

                        }

                        startActivity(new Intent(HomePage.this,MainActivity.class));
                        finish();
                        break;

                    case R.id.bookmark:
                        Intent intent3 = new Intent(HomePage.this,favourite_places.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_aboutus:
                        Intent intent4 = new Intent(HomePage.this,about_us.class);
                        startActivity(intent4);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });


        search = (EditText) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearch();
            }
        });

        im1 = (ImageView) findViewById(R.id.im1);
        im1.setOnClickListener(this);
        im2 = (ImageView) findViewById(R.id.im2);
        im2.setOnClickListener(this);
        im3 = (ImageView) findViewById(R.id.im3);
        im3.setOnClickListener(this);
        im4 = (ImageView) findViewById(R.id.im4);
        im4.setOnClickListener(this);
        im5 = (ImageView) findViewById(R.id.im5);
        im5.setOnClickListener(this);
        im6 = (ImageView) findViewById(R.id.im6);
        im6.setOnClickListener(this);

        im11 = (ImageView) findViewById(R.id.im11);
        im11.setOnClickListener(this);
        im22 = (ImageView) findViewById(R.id.im22);
        im22.setOnClickListener(this);
        im33 = (ImageView) findViewById(R.id.im33);
        im33.setOnClickListener(this);
        im44 = (ImageView) findViewById(R.id.im44);
        im44.setOnClickListener(this);
        im55 = (ImageView) findViewById(R.id.im55);
        im55.setOnClickListener(this);
        im66 = (ImageView) findViewById(R.id.im66);
        im66.setOnClickListener(this);


}

   public void openSearch(){
        Intent intent = new Intent(this,searchBar.class);
        startActivity(intent);
   }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im1:
                startActivity(new Intent(this,seaBeach.class));
                break;
            case R.id.im2:
                startActivity(new Intent(this,hill.class));
                break;
            case R.id.im3:
                startActivity(new Intent(this,lake.class));
                break;
            case R.id.im4:
                startActivity(new Intent(this,island.class));
                break;

            case R.id.im5:
                startActivity(new Intent(this,forest.class));
                break;
            case R.id.im6:
                startActivity(new Intent(this,historical.class));
                break;
            case R.id.im11:
                startActivity(new Intent(this,dhaka.class));
                break;
            case R.id.im22:
                startActivity(new Intent(this,chittagong.class));
                break;
            case R.id.im33:
                startActivity(new Intent(this,syllhet.class));
                break;
            case R.id.im44:
                startActivity(new Intent(this,rajshahi.class));
                break;

            case R.id.im55:
                startActivity(new Intent(this,khulna.class));
                break;
            case R.id.im66:
                startActivity(new Intent(this,barisal.class));
                break;



        }
    }
}