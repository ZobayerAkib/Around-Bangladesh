package com.example.aroundbangladesh;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
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

public class places_hotel extends Fragment{



    public static int check = 0;

    private LinearLayout im1,im2,im3,im4,im5;
    //title of the place
    private TextView des1;
    //hotels
    private LinearLayout ln1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_places_hotel,container,false);




//1 saint
        if(check==1) {
            des1 = v.findViewById(R.id.desSaint);
            ln1 = v.findViewById(R.id.linSaint);
            im1 = v.findViewById(R.id.saint1);
            im2 = v.findViewById(R.id.saint2);
            im3 = v.findViewById(R.id.saint3);
            im4 = v.findViewById(R.id.saint4);
            im5 = v.findViewById(R.id.saint5);

            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);
            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelsaintmartin.com.bd/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://hotelfantasy.com.bd/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://praasadparadise.com.bd/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.seapearlcoxsbazar.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/muscat-holiday-resort.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEIVbXVzY2F0LWhvbGlkYXktcmVzb3J0SDNYA2gUiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuALj4diCBsACAdICJDE3ZTczZDkyLWViMzYtNDJkZS1hZDFjLWE2ZDdhZjA0MTVmMNgCBOACAQ;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });

         }
//2 kuakata
        else if(check==2) {
            des1 = v.findViewById(R.id.desKua);
            ln1 = v.findViewById(R.id.linKua);
            im1 = v.findViewById(R.id.kua1);
            im2 = v.findViewById(R.id.kua2);
            im3 = v.findViewById(R.id.kua3);
            im4 = v.findViewById(R.id.kua4);
            im5 = v.findViewById(R.id.kua5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://hotelgraverinn.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://khan-palace.bangladeshhotels.net/en/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.kuakatagrandhotel.com/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/sagor-konna-resort-ltd.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEIWc2Fnb3Ita29ubmEtcmVzb3J0LWx0ZEgzWANoFIgBAZgBCbgBF8gBDNgBA-gBAYgCAagCA7gC64qCgwbAAgHSAiQ5MDA2YmYzOC02M2ZhLTQzNzctODM4OC04ODI2M2FkYTdiMWXYAgTgAgE;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotels.com/ho1210476096/somudra-bari-resort-kalapara-bangladesh/"));
                    startActivity(intent);

                }
            });

        }
//3 sajek
        else if(check==3) {
            des1 = v.findViewById(R.id.desSaj);
            ln1 = v.findViewById(R.id.linSajek);
            im1 = v.findViewById(R.id.saj1);
            im2 = v.findViewById(R.id.saj2);
            im3 = v.findViewById(R.id.saj3);
            im4 = v.findViewById(R.id.saj4);
            im5 = v.findViewById(R.id.saj5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.bdbooking.com/Bangladesh/Salka-Eco-Resort-Sajek.html"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://hotel.com.bd/hotels/meghadree-eco-resort-sajek-valley-rangamati/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.bdbooking.com/Bangladesh/Mono-Adam-Resort-Sajek.html"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.trivago.com/chittagong-83539/hotel/resort-rungrang---sajek-20770692"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.tripadvisor.com/Hotel_Review-g13326420-d12202510-Reviews-Sajek_Resort-Sajek_Chittagong_Division.html"));
                    startActivity(intent);

                }
            });
         }
//4 foys
        else if(check==4) {
            des1 = v.findViewById(R.id.desfoys);
            ln1 = v.findViewById(R.id.linFoys);
            im1 = v.findViewById(R.id.foy1);
            im2 = v.findViewById(R.id.foy2);
            im3 = v.findViewById(R.id.foy3);
            im4 = v.findViewById(R.id.foy4);
            im5 = v.findViewById(R.id.foy5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://foyslakeresort.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/hilton-city.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEILaGlsdG9uLWNpdHlIM1gDaBSIAQGYAQm4ARfIAQzYAQPoAQGIAgGoAgO4AoOP2IIGwAIB0gIkMmNmZjc2ODItMTYwZi00NGY4LWIwNTAtZDFiMGE2NDEyMzIy2AIE4AIB;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/executive-residence.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEITZXhlY3V0aXZlLXJlc2lkZW5jZUgzWANoFIgBAZgBCbgBF8gBDNgBA-gBAYgCAagCA7gCnZPYggbAAgHSAiQyMGE0MDAyOS02MmY1LTQ2NzQtODBjNS00M2UxYzhhY2E2MTnYAgTgAgE;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://agrabadhotel.com/en/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.ambassadorresidency.com/"));
                    startActivity(intent);

                }
            });

        }
