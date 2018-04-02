package com.gitikansh.utkarsh.start7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);


        final TextView text1 = (TextView) findViewById(R.id.notice_pdf_1);
        final TextView text2 = (TextView) findViewById(R.id.notice_pdf_2);
        final TextView text3 = (TextView) findViewById(R.id.notice_pdf_3);
        final TextView text4 = (TextView) findViewById(R.id.notice_pdf_4);
        final TextView text5 = (TextView) findViewById(R.id.notice_pdf_5);
        final TextView text6 = (TextView) findViewById(R.id.notice_pdf_6);
        final TextView text7 = (TextView) findViewById(R.id.notice_pdf_7);


        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/notice/BRNS_2.pdf"));
                startActivity(i);

            }
        });

        text2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/notice/Notice-Office-Closure.pdf"));
                startActivity(i);

            }
        });

        text3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/notice/Walk-in-interview-for-JRF-under-BRNS-Project-scheduled-on-12th-September-2017.pdf"));
                startActivity(i);

            }
        });

        text4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/recruitments/Filing-up-of-Sr.-Technical-Officer-T6-on-deputation-basis.pdf"));
                startActivity(i);

            }
        });

        text5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/notice/application-form-for-allotment-of-accommodation-in-nrcl-guest-house.pdf"));
                startActivity(i);

            }
        });

        text6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/Steps-to-search-NRCL-tender-on-GOI-EPROCUREMENT-PORTAL.pdf"));
                startActivity(i);

            }
        });

        text7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/notice/Guidelines-for-ICAR-Extramural-Projects.pdf"));
                startActivity(i);

            }
        });

    }


}