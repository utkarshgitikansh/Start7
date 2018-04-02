package com.gitikansh.utkarsh.start7;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class kuldeep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kuldeep);

        String[] items = new String[]{"--Research papers by Kuldeep Srivastava--", "Book 1", "Book 2", "Book 3", "Book 4", "Book 5", "Book 6"};

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
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Kuldeep-Srivastava/1-1.pdf"));
                        startActivity(i);

                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Kuldeep-Srivastava/2-1.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Kuldeep-Srivastava/4-1.pdf"));
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Kuldeep-Srivastava/7-1.pdf"));
                        startActivity(i4);

                        break;

                    case 5:
                        Intent i5 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Kuldeep-Srivastava/15.pdf"));
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Kuldeep-Srivastava/17.pdf"));
                        startActivity(i6);
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