//5 nijhum dwip
        else if(check==5) {
            des1 = v.findViewById(R.id.desnij);
            ln1 = v.findViewById(R.id.linNijhum);
            im1 = v.findViewById(R.id.nij1);
            im2 = v.findViewById(R.id.nij2);
            im3 = v.findViewById(R.id.nij3);
            im4 = v.findViewById(R.id.nij4);
            im5 = v.findViewById(R.id.nij5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/vista-bay-resort.en-gb.html"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://hotelgracecox.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/shamuda-waves-resort-cox-39-s-bazar.en-gb.html"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/muscat-holiday-resort.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEIVbXVzY2F0LWhvbGlkYXktcmVzb3J0SDNYA2gUiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuALj4diCBsACAdICJDE3ZTczZDkyLWViMzYtNDJkZS1hZDFjLWE2ZDdhZjA0MTVmMNgCBOACAQ;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/grand-beach-resort.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEISZ3JhbmQtYmVhY2gtcmVzb3J0SDNYA2gUiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuAL64tiCBsACAdICJDgyYWJjNGIxLWRhN2UtNDkyMy05ZjljLWNmYzQzZTlhMzkxONgCBOACAQ;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });

        }
//6 sundarban
        else if(check==6) {
            des1 = v.findViewById(R.id.dessun);
            ln1 = v.findViewById(R.id.linSundarban);
            im1 = v.findViewById(R.id.sun1);
            im2 = v.findViewById(R.id.sun2);
            im3 = v.findViewById(R.id.sun3);
            im4 = v.findViewById(R.id.sun4);
            im5 = v.findViewById(R.id.sun5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/tiger-garden-int.en-gb.html"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.zabeerhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://divinetextile.com/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelcastlesalam.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://tour.com.bd/hotels/bangladesh/khulna/hotel-royal-international"));
                    startActivity(intent);

                }
            });

        }
//7 cox's bazar
        else if(check==7) {
            des1 = v.findViewById(R.id.descox);
            ln1 = v.findViewById(R.id.linCoxs);
            im1 = v.findViewById(R.id.cox1);
            im2 = v.findViewById(R.id.cox2);
            im3 = v.findViewById(R.id.cox3);
            im4 = v.findViewById(R.id.cox4);
            im5 = v.findViewById(R.id.cox5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.seapearlcoxsbazar.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/muscat-holiday-resort.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEIVbXVzY2F0LWhvbGlkYXktcmVzb3J0SDNYA2gUiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuALj4diCBsACAdICJDE3ZTczZDkyLWViMzYtNDJkZS1hZDFjLWE2ZDdhZjA0MTVmMNgCBOACAQ;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/grand-beach-resort.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEISZ3JhbmQtYmVhY2gtcmVzb3J0SDNYA2gUiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuAL64tiCBsACAdICJDgyYWJjNGIxLWRhN2UtNDkyMy05ZjljLWNmYzQzZTlhMzkxONgCBOACAQ;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://hotelgracecox.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://praasadparadise.com.bd/"));
                    startActivity(intent);

                }
            });

        }
//8 himchori
        else if(check==8) {
            des1 = v.findViewById(R.id.deshim);
            ln1 = v.findViewById(R.id.linHim);
            im1 = v.findViewById(R.id.him1);
            im2 = v.findViewById(R.id.him2);
            im3 = v.findViewById(R.id.him3);
            im4 = v.findViewById(R.id.him4);
            im5 = v.findViewById(R.id.him5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://hotelgracecox.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/muscat-holiday-resort.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEIVbXVzY2F0LWhvbGlkYXktcmVzb3J0SDNYA2gUiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuALj4diCBsACAdICJDE3ZTczZDkyLWViMzYtNDJkZS1hZDFjLWE2ZDdhZjA0MTVmMNgCBOACAQ;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://praasadparadise.com.bd/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.seapearlcoxsbazar.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/grand-beach-resort.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEISZ3JhbmQtYmVhY2gtcmVzb3J0SDNYA2gUiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuAL64tiCBsACAdICJDgyYWJjNGIxLWRhN2UtNDkyMy05ZjljLWNmYzQzZTlhMzkxONgCBOACAQ;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });

        }
//9 patenga
        else if(check==9) {
            des1 = v.findViewById(R.id.despaten);
            ln1 = v.findViewById(R.id.linPaten);
            im1 = v.findViewById(R.id.pat1);
            im2 = v.findViewById(R.id.pat2);
            im3 = v.findViewById(R.id.pat3);
            im4 = v.findViewById(R.id.pat4);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/swiss-garden-international.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/golden-inn-chattagram-ltd.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/the-peninsula-chittagong-limited.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/executive-residence.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=5;hpos=5;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });


        }
