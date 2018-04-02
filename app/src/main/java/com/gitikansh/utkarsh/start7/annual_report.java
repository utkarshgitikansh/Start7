package com.gitikansh.utkarsh.start7;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class annual_report extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annual_report);

        final TextView click1 = (TextView) findViewById(R.id.item_1);
        final TextView click2 = (TextView) findViewById(R.id.item_2);
        final TextView click3 = (TextView) findViewById(R.id.item_3);
        final TextView click4 = (TextView) findViewById(R.id.item_4);
        final TextView click5 = (TextView) findViewById(R.id.item_5);


        click1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/annual-reports/annual-report-2015-16-English.pdf"));
                startActivity(i);
            }
        });
        click2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/annual-reports/annual-report-2014-15-English.pdf"));
                startActivity(i);
            }
        });
        click3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/annual-reports/Annual-Report-2013-14.pdf"));
                startActivity(i);
            }
        });
        click4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://nrclitchi.org/"));
                startActivity(i);
            }
        });
        click5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://nrclitchi.org/"));
                startActivity(i);
            }
        });

    }

    //@Override
    // public void onBackPressed() {
    //   startActivity(new Intent(read_more.this, Main2Activity.class));
    //      read_more.this.finish();
    //  }

}
