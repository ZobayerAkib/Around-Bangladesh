package com.example.aroundbangladesh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class places_food extends Fragment{
    public static int check = 0;
    private TextView des1;

    private LinearLayout im1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_places_food,container,false);





        if(check==1) {
            des1 = v.findViewById(R.id.desSaint);
            im1 = v.findViewById(R.id.foodSaint);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);


        }
        if(check==2) {
            des1 = v.findViewById(R.id.desKua);
            im1 = v.findViewById(R.id.foodKuakata);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);


        }
        if(check==3) {
            des1 = v.findViewById(R.id.desSaj);
            im1 = v.findViewById(R.id.foodSajek);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==4) {
            des1 = v.findViewById(R.id.desfoys);
            im1 = v.findViewById(R.id.foodFoysLake);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==5) {
            des1 = v.findViewById(R.id.desnij);
            im1 = v.findViewById(R.id.foodNijhum);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==6) {
            des1 = v.findViewById(R.id.dessun);
            im1 = v.findViewById(R.id.foodSundarban);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==7) {
            des1 = v.findViewById(R.id.descox);
            im1 = v.findViewById(R.id.foodCox);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==8) {
            des1 = v.findViewById(R.id.deshim);
            im1 = v.findViewById(R.id.foodHimchori);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==9) {
            des1 = v.findViewById(R.id.despaten);
            im1 = v.findViewById(R.id.foodPatenga);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==10) {
            des1 = v.findViewById(R.id.desahsan);
            im1 = v.findViewById(R.id.foodAhsan);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==11) {
            des1 = v.findViewById(R.id.deslal);
            im1 = v.findViewById(R.id.foodLalbagh);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==12) {
            des1 = v.findViewById(R.id.desbata);
            im1 = v.findViewById(R.id.foodBatali);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==13) {
            des1 = v.findViewById(R.id.desshita);
            im1 = v.findViewById(R.id.foodShitakundo);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==14) {
            des1 = v.findViewById(R.id.desvati);
            im1 = v.findViewById(R.id.foodVatiary);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==15) {
            des1 = v.findViewById(R.id.desjaf);
            im1 = v.findViewById(R.id.foodJaflong);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==16) {
            des1 = v.findViewById(R.id.desbicha);
            im1 = v.findViewById(R.id.foodBisankandi);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==17) {
            des1 = v.findViewById(R.id.desbagha);
            im1 = v.findViewById(R.id.foodBagha);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==18) {
            des1 = v.findViewById(R.id.deskotka);
            im1 = v.findViewById(R.id.foodKotka);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==19) {
            des1 = v.findViewById(R.id.desdurga);
            im1 = v.findViewById(R.id.foodDurgaShagor);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==20) {
            des1 = v.findViewById(R.id.desbhawal);
            im1 = v.findViewById(R.id.foodBhawal);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==21) {
            des1 = v.findViewById(R.id.destara);
            im1 = v.findViewById(R.id.foodTaraMasjid);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==22) {
            des1 = v.findViewById(R.id.deshamham);
            im1 = v.findViewById(R.id.foodHamham);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==23) {
            des1 = v.findViewById(R.id.deslala);
            im1 = v.findViewById(R.id.foodLala);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==24) {
            des1 = v.findViewById(R.id.desVaren);
            im1 = v.findViewById(R.id.foodVarendra);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }
        if(check==25) {
            des1 = v.findViewById(R.id.desHiron);
            im1 = v.findViewById(R.id.foodHiron);
            des1.setVisibility(View.VISIBLE);
            im1.setVisibility(View.VISIBLE);

        }

        return v;
    }
}