//10 ahsanmonjil
        else if(check==10) {
            des1 = v.findViewById(R.id.desahsan);
            ln1 = v.findViewById(R.id.linAhsan);
            im1 = v.findViewById(R.id.ahs1);
            im2 = v.findViewById(R.id.ahs2);
            im3 = v.findViewById(R.id.ahs3);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.ihg.com/intercontinental/hotels/us/en/dhaka/dachb/hoteldetail"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.guestreservations.com/pan-pacific-sonargaon-dhaka/booking?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHuyb7KlXwMYHTGsyEI1u7hjQWNWK3Qv3tZh6bTcVUn9JN1gjPYDEd8aAiImEALw_wcB"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotel71.com.bd/contacts?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHsGJi8lMFrDvuNtX3t-ZvyZ6aC-o3iJ-OY3cr7iUtYP8MY3GfhFuIIaAgbzEALw_wcB"));
                    startActivity(intent);

                }
            });


        }
//11 lalbagh
        else if(check==11) {
            des1 = v.findViewById(R.id.deslal);
            ln1 = v.findViewById(R.id.linAhsan);
            im1 = v.findViewById(R.id.ahs1);
            im2 = v.findViewById(R.id.ahs2);
            im3 = v.findViewById(R.id.ahs3);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.ihg.com/intercontinental/hotels/us/en/dhaka/dachb/hoteldetail"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.guestreservations.com/pan-pacific-sonargaon-dhaka/booking?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHuyb7KlXwMYHTGsyEI1u7hjQWNWK3Qv3tZh6bTcVUn9JN1gjPYDEd8aAiImEALw_wcB"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotel71.com.bd/contacts?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHsGJi8lMFrDvuNtX3t-ZvyZ6aC-o3iJ-OY3cr7iUtYP8MY3GfhFuIIaAgbzEALw_wcB"));
                    startActivity(intent);

                }
            });

        }
//12 batali
        else if(check==12) {
            des1 = v.findViewById(R.id.desbata);
            ln1 = v.findViewById(R.id.linPaten);
            im1 = v.findViewById(R.id.pat1);
            im2 = v.findViewById(R.id.pat2);
            im3 = v.findViewById(R.id.pat3);
            im4 = v.findViewById(R.id.pat4);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/swiss-garden-international.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/golden-inn-chattagram-ltd.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/the-peninsula-chittagong-limited.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/executive-residence.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=5;hpos=5;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

        }

//13 shitakundo
        else if(check==13) {
            des1 = v.findViewById(R.id.desshita);
            ln1 = v.findViewById(R.id.linPaten);
            im1 = v.findViewById(R.id.pat1);
            im2 = v.findViewById(R.id.pat2);
            im3 = v.findViewById(R.id.pat3);
            im4 = v.findViewById(R.id.pat4);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/swiss-garden-international.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/golden-inn-chattagram-ltd.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/the-peninsula-chittagong-limited.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/executive-residence.html?aid=318615;label=New_English_EN_BD_27027306985-saJzAQNvt8yRWoMlV_CRnAS102064107385%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi2658305924%3Atidsa-323196532297%3Alp9069450%3Ali%3Adec%3Adm;sid=0d24c51143f1780c28d538074489a3bb;dest_id=-2730680;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=5;hpos=5;no_rooms=1;room1=A%2CA;sb_price_type=total;spdest=ci%2F-2730680;sr_order=popularity;srepoch=1616255650;srpvid=fc9b6fd018ca0069;type=total;ucfs=1&#hotelTmpl"));
                    startActivity(intent);

                }
            });

        }
