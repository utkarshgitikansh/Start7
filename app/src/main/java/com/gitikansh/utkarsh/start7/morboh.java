package com.gitikansh.utkarsh.start7;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class morboh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morboh);


        String[] items = new String[]{"--Research papers by Evening Stone Morboh--", "Book 1", "Book 2", "Book 3"};

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
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/E-S-Morboh/1.-IJH.pdf"));
                        startActivity(i);

                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/E-S-Morboh/2.-IJH.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/E-S-Morboh/3.-IJAS.pdf"));
                        startActivity(i3);
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
