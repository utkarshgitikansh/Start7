package com.gitikansh.utkarsh.start7;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

public class books extends AppCompatActivity implements OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);


        String[] items = new String[]{"-- The Litchi Chapters --", "Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7","Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12","Chapter-13","Chapter-14","Chapter-15","Chapter-16","Chapter-17","Chapter-18","Chapter-19","Chapter-20" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);
        //spinner.setOnItemSelectedListener(books.this);


        final TextView text1 = (TextView) findViewById(R.id.b1);
        final TextView text2 = (TextView) findViewById(R.id.b2);
        final TextView text3 = (TextView) findViewById(R.id.b3);
        final TextView text4 = (TextView) findViewById(R.id.b4);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-1-importance-and-distribution.pdf"));
                        startActivity(i);

                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-2-climate-and-soil.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-3-cultivar-and-genetic-enhancement.pdf"));
                        startActivity(i3);
                        break;

                    case 4:
                        Intent i4 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-4-plant-propagation.pdf"));
                        startActivity(i4);
                        break;

                    case 5:
                        Intent i5 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-5-establishing-the-orchard.pdf"));
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-6-high-density-planting.pdf"));
                        startActivity(i6);
                        break;

                    case 7:
                        Intent i7 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-7-care-of-the-young-orchard.pdf"));
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-8-tree-growth-flowering-and-fruiting.pdf"));
                        startActivity(i8);
                        break;

                    case 9:
                        Intent i9 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-9-nutritional-requirement.pdf"));
                        startActivity(i9);
                        break;

                    case 10:
                        Intent i10 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-10-water-requirement-and-irrigation.pdf"));
                        startActivity(i10);
                        break;
                    case 11:
                        Intent i11 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-11-orchard-floor-management.pdf"));
                        startActivity(i11);
                        break;

                    case 12:
                        Intent i12 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-12-Ensure-regular-bearing.pdf"));
                        startActivity(i12);
                        break;
                    case 13:
                        Intent i13 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-13-canopy-management-and-rejuvination.pdf"));
                        startActivity(i13);
                        break;

                    case 14:
                        Intent i14 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-14-insect-pest-management.pdf"));
                        startActivity(i14);
                        break;

                    case 15:
                        Intent i15 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://nrclitchi.org/"));
                        startActivity(i15);
                        break;
                    case 16:
                        Intent i16 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-16-physiological-disorders.pdf"));
                        startActivity(i16);
                        break;

                    case 17:
                        Intent i17 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-17-fruit-maturity-and-harvest.pdf"));
                        startActivity(i17);
                        break;
                    case 18:
                        Intent i18 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-18-post-harvest-handling-and-storage.pdf"));
                        startActivity(i18);
                        break;

                    case 19:
                        Intent i19 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-19-processing-and-value-addition.pdf"));
                        startActivity(i19);
                        break;

                    case 20:
                        Intent i20 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/books/Chap-20-marketing-and-production-economics.pdf"));
                        startActivity(i20);
                        break;

                    default:
                        return;
                }
                spinner.setSelection(0);

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/books/litchi-preventive-practices-curative-measures-content.pdf"));
                startActivity(i);

            }
        });


        text2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/books/the-litchi-gorakh-singh-et-al-Content.pdf"));
                startActivity(i);

            }
        });


        text3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/books/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-Gorakh-Singh-Vishal-Nath-SD-Pandey-Content.pdf"));
                startActivity(i);

            }
        });


        text4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/books/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%95%E0%A5%80-%E0%A4%96%E0%A5%87%E0%A4%A4%E0%A5%80-%E0%A4%B0%E0%A4%BE%E0%A4%9C%E0%A5%87%E0%A4%B6-content.pdf"));
                startActivity(i);

            }
        });





    }




    public void onItemSelected(AdapterView<?> parent, View view,
                               int position, long id) {
        //   switch (parent.getId()) {
        //    case R.id.spinner1:





        // case R.id.spinner2:

        //    switch (position) {
        //        case 1:
        //            startActivity(new Intent(publications.this, bulletin.class));
        //            break;
        //          default:
        //           return;
//
        //    }




        //    default:
        //         return;
//
        //  }
    }

    public void onNothingSelected (AdapterView < ? > parent){
        return;

    }

}