//14 vatiary
        else if(check==14) {
            des1 = v.findViewById(R.id.desvati);
            ln1 = v.findViewById(R.id.linVati);
            im1 = v.findViewById(R.id.vat1);
            im2 = v.findViewById(R.id.vat2);
            im3 = v.findViewById(R.id.vat3);
            im4 = v.findViewById(R.id.vat4);



            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://agrabadhotel.com/en/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.whiteinnhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://hotel-royal-avenue-chittagong.booked.net/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/hilton-city.en-gb.html?aid=356980;label=gog235jc-1DCAsoFEILaGlsdG9uLWNpdHlIM1gDaBSIAQGYAQm4ARfIAQzYAQPoAQGIAgGoAgO4AoOP2IIGwAIB0gIkMmNmZjc2ODItMTYwZi00NGY4LWIwNTAtZDFiMGE2NDEyMzIy2AIE4AIB;sid=3ff460941a9b6de8ae737334678afe2f;dist=0&keep_landing=1&sb_price_type=total&type=total&"));
                    startActivity(intent);

                }
            });


        }
//15 jaflong
        else if(check==15) {
            des1 = v.findViewById(R.id.desjaf);
            ln1 = v.findViewById(R.id.linJaf);
            im1 = v.findViewById(R.id.jaf1);
            im2 = v.findViewById(R.id.jaf2);
            im3 = v.findViewById(R.id.jaf3);
            im4 = v.findViewById(R.id.jaf4);
            im5 = v.findViewById(R.id.jaf5);



            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.noorjahangrand.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.roseviewhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelsupreme.net/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelholygate.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelpolotowers.com/polo-orchid-resort-cherrapunjee/"));
                    startActivity(intent);

                }
            });

        }
//16 bichanakandi
        else if(check==16) {
            des1 = v.findViewById(R.id.desbicha);
            ln1 = v.findViewById(R.id.linJaf);
            im1 = v.findViewById(R.id.jaf1);
            im2 = v.findViewById(R.id.jaf2);
            im3 = v.findViewById(R.id.jaf3);
            im4 = v.findViewById(R.id.jaf4);
            im5 = v.findViewById(R.id.jaf5);



            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.noorjahangrand.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.roseviewhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelsupreme.net/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelholygate.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelpolotowers.com/polo-orchid-resort-cherrapunjee/"));
                    startActivity(intent);

                }
            });

        }
//17 bagha mosque
        else if(check==17) {
            des1 = v.findViewById(R.id.desbagha);
            ln1 = v.findViewById(R.id.linBagha);
            im1 = v.findViewById(R.id.bag1);
            im2 = v.findViewById(R.id.bag2);
            im3 = v.findViewById(R.id.bag3);




            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://greencityint.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://hotelstarint.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://hotelmukta.com.bd/"));
                    startActivity(intent);

                }
            });


        }
//kotka
        else if(check==18)
        {
            des1 = v.findViewById(R.id.deskotka);
            ln1 = v.findViewById(R.id.linSundarban);
            im1 = v.findViewById(R.id.sun1);
            im2 = v.findViewById(R.id.sun2);
            im3 = v.findViewById(R.id.sun3);
            im4 = v.findViewById(R.id.sun4);
            im5 = v.findViewById(R.id.sun5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/tiger-garden-int.en-gb.html"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.zabeerhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://divinetextile.com/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelcastlesalam.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://tour.com.bd/hotels/bangladesh/khulna/hotel-royal-international"));
                    startActivity(intent);

                }
            });
        }
