package com.example.aroundbangladesh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class favourite_places extends AppCompatActivity {
    places_description obj1 = new places_description();
    places_hotel obj2 = new places_hotel();
    places_food obj3= new places_food();
    places_route obj4 = new places_route();
SwipeRefreshLayout sw ;
    private LinearLayout des1,des2,des3,des4,des5,des6,des7,des8,des9,des10,des11,des12,des13,des14,des15,des16,des17,des18,des19,des20,des21,des22,des23,des24,des25;
    String  place1,place2,place3,place4,place5,place6,place7,place8,place9,place10,place11,place12,place13,place14,place15,place16,place17,place18,place19,place20,place21,place22,place23,place24,place25;
FirebaseDatabase database = FirebaseDatabase.getInstance();
DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_places);

        des1 = (LinearLayout)findViewById(R.id.saint);
        des2 = (LinearLayout)findViewById(R.id.kuakata);
        des3 = (LinearLayout)findViewById(R.id.sajek);
        des4 = (LinearLayout)findViewById(R.id.foys);
        des5 = (LinearLayout)findViewById(R.id.nijhum);
        des6 = (LinearLayout)findViewById(R.id.sundarban);
        des7 = (LinearLayout)findViewById(R.id.cox);
        des8 = (LinearLayout)findViewById(R.id.himchori);
        des9 = (LinearLayout)findViewById(R.id.patenga);
        des10 = (LinearLayout)findViewById(R.id.ahsan);
        des11 = (LinearLayout)findViewById(R.id.lalbag);
        des12 = (LinearLayout)findViewById(R.id.batali);
        des13 = (LinearLayout)findViewById(R.id.shita);
        des14 = (LinearLayout)findViewById(R.id.vatiary);
        des15 = (LinearLayout)findViewById(R.id.jaflong);
        des16 = (LinearLayout)findViewById(R.id.bichana);
        des17 = (LinearLayout)findViewById(R.id.bagha);
        des18 = (LinearLayout)findViewById(R.id.kotka);
        des19 = (LinearLayout)findViewById(R.id.durga);
        des20 = (LinearLayout)findViewById(R.id.bhawal);
        des21 = (LinearLayout)findViewById(R.id.tara);
        des22 = (LinearLayout)findViewById(R.id.hamham);
        des23 = (LinearLayout)findViewById(R.id.lala);
        des24 = (LinearLayout)findViewById(R.id.varendra);
        des25 = (LinearLayout)findViewById(R.id.hiron);

try{
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String currentUserId = user.getUid();

    reference = database.getReference("favouriteList").child(currentUserId);

            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    try {
                        place1  = snapshot.child("1").getValue().toString();
                        des1.setVisibility(View.VISIBLE);
                        des1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 1;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place1 = "NULL";
                    }
                    try {
                        place2  = snapshot.child("2").getValue().toString();
                        des2.setVisibility(View.VISIBLE);
                        des2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 2;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place2 = "NULL";
                    }
                    try {
                        place3  = snapshot.child("3").getValue().toString();
                        des3.setVisibility(View.VISIBLE);
                        des3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 3;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place3 = "NULL";
                    }
                    try {
                        place4  = snapshot.child("4").getValue().toString();
                        des4.setVisibility(View.VISIBLE);
                        des4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 4;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place4 = "NULL";
                    }
                    try {
                        place5  = snapshot.child("5").getValue().toString();
                        des5.setVisibility(View.VISIBLE);
                        des5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 5;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place5 = "NULL";
                    }
                    try {
                        place6  = snapshot.child("6").getValue().toString();
                        des6.setVisibility(View.VISIBLE);
                        des6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 6;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place6 = "NULL";
                    }
                    try {
                        place7  = snapshot.child("7").getValue().toString();
                        des7.setVisibility(View.VISIBLE);
                        des7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 7;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place7 = "NULL";
                    }
                    try {
                        place8  = snapshot.child("8").getValue().toString();
                        des8.setVisibility(View.VISIBLE);
                        des8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 8;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place8 = "NULL";
                    }
                    try {
                        place9  = snapshot.child("9").getValue().toString();
                        des9.setVisibility(View.VISIBLE);
                        des9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 9;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place9 = "NULL";
                    }
                    try {
                        place10  = snapshot.child("10").getValue().toString();
                        des10.setVisibility(View.VISIBLE);
                        des10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 10;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place10 = "NULL";
                    }
                    try {
                        place11  = snapshot.child("11").getValue().toString();
                        des11.setVisibility(View.VISIBLE);
                        des11.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 11;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place11 = "NULL";
                    }
                    try {
                        place12  = snapshot.child("12").getValue().toString();
                        des12.setVisibility(View.VISIBLE);
                        des12.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 12;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place12 = "NULL";
                    }
                    try {
                        place13  = snapshot.child("13").getValue().toString();
                        des13.setVisibility(View.VISIBLE);
                        des13.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 13;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place13 = "NULL";
                    }
                    try {
                        place14  = snapshot.child("14").getValue().toString();
                        des14.setVisibility(View.VISIBLE);
                        des14.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 14;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place14 = "NULL";
                    }
                    try {
                        place15  = snapshot.child("15").getValue().toString();
                        des15.setVisibility(View.VISIBLE);
                        des15.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 15;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place15 = "NULL";
                    }
                    try {
                        place16  = snapshot.child("16").getValue().toString();
                        des16.setVisibility(View.VISIBLE);
                        des16.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 16;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place16 = "NULL";
                    }
                    try {
                        place17  = snapshot.child("17").getValue().toString();
                        des17.setVisibility(View.VISIBLE);
                        des17.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 17;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place17 = "NULL";
                    }
                    try {
                        place18  = snapshot.child("18").getValue().toString();
                        des18.setVisibility(View.VISIBLE);
                        des18.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 18;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place18 = "NULL";
                    }
                    try {
                        place19  = snapshot.child("19").getValue().toString();
                        des19.setVisibility(View.VISIBLE);
                        des19.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 19;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place19 = "NULL";
                    }
                    try {
                        place20  = snapshot.child("20").getValue().toString();
                        des20.setVisibility(View.VISIBLE);
                        des20.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 20;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place20 = "NULL";
                    }
                    try {
                        place21  = snapshot.child("21").getValue().toString();
                        des21.setVisibility(View.VISIBLE);
                        des21.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 21;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place21 = "NULL";
                    }
                    try {
                        place22  = snapshot.child("22").getValue().toString();
                        des22.setVisibility(View.VISIBLE);
                        des22.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 22;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place22 = "NULL";
                    }
                    try {
                        place23  = snapshot.child("23").getValue().toString();
                        des23.setVisibility(View.VISIBLE);
                        des23.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 23;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place23 = "NULL";
                    }
                    try {
                        place24  = snapshot.child("24").getValue().toString();
                        des24.setVisibility(View.VISIBLE);
                        des24.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 24;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place24 = "NULL";
                    }
                    try {
                        place25  = snapshot.child("25").getValue().toString();
                        des25.setVisibility(View.VISIBLE);
                        des25.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                obj1.check = obj2.check = obj3.check= obj4.check = 25;
                                startActivity(new Intent(favourite_places.this, bottomNav.class));
                            }
                        });
                    }catch (Exception e)
                    {
                        place25 = "NULL";
                    }



                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });





}catch (Exception e)
{

}




    }
}