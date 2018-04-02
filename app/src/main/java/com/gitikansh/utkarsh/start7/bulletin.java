package com.gitikansh.utkarsh.start7;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class bulletin extends AppCompatActivity {



    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulletin);

        final TextView text1 = (TextView) findViewById(R.id.b1);
        final TextView text2 = (TextView) findViewById(R.id.b2);
        final TextView text3 = (TextView) findViewById(R.id.b3);
        final TextView text4 = (TextView) findViewById(R.id.b4);
        final TextView text5 = (TextView) findViewById(R.id.b5);
        final TextView text6 = (TextView) findViewById(R.id.b6);
        final TextView text7 = (TextView) findViewById(R.id.b7);


        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/technical-bulletins/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%AA%E0%A5%8C%E0%A4%A7%E0%A4%B6%E0%A4%BE%E0%A4%B2%E0%A4%BE-%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%AC%E0%A4%82%E0%A4%A7%E0%A4%A8.pdf"));
                startActivity(i);

            }
        });


        text2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/technical-bulletins/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%AE%E0%A5%87%E0%A4%82-%E0%A4%8F%E0%A4%95%E0%A5%80%E0%A4%95%E0%A5%83%E0%A4%A4-%E0%A4%A8%E0%A4%BE%E0%A4%B6%E0%A5%80%E0%A4%9C%E0%A5%80%E0%A4%B5-%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%AC%E0%A4%82%E0%A4%A7%E0%A4%A8.pdf"));
                startActivity(i);

            }
        });


        text3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/technical-bulletins/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%AB%E0%A4%B2%E0%A5%8B%E0%A4%82-%E0%A4%95%E0%A4%BE-%E0%A4%A4%E0%A5%81%E0%A5%9C%E0%A4%BE%E0%A4%88-%E0%A4%89%E0%A4%AA%E0%A4%B0%E0%A4%BE%E0%A4%82%E0%A4%A4-%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%AC%E0%A4%82%E0%A4%A7%E0%A4%A8-%E0%A4%8F%E0%A4%B5%E0%A4%82-%E0%A4%AE%E0%A5%82%E0%A4%B2%E0%A5%8D%E0%A4%AF-%E0%A4%B8%E0%A4%82%E0%A4%B5%E0%A4%B0%E0%A5%8D%E0%A4%A7%E0%A4%A8.pdf"));
                startActivity(i);

            }
        });


        text4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/technical-bulletins/off-season-air-layering-in-litchi-2012.pdf"));
                startActivity(i);

            }
        });


        text5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/technical-bulletins/good-management-practices-in-litchi.pdf"));
                startActivity(i);

            }
        });


        text6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/technical-bulletins/management-of-mango-pests-bilingual-english-and-%E0%A4%B9%E0%A4%BF%E0%A4%A8%E0%A5%8D%E0%A4%A6%E0%A5%80-bulletin.pdf"));
                startActivity(i);

            }
        });


        text7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/technical-bulletins/world-litchi-cultivar.pdf"));
                startActivity(i);

            }
        });



    }
}