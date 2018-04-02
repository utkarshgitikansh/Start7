package com.gitikansh.utkarsh.start7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class news extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);


        final TextView text_new_1 = (TextView) findViewById(R.id.news_pdf_1);
        final TextView text_new_2 = (TextView) findViewById(R.id.news_pdf_2);
        final TextView text_new_3 = (TextView) findViewById(R.id.news_pdf_3);
        final TextView text_new_4 = (TextView) findViewById(R.id.news_pdf_4);


        text_new_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/news/zero-budget-natural-farming-promoted-under-mera-gaon-mera-gaurav-programme-at-kankatti-east-Champaran..pdf"));
                startActivity(i);

            }
        });

        text_new_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/news/field-day-celebrated-at-kankatti-east-champaran-under-mera-gaon-mera-gaurav-programme.pdf"));
                startActivity(i);

            }
        });

        text_new_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/news/icar-short-course-on-trichoderma-organized-at-nrcl-muzaffarpur.pdf"));
                startActivity(i);

            }
        });

        text_new_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/news/NRCL-celebrated-agriculture-education-day-on-11-sep.-2016.pdf"));
                startActivity(i);

            }
        });



    }
}