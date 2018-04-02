package com.gitikansh.utkarsh.start7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tenders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tenders);


        final TextView text11 = (TextView) findViewById(R.id.tenders_pdf_11);
        final TextView text12 = (TextView) findViewById(R.id.tenders_pdf_12);
        final TextView text13 = (TextView) findViewById(R.id.tenders_pdf_13);
        final TextView text14 = (TextView) findViewById(R.id.tenders_pdf_14);
        final TextView text15 = (TextView) findViewById(R.id.tenders_pdf_15);
        final TextView text16 = (TextView) findViewById(R.id.tenders_pdf_16);
        final TextView text17 = (TextView) findViewById(R.id.tenders_pdf_17);
        final TextView text18 = (TextView) findViewById(R.id.tenders_pdf_18);
        final TextView text19 = (TextView) findViewById(R.id.tenders_pdf_19);
        final TextView text20 = (TextView) findViewById(R.id.tenders_pdf_20);
        final TextView text21 = (TextView) findViewById(R.id.tenders_pdf_21);
        final TextView text22 = (TextView) findViewById(R.id.tenders_pdf_22);
        final TextView text23 = (TextView) findViewById(R.id.tenders_pdf_23);
        final TextView text24 = (TextView) findViewById(R.id.tenders_pdf_24);
        final TextView text25 = (TextView) findViewById(R.id.tenders_pdf_25);
        final TextView text26 = (TextView) findViewById(R.id.tenders_pdf_26);
        //final TextView text27 = (TextView) findViewById(R.id.tenders_pdf_27);



        text11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/auction-notice-of-litchi-fruits-on-trees-at-nrcl-20-04-17.pdf"));
                startActivity(i);

            }
        });

        text12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/tenders"));
                startActivity(i);

            }
        });

        text13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/quotation-for-twin-litchi-pulper.pdf"));
                startActivity(i);

            }
        });

        text14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/Auction-notice-for-old-store-items-2016-17-and-tender-papers.pdf"));
                startActivity(i);

            }
        });

        text15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/tender-notice-for-security-contract-2017.pdf"));
                startActivity(i);

            }
        });

        text16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/tender-notice-for-work-contract-Estate-III-2017.pdf"));
                startActivity(i);

            }
        });

        text17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/specification-for-furnishing-scientist-visiting-home-furniture-electrical-items.pdf"));
                startActivity(i);

            }
        });

        text18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/Tender-Notice-for-furnishing-Scientist-Visiting-Home-Furnitture-electrical-items.pdf"));
                startActivity(i);

            }
        });

        text19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/specification-of-equipments-07-Dec-2016.pdf"));
                startActivity(i);

            }
        });

        text20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/tender-notice-for-equipments-dated-07-12-2016.pdf"));
                startActivity(i);

            }
        });

        text21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/equipment-specification-06-10-2016.pdf"));
                startActivity(i);

            }
        });

        text22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/tender-notice-and-Tender-document-06-10-2016.pdf"));
                startActivity(i);

            }
        });

        text23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/Tender-notice-for-purchase-of-equipments-15.07.2016.pdf"));
                startActivity(i);

            }
        });

        text24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/Specification-of-equipment-tender-notice-15.07.2016.pdf"));
                startActivity(i);

            }
        });
        text25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/Tender-notice-and-tender-document-Works-contract-Group-I.pdf"));
                startActivity(i);

            }
        });

        text26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/tenders/Steps-to-search-NRCL-tender-on-GOI-EPROCUREMENT-PORTAL.pdf"));
                startActivity(i);

            }
        });

    }


}