//durga
        else if(check==19)
        {
            des1 = v.findViewById(R.id.desdurga);
            ln1 = v.findViewById(R.id.linDur);
            im1 = v.findViewById(R.id.dur1);
            im2 = v.findViewById(R.id.dur2);
            im3 = v.findViewById(R.id.dur3);




            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://hotelgrandparkbarisal.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.tigergardenhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://pushpobilash.com/index.php"));
                    startActivity(intent);

                }
            });

        }
  //20 bhawal
        else if(check==20) {
            des1 = v.findViewById(R.id.desbhawal);
            ln1 = v.findViewById(R.id.linAhsan);
            im1 = v.findViewById(R.id.ahs1);
            im2 = v.findViewById(R.id.ahs2);
            im3 = v.findViewById(R.id.ahs3);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.ihg.com/intercontinental/hotels/us/en/dhaka/dachb/hoteldetail"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.guestreservations.com/pan-pacific-sonargaon-dhaka/booking?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHuyb7KlXwMYHTGsyEI1u7hjQWNWK3Qv3tZh6bTcVUn9JN1gjPYDEd8aAiImEALw_wcB"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotel71.com.bd/contacts?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHsGJi8lMFrDvuNtX3t-ZvyZ6aC-o3iJ-OY3cr7iUtYP8MY3GfhFuIIaAgbzEALw_wcB"));
                    startActivity(intent);

                }
            });

        }
 //21 tara
        else if(check==21) {
            des1 = v.findViewById(R.id.destara);
            ln1 = v.findViewById(R.id.linAhsan);
            im1 = v.findViewById(R.id.ahs1);
            im2 = v.findViewById(R.id.ahs2);
            im3 = v.findViewById(R.id.ahs3);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.ihg.com/intercontinental/hotels/us/en/dhaka/dachb/hoteldetail"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.guestreservations.com/pan-pacific-sonargaon-dhaka/booking?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHuyb7KlXwMYHTGsyEI1u7hjQWNWK3Qv3tZh6bTcVUn9JN1gjPYDEd8aAiImEALw_wcB"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotel71.com.bd/contacts?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHsGJi8lMFrDvuNtX3t-ZvyZ6aC-o3iJ-OY3cr7iUtYP8MY3GfhFuIIaAgbzEALw_wcB"));
                    startActivity(intent);

                }
            });

        }
 //22 hamham
        else if(check==22) {
            des1 = v.findViewById(R.id.deshamham);
            ln1 = v.findViewById(R.id.linJaf);
            im1 = v.findViewById(R.id.jaf1);
            im2 = v.findViewById(R.id.jaf2);
            im3 = v.findViewById(R.id.jaf3);
            im4 = v.findViewById(R.id.jaf4);
            im5 = v.findViewById(R.id.jaf5);



            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.noorjahangrand.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.roseviewhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelsupreme.net/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelholygate.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelpolotowers.com/polo-orchid-resort-cherrapunjee/"));
                    startActivity(intent);

                }
            });

        }
 //23 lala
        else if(check==23) {
            des1 = v.findViewById(R.id.deslala);
            ln1 = v.findViewById(R.id.linJaf);
            im1 = v.findViewById(R.id.jaf1);
            im2 = v.findViewById(R.id.jaf2);
            im3 = v.findViewById(R.id.jaf3);
            im4 = v.findViewById(R.id.jaf4);
            im5 = v.findViewById(R.id.jaf5);



            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.noorjahangrand.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.roseviewhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelsupreme.net/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelholygate.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.hotelpolotowers.com/polo-orchid-resort-cherrapunjee/"));
                    startActivity(intent);

                }
            });

        }
//24 varendra
        else if(check==24) {
            des1 = v.findViewById(R.id.desVaren);
            ln1 = v.findViewById(R.id.linBagha);
            im1 = v.findViewById(R.id.bag1);
            im2 = v.findViewById(R.id.bag2);
            im3 = v.findViewById(R.id.bag3);




            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://greencityint.com/"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://hotelstarint.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://hotelmukta.com.bd/"));
                    startActivity(intent);

                }
            });


        }
//25 hiron
        else if(check==25) {
            des1 = v.findViewById(R.id.desHiron);
            ln1 = v.findViewById(R.id.linSundarban);
            im1 = v.findViewById(R.id.sun1);
            im2 = v.findViewById(R.id.sun2);
            im3 = v.findViewById(R.id.sun3);
            im4 = v.findViewById(R.id.sun4);
            im5 = v.findViewById(R.id.sun5);


            des1.setVisibility(View.VISIBLE);
            ln1.setVisibility(View.VISIBLE);

            im1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.booking.com/hotel/bd/tiger-garden-int.en-gb.html"));
                    startActivity(intent);

                }
            });

            im2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.zabeerhotel.com/"));
                    startActivity(intent);

                }
            });

            im3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://divinetextile.com/"));
                    startActivity(intent);

                }
            });
            im4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.hotelcastlesalam.com/"));
                    startActivity(intent);

                }
            });
            im5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://tour.com.bd/hotels/bangladesh/khulna/hotel-royal-international"));
                    startActivity(intent);

                }
            });

        }
        return v;
    }
}