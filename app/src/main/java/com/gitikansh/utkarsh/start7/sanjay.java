package com.gitikansh.utkarsh.start7;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class sanjay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sanjay);

        String[] items = new String[]{"--Research papers by Sanjay Kumar Singh--", "Book 1", "Book 2", "Book 3", "Book 4", "Book 5", "Book 6", "Book 7", "Book 8", "Book 9", "Book 10", "Book 11", "Book 12", "Book 13"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/1.pdf"));
                        startActivity(i);

                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/2.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/3.pdf"));
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/4.pdf"));
                        startActivity(i4);

                        break;

                    case 5:
                        Intent i5 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/5.pdf"));
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/6.pdf"));
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/7.pdf"));
                        startActivity(i7);

                        break;

                    case 8:
                        Intent i8 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/8.pdf"));
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/10.pdf"));
                        startActivity(i9);
                        break;
                    case 10:
                        Intent i10 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/11.pdf"));
                        startActivity(i10);

                        break;

                    case 11:
                        Intent i11 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/12.pdf"));
                        startActivity(i11);
                        break;
                    case 12:
                        Intent i12 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/13.pdf"));
                        startActivity(i12);
                        break;
                    case 13:
                        Intent i13 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Sanjay-Kumar-Singh/14.pdf"));
                        startActivity(i13);

                        break;


                }
                spinner.setSelection(0);

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }




    public void onItemSelected(AdapterView<?> parent, View view,
                               int position, long id) {
    }

    public void onNothingSelected (AdapterView < ? > parent){
        return;

    }

}
