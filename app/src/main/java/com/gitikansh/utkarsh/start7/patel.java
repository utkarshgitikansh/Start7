package com.gitikansh.utkarsh.start7;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class patel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patel);
        String[] items = new String[]{"--Research papers by R. K. Patel--", "Book 1", "Book 2", "Book 3", "Book 4", "Book 5", "Book 6", "Book 7", "Book 8", "Book 9", "Book 10", "Book 11", "Book 12", "Book 13", "Book 14", "Book 15", "Book 16", "Book 17", "Book 18", "Book 19", "Book 20", "Book 21"};

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
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/23.pdf"));
                        startActivity(i);

                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/27.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/28.pdf"));
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/30.pdf"));
                        startActivity(i4);

                        break;

                    case 5:
                        Intent i5 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/31.pdf"));
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/32.pdf"));
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/33.pdf"));
                        startActivity(i7);

                        break;

                    case 8:
                        Intent i8 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/34.pdf"));
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/36.pdf"));
                        startActivity(i9);
                        break;
                    case 10:
                        Intent i10 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/37.pdf"));
                        startActivity(i10);

                        break;

                    case 11:
                        Intent i11 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/39.pdf"));
                        startActivity(i11);
                        break;
                    case 12:
                        Intent i12 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/41.pdf"));
                        startActivity(i12);
                        break;
                    case 13:
                        Intent i13 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/44.pdf"));
                        startActivity(i13);

                        break;

                    case 14:
                        Intent i14 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/46.pdf"));
                        startActivity(i14);
                        break;
                    case 15:
                        Intent i15 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/48.pdf"));
                        startActivity(i15);
                        break;
                    case 16:
                        Intent i16 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/49.pdf"));
                        startActivity(i16);

                        break;

                    case 17:
                        Intent i17 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/50.pdf"));
                        startActivity(i17);
                        break;
                    case 18:
                        Intent i18 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/51.pdf"));
                        startActivity(i18);
                        break;
                    case 19:
                        Intent i19 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/54.pdf"));
                        startActivity(i19);

                        break;

                    case 20:
                        Intent i20 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/55.pdf"));
                        startActivity(i20);
                        break;
                    case 21:
                        Intent i21 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/research-papers/R-K-Patel/56.pdf"));
                        startActivity(i21);
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

