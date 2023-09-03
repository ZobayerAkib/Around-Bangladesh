package com.example.aroundbangladesh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class places_route extends Fragment{
    public static int check = 0;
    private TextView des1,des2,des3,des4,des5,des6,des7,des8,des9,des10,des11,des12,des13,des14,des15,des16,des17,des18,des19,des20,des21,des22,des23,des24,des25;
    private TextView rou;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_places_route,container,false);

        des1 = v.findViewById(R.id.desSaint);
        des2 = v.findViewById(R.id.desKua);
        des3 = v.findViewById(R.id.desSaj);
        des4 = v.findViewById(R.id.desfoys);
        des5 = v.findViewById(R.id.desnij);
        des6 = v.findViewById(R.id.dessun);
        des7 = v.findViewById(R.id.descox);
        des8 = v.findViewById(R.id.deshim);
        des9 = v.findViewById(R.id.despaten);
        des10 = v.findViewById(R.id.desahsan);
        des11 = v.findViewById(R.id.deslal);
        des12 = v.findViewById(R.id.desbata);
        des13 = v.findViewById(R.id.desshita);
        des14 = v.findViewById(R.id.desvati);
        des15 = v.findViewById(R.id.desjaf);
        des16 = v.findViewById(R.id.desbicha);
        des17 = v.findViewById(R.id.desbagha);
        des18 = v.findViewById(R.id.deskotka);
        des19 = v.findViewById(R.id.desdurga);
        des20 = v.findViewById(R.id.desbhawal);
        des21 = v.findViewById(R.id.destara);
        des22 = v.findViewById(R.id.deshamham);
        des23 = v.findViewById(R.id.deslala);
        des24 = v.findViewById(R.id.desVaren);
        des25 = v.findViewById(R.id.desHiron);



        if(check==1) {
            des1.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rSaint);
            rou.setVisibility(View.VISIBLE);


        }
        if(check==2) {
            des2.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rKua);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==3) {
            des3.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rSaj);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==4) {
            des4.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rfoy);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==5) {
            des5.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rnij);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==6) {
            des6.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rSun);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==7) {
            des7.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rcox);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==8) {
            des8.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rhim);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==9) {
            des9.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rpat);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==10) {
            des10.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rahs);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==11) {
            des11.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rlal);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==12) {
            des12.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rbata);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==13) {
            des13.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rShita);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==14) {
            des14.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rvat);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==15) {
            des15.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rjaf);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==16) {
            des16.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rbicha);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==17) {
            des17.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rbag);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==18) {
            des18.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rkot);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==19) {
            des19.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rdurga);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==20) {
            des20.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rBhawal);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==21) {
            des21.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rtara);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==22) {
            des22.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rhamham);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==23) {
            des23.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rlala);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==24) {
            des24.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rvaren);
            rou.setVisibility(View.VISIBLE);

        }
        if(check==25) {
            des25.setVisibility(View.VISIBLE);
            rou = v.findViewById(R.id.rHiron);
            rou.setVisibility(View.VISIBLE);

        }

       return v;
    }
}