package com.gitikansh.utkarsh.start7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class home extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

   // @Override
   // public void onBackPressed() {
    //    startActivity(new Intent(home.this, Main2Activity.class));
  //  }
        final TextView click1 = (TextView) findViewById(R.id.event_2);
        final TextView click2 = (TextView) findViewById(R.id.event_3);
        final TextView click3 = (TextView) findViewById(R.id.event_4);
        final TextView click4 = (TextView) findViewById(R.id.event_5);
        final TextView click5 = (TextView) findViewById(R.id.event_6);
        final TextView click6 = (TextView) findViewById(R.id.event_7);
        final TextView click7 = (TextView) findViewById(R.id.event_8);
        final TextView click8 = (TextView) findViewById(R.id.event_9);
        final TextView click9 = (TextView) findViewById(R.id.event_10);
        final TextView click10 = (TextView) findViewById(R.id.event_11);
        final TextView click11 = (TextView) findViewById(R.id.event_12);
        final TextView click12 = (TextView) findViewById(R.id.event_1);



        final TextView click22 = (TextView) findViewById(R.id.event_22);
        final TextView click23 = (TextView) findViewById(R.id.event_23);
        final TextView click24 = (TextView) findViewById(R.id.event_24);


        click1.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v1) {
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.nrclitchi.org/uploads/ICAR-NRCL-ISO-certificate.pdf"));
            startActivity(i);
        }
        });

        click2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(home.this, read_more2.class));
            }
        });

        click3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(home.this, home_organo.class));
            }
        });

        click4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(home.this, infrastructure.class));
            }
        });

        click5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(home.this, governance.class));
            }
        });

        click6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(home.this, projects.class));
            }
        });

        click7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/Technology-Developed.pdf"));
                startActivity(i);
            }
        });

        click8.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v1) {
                startActivity(new Intent(home.this, annual_report.class));
            }
        });

        click9.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v1) {
                startActivity(new Intent(home.this, achievements.class));
            }
        });

        click10.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/vision-2030_NRCL.pdf"));
                startActivity(i);
            }
        });
        click11.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/nrcl_vision-2050.pdf"));
                startActivity(i);
            }
        });

        click12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/events/brochure-on-winter-school-at-nrcl.pdf"));
                startActivity(i);
            }
        });

        click22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/farmers-advisory/Advisory-on-management-of-fruit-borers-of-litchi-English-1.pdf"));
                startActivity(i);
            }
        });
        click23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/farmers-advisory/Advisory-on-management-of-fruit-borers-of-litchi-Hindi-1.pdf"));
                startActivity(i);
            }
        });
        click24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/farmers-advisory/Likely-%20attack-of-Loopers-in-litchi.pdf"));
                startActivity(i);
            }
        });






    }



}
