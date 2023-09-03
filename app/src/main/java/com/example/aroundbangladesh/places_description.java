package com.example.aroundbangladesh;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class places_description extends Fragment{
    public static int check = 0;
    int ok;
    private TextView des1;
    String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26;
    private TextView details1;
    private ImageView Image1;
    ImageButton fvrt_btnOff,fvrt_btnOn;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference,fvrtref,fvrt_listRef,favouriteref,cH;
    Boolean fvrtChecker = false;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.activity_places_description,container,false);
        fvrt_btnOff = v.findViewById(R.id.fvrtB);
        fvrt_btnOn = v.findViewById(R.id.fvrtBA);
try{
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String currentUserId = user.getUid();
    fvrtref = database.getReference("favourites").child(currentUserId);
    fvrt_listRef = database.getReference("favouriteList").child(currentUserId);
    final String postkey = String.valueOf(check);




    //for the bookmark image
    fvrt_listRef.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            if(check==1){
                try {
                    p1  = snapshot.child("1").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==2){
                try {
                    p2  = snapshot.child("2").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==3){
                try {
                    p3  = snapshot.child("3").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==4){
                try {
                    p4  = snapshot.child("4").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==5){
                try {
                    p5  = snapshot.child("5").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==6){
                try {
                    p6  = snapshot.child("6").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==7){
                try {
                    p7  = snapshot.child("7").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==8){
                try {
                    p8  = snapshot.child("8").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==9){
                try {
                    p9  = snapshot.child("9").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==10){
                try {
                    p10  = snapshot.child("10").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==11){
                try {
                    p11  = snapshot.child("11").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==12){
                try {
                    p12  = snapshot.child("12").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==13){
                try {
                    p13  = snapshot.child("13").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==14){
                try {
                    p14  = snapshot.child("14").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==15){
                try {
                    p15  = snapshot.child("15").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==16){
                try {
                    p16  = snapshot.child("16").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==17){
                try {
                    p17  = snapshot.child("17").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==18){
                try {
                    p18  = snapshot.child("18").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==19){
                try {
                    p19  = snapshot.child("19").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==20){
                try {
                    p20  = snapshot.child("20").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==21){
                try {
                    p21  = snapshot.child("21").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==22){
                try {
                    p22  = snapshot.child("22").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==23){
                try {
                    p23  = snapshot.child("23").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==24){
                try {
                    p24  = snapshot.child("24").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }
            else if(check==25){
                try {
                    p25  = snapshot.child("25").getValue().toString();
                    fvrt_btnOff.setVisibility(View.INVISIBLE);
                    fvrt_btnOn.setVisibility(View.VISIBLE);
                }catch (Exception e)
                {
                    fvrt_btnOff.setVisibility(View.VISIBLE);
                    fvrt_btnOn.setVisibility(View.INVISIBLE);
                }
            }

        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
    });




    fvrt_btnOff.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fvrtChecker = true;
            fvrtref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if(fvrtChecker.equals(true)){
                        if(snapshot.child(postkey).hasChild(currentUserId)){
                            fvrtref.child(postkey).child(currentUserId).removeValue();
                            fvrt_listRef.child(postkey).removeValue();

                            fvrtChecker = false;
                        }else{
                            fvrtref.child(postkey).child(currentUserId).setValue(true);
                            String id = fvrt_listRef.push().getKey();
                            fvrt_listRef.child(postkey).setValue(postkey);
                            fvrtChecker =false;


                        }
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    });
    fvrt_btnOn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fvrtChecker = true;
            fvrtref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if(fvrtChecker.equals(true)){
                        if(snapshot.child(postkey).hasChild(currentUserId)){
                            fvrtref.child(postkey).child(currentUserId).removeValue();
                            fvrt_listRef.child(postkey).removeValue();

                            fvrtChecker = false;
                        }else{
                            fvrtref.child(postkey).child(currentUserId).setValue(true);
                            String id = fvrt_listRef.push().getKey();
                            fvrt_listRef.child(postkey).setValue(postkey);
                            fvrtChecker =false;


                        }
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    });
}catch (Exception e)
{

}




//for showing title,image and des
        if(ok==1) {
            des1 = v.findViewById(R.id.desSaint);
            Image1 = v.findViewById(R.id.picSaint);
            details1 = v. findViewById(R.id.descriptionSaint);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);

        }
        else if(check==2) {
            des1 = v.findViewById(R.id.desKua);
            Image1 = v.findViewById(R.id.picKua);
            details1 = v. findViewById(R.id.descriptionKuakata);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);

        }
       else if(check==3) {
            des1 = v.findViewById(R.id.desSaj);
            Image1 = v.findViewById(R.id.picSaj);
            details1 = v. findViewById(R.id.descriptionSajek);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==4) {
            des1 = v.findViewById(R.id.desfoys);
            Image1 = v.findViewById(R.id.picFoys);
            details1 = v. findViewById(R.id.descriptionFoys);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==5) {
            des1 = v.findViewById(R.id.desnij);
            Image1 = v.findViewById(R.id.picNij);
            details1 = v. findViewById(R.id.descriptionNijhum);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==6) {
            des1 = v.findViewById(R.id.dessun);
            Image1 = v.findViewById(R.id.picSun);
            details1 = v. findViewById(R.id.descriptionSundarban);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
       else if(check==7) {
            des1 = v.findViewById(R.id.descox);
            Image1 = v.findViewById(R.id.picCoxs);
            details1 = v. findViewById(R.id.descriptionCoxs);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==8) {
            des1 = v.findViewById(R.id.deshim);
            Image1 = v.findViewById(R.id.picHim);
            details1 = v. findViewById(R.id.descriptionHimchori);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==9) {
            des1 = v.findViewById(R.id.despaten);
            Image1 = v.findViewById(R.id.picPaten);
            details1 = v. findViewById(R.id.descriptionPatenga);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==10) {
            des1 = v.findViewById(R.id.desahsan);
            Image1 = v.findViewById(R.id.picAhsan);
            details1 = v. findViewById(R.id.descriptionAhsan);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==11) {
            des1 = v.findViewById(R.id.deslal);
            Image1 = v.findViewById(R.id.picLal);
            details1 = v. findViewById(R.id.descriptionLalbagh);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==12) {
            des1 = v.findViewById(R.id.desbata);
            Image1 = v.findViewById(R.id.picBata);
            details1 = v. findViewById(R.id.descriptionBatali);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==13) {
            des1 = v.findViewById(R.id.desshita);
            Image1 = v.findViewById(R.id.picShita);
            details1 = v. findViewById(R.id.descriptionShita);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==14) {
            des1 = v.findViewById(R.id.desvati);
            Image1 = v.findViewById(R.id.picVati);
            details1 = v. findViewById(R.id.descriptionVatiary);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==15) {
            des1 = v.findViewById(R.id.desjaf);
            Image1 = v.findViewById(R.id.picJaf);
            details1 = v. findViewById(R.id.descriptionJaflong);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==16) {
            des1 = v.findViewById(R.id.desbicha);
            Image1 = v.findViewById(R.id.picBicha);
            details1 = v. findViewById(R.id.descriptionBichanakandi);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==17) {
            des1 = v.findViewById(R.id.desbagha);
            Image1 = v.findViewById(R.id.picBagha);
            details1 = v. findViewById(R.id.descriptionBagha);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==18) {
            des1 = v.findViewById(R.id.deskotka);
            Image1 = v.findViewById(R.id.picKotka);
            details1 = v. findViewById(R.id.descriptionKotka);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==19) {
            des1 = v.findViewById(R.id.desdurga);
            Image1 = v.findViewById(R.id.picDurga);
            details1 = v. findViewById(R.id.descriptionDurga);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==20) {
            des1 = v.findViewById(R.id.desbhawal);
            Image1 = v.findViewById(R.id.picBhawal);
            details1 = v. findViewById(R.id.descriptionbhawal);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==21) {
            des1 = v.findViewById(R.id.destara);
            Image1 = v.findViewById(R.id.picTara);
            details1 = v. findViewById(R.id.descriptionTara);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==22) {
            des1 = v.findViewById(R.id.deshamham);
            Image1 = v.findViewById(R.id.picHamham);
            details1 = v. findViewById(R.id.descriptionhamham);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==23) {
            des1 = v.findViewById(R.id.deslala);
            Image1 = v.findViewById(R.id.picLala);
            details1 = v. findViewById(R.id.descriptionlala);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==24) {
            des1 = v.findViewById(R.id.desVaren);
            Image1 = v.findViewById(R.id.picVaren);
            details1 = v. findViewById(R.id.descriptionVaren);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }
        else if(check==25) {
            des1 = v.findViewById(R.id.desHiron);
            Image1 = v.findViewById(R.id.picHiron);
            details1 = v. findViewById(R.id.descriptionHiron);

            des1.setVisibility(View.VISIBLE);
            Image1.setVisibility(View.VISIBLE);
            details1.setVisibility(View.VISIBLE);
        }




        return v;
    }

   


}
