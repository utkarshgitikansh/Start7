package com.gitikansh.utkarsh.start7;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class recruit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recruit);


        final TextView text111 = (TextView) findViewById(R.id.recruit_pdf_11);
        final TextView text112 = (TextView) findViewById(R.id.recruit_pdf_12);
        final TextView text113 = (TextView) findViewById(R.id.recruit_pdf_13);
        final TextView text114 = (TextView) findViewById(R.id.recruit_pdf_14);
        final TextView text115 = (TextView) findViewById(R.id.recruit_pdf_15);
        final TextView text116 = (TextView) findViewById(R.id.recruit_pdf_16);
        final TextView text117 = (TextView) findViewById(R.id.recruit_pdf_17);
        final TextView text118 = (TextView) findViewById(R.id.recruit_pdf_18);
        final TextView text119 = (TextView) findViewById(R.id.recruit_pdf_19);
        final TextView text120 = (TextView) findViewById(R.id.recruit_pdf_20);
        final TextView text121 = (TextView) findViewById(R.id.recruit_pdf_21);
        final TextView text122 = (TextView) findViewById(R.id.recruit_pdf_22);
        final TextView text123 = (TextView) findViewById(R.id.recruit_pdf_23);
       


        text111.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/Filing-up-of-Sr.-Technical-Officer-T6-on-deputation-basis.pdf"));
                startActivity(i);

            }
        });

        text112.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/result-of-walk-in-interview-held-for-yp-on-15-Dec-2016.pdf"));
                startActivity(i);

            }
        });

        text113.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/scan0016.pdf"));
                startActivity(i);

            }
        });

        text114.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/walk-in-interview-for-young-professional-I-II-date-of-interview-08-11-2016.pdf"));
                startActivity(i);

            }
        });

        text115.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/t-1-syllabus.jpg"));
                startActivity(i);

            }
        });

        text116.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/recruitments"));
                startActivity(i);

            }
        });

        text117.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/t-1_instructions_for_candidates_including_scheme_of_examination.pdf"));
                startActivity(i);

            }
        });

        text118.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/notice_t-1_date_venue.pdf"));
                startActivity(i);

            }
        });

        text119.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/list-of-t-1_screened-in_shortlisted.pdf"));
                startActivity(i);

            }
        });

        text120.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/notice-relevant_details_t-1_asrb.pdf"));
                startActivity(i);

            }
        });

        text121.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/answer-key-of-techical-examination-t-3-20160804.pdf"));
                startActivity(i);

            }
        });

        text122.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/examination-notice-for-recruitment-of-technical-assistant-t-3.pdf"));
                startActivity(i);

            }
        });

        text123.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/t-3-recruitment-guidelines.pdf"));
                startActivity(i);

            }
        });

    }


}

