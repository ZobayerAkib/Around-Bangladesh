package com.example.aroundbangladesh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class searchBar extends AppCompatActivity {
    SearchView mySearchView;
    ListView myList;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    places_description obj1 = new places_description();
    places_route obj2 = new places_route();
   places_hotel obj3 = new places_hotel();
    places_food obj4 = new places_food();
    bottomNav nav = new bottomNav();


    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bar);





        mySearchView = (SearchView)findViewById(R.id.searchView);
        myList = (ListView)findViewById(R.id.myList);
        list = new ArrayList<String>();
        list.add("saint martin");//1
        list.add("kuakata");//2
        list.add("sajek");//3
        list.add("foys lake");//4
        list.add("nijhum dwip");//5
        list.add("sundarban");//6
        list.add("cox's bazar");//7
        list.add("himchori");//8
        list.add("patenga");//9
        list.add("ahsanmonjil");//10
        list.add("lalbagh fort");//11
        list.add("batali hill");//12
        list.add("shitakundo eco-park");//13
        list.add("vatiary lake");//14
        list.add("jaflong");//15
        list.add("bichanakandi");//16
        list.add("bagha mosque");//17
        list.add("kotka sea beach");//18
        list.add("durga shagor dighi");//19
        list.add("bhawal");//20
        list.add("tara mosque");//21
        list.add("hamham jhorna");//22
        list.add("lala khal");//23
        list.add("varendra research museum");//24
        list.add("hiron point");//25



        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {




               if(adapter.getItem(position)=="saint martin")
               { obj1.check = 1;
                   obj2.check = 1;
                   obj3.check = 1;
                   obj4.check = 1;
                    startActivity(new Intent(view.getContext(),bottomNav.class));

               }
                if(adapter.getItem(position)=="kuakata")
                {obj1.check = 2;
                    obj2.check = 2;
                   obj3.check = 2;
                    obj4.check = 2;
                    startActivity(new Intent(view.getContext(),bottomNav.class));

                }
                if(adapter.getItem(position)=="sajek")
                {obj1.check = 3;
                    obj2.check = 3;
                    obj3.check = 3;
                    obj4.check = 3;
                    startActivity(new Intent(view.getContext(),bottomNav.class));

                }
                if(adapter.getItem(position)=="foys lake")
                {obj1.check = 4;
                    obj2.check = 4;
                   obj3.check = 4;
                    obj4.check = 4;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="nijhum dwip")
                {obj1.check = 5;
                    obj2.check = 5;
                   obj3.check = 5;
                    obj4.check = 5;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="sundarban")
                {obj1.check = 6;
                    obj2.check = 6;
                   obj3.check = 6;
                    obj4.check = 6;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="cox's bazar")
                {obj1.check = 7;
                    obj2.check = 7;
                    obj3.check = 7;
                    obj4.check = 7;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="himchori")
                {obj1.check = 8;
                    obj2.check = 8;
                   obj3.check = 8;
                    obj4.check = 8;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="patenga")
                {obj1.check = 9;
                    obj2.check = 9;
                    obj3.check = 9;
                    obj4.check = 9;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="ahsanmonjil")
                {obj1.check = 10;
                    obj2.check = 10;
                    obj3.check = 10;
                    obj4.check = 10;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="lalbagh fort")
                {obj1.check = 11;
                    obj2.check = 11;
                    obj3.check = 11;
                    obj4.check = 11;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="batali hill")
                {obj1.check = 12;
                    obj2.check = 12;
                    obj3.check = 12;
                    obj4.check = 12;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="shitakundo eco-park")
                {obj1.check = 13;
                    obj2.check = 13;
                    obj3.check = 13;
                    obj4.check = 13;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="vatiary lake")
                {obj1.check = 14;
                    obj2.check = 14;
                    obj3.check = 14;
                    obj4.check = 14;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="jaflong")
                {obj1.check = 15;
                    obj2.check = 15;
                    obj3.check = 15;
                    obj4.check = 15;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="bichanakandi")
                {obj1.check = 16;
                    obj2.check =16;
                    obj3.check = 16;
                    obj4.check = 16;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="bagha mosque")
                {obj1.check = 17;
                    obj2.check = 17;
                    obj3.check = 17;
                    obj4.check = 17;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="kotka sea beach")
                {obj1.check = 18;
                    obj2.check = 18;
                    obj3.check = 18;
                    obj4.check = 18;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="durga shagor dighi")
                {obj1.check = 19;
                    obj2.check = 19;
                    obj3.check = 19;
                    obj4.check = 19;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="bhawal")
                {
                    obj1.check = obj2.check = obj3.check = obj4.check = 20;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="tara mosque")
                {
                    obj1.check = obj2.check = obj3.check = obj4.check = 21;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="hamham jhorna")
                {
                    obj1.check = obj2.check = obj3.check = obj4.check = 22;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="lala khal")
                {
                    obj1.check = obj2.check = obj3.check = obj4.check = 23;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="varendra research museum")
                {
                    obj1.check = obj2.check = obj3.check = obj4.check = 24;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
                if(adapter.getItem(position)=="hiron point")
                {
                    obj1.check = obj2.check = obj3.check = obj4.check = 25;
                    startActivity(new Intent(view.getContext(),bottomNav.class));
                }
            }
        });
    }

}