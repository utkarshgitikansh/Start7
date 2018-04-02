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

public class publications extends AppCompatActivity implements OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.publications);

        publications p =new publications();
        String[] items = new String[]{"-- Authors --", "Vishal Nath", "Amrendra Kumar", "Gopal Kumar", "Alok Gupta", "SD Pandey", "R. K. Patel", "Narayan Lal", "Swati Sharma", "Rajesh Kumar", "Kuldeep Srivastava", "Sanjay Kumar Singh", "E.S. Morboh", "S. K. Purbey", "Vinod Kumar", "Alemwati Pongener"};
        String[] items2 = new String[]{"-- Bulletins --", "Technical Bulletins"};
        String[] items3 = new String[]{"-- Folder items --", "लीची को नाशीकीटों एवं रोगों से बचाएँ","लीची के फलों को फल बेधक कीट के प्रकोप से बचाएँ","NRCL at a glance","Managing fruit borers of litchi","एनआरसीएल ट्राईकोडर्माः एक उत्कृष्ट कवकनाशी एवं जैवउर्वरक"};
        String[] items4 = new String[]{"-- Books --", "Books"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        final Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        final Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);

        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
        spinner4.setAdapter(adapter4);

       // spinner.setOnItemSelectedListener(publications.this);

        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        startActivity(new Intent(publications.this, bulletin.class));
                        break;
//
                }
                spinner2.setSelection(0);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/extension-folder/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%95%E0%A5%8B-%E0%A4%A8%E0%A4%BE%E0%A4%B6%E0%A5%80%E0%A4%95%E0%A5%80%E0%A4%9F%E0%A5%8B%E0%A4%82-%E0%A4%8F%E0%A4%B5%E0%A4%82-%E0%A4%B0%E0%A5%8B%E0%A4%97%E0%A5%8B%E0%A4%82-%E0%A4%B8%E0%A5%87-%E0%A4%AC%E0%A4%9A%E0%A4%BE%E0%A4%8F%E0%A4%81.pdf"));
                        startActivity(i);
                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/extension-folder/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%95%E0%A5%87-%E0%A4%AB%E0%A4%B2%E0%A5%8B%E0%A4%82-%E0%A4%95%E0%A5%8B-%E0%A4%AB%E0%A4%B2-%E0%A4%AC%E0%A5%87%E0%A4%A7%E0%A4%95-%E0%A4%95%E0%A5%80%E0%A4%9F-%E0%A4%95%E0%A5%87-%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%95%E0%A5%8B%E0%A4%AA-%E0%A4%B8%E0%A5%87-%E0%A4%AC%E0%A4%9A%E0%A4%BE%E0%A4%8F%E0%A4%81-.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/download/NRCL-at-a-Glance.pdf"));
                        startActivity(i3);
                        break;

                    case 4:
                        Intent i4 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/extension-folder/managing-fruit-borers-of-litchi.pdf"));
                        startActivity(i4);
                        break;

                    case 5:
                        Intent i5 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/extension-folder/%E0%A4%8F%E0%A4%A8%E0%A4%86%E0%A4%B0%E0%A4%B8%E0%A5%80%E0%A4%8F%E0%A4%B2-%E0%A4%9F%E0%A5%8D%E0%A4%B0%E0%A4%BE-%E0%A4%95%E0%A5%8B%E0%A4%A1%E0%A4%B0%E0%A5%8D%E0%A4%AE%E0%A4%BE-%E0%A4%8F%E0%A4%95-%E0%A4%89%E0%A4%A4%E0%A5%8D%E0%A4%95%E0%A5%83%E0%A4%B7%E0%A5%8D%E0%A4%9F-%E0%A4%95%E0%A4%B5%E0%A4%95%E0%A4%A8%E0%A4%BE%E0%A4%B6%E0%A5%80-%E0%A4%8F%E0%A4%B5%E0%A4%82-%E0%A4%9C%E0%A5%88%E0%A4%B5%E0%A4%89%E0%A4%B0%E0%A5%8D%E0%A4%B5%E0%A4%B0%E0%A4%95.pdf"));
                        startActivity(i5);
                        break;


//
                }
                spinner3.setSelection(0);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        spinner4.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        startActivity(new Intent(publications.this, books.class));
                        break;

//
                }
                spinner4.setSelection(0);


            }

            public void onNothingSelected(AdapterView<?> parent) {

            }


        });



        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 1:

                        startActivity(new Intent(publications.this, vishal_nath.class));

                        break;

                    case 2:
                        startActivity(new Intent(publications.this, amrendra.class));
                        break;
                    case 3:
                        startActivity(new Intent(publications.this, gopal.class));
                        break;
                    case 4:
                        startActivity(new Intent(publications.this, alok.class));
                        break;
                    case 5:
                        startActivity(new Intent(publications.this, pandey.class));
                        break;
                    case 6:
                        startActivity(new Intent(publications.this, patel.class));
                        break;
                    case 7:
                        startActivity(new Intent(publications.this, narayan.class));
                        break;
                    case 8:
                        startActivity(new Intent(publications.this, swati.class));
                        break;
                    case 9:
                        startActivity(new Intent(publications.this, rajesh.class));
                        break;
                    case 10:
                        startActivity(new Intent(publications.this, kuldeep.class));
                        break;
                    case 11:
                        startActivity(new Intent(publications.this, sanjay.class));
                        break;
                    case 12:
                        startActivity(new Intent(publications.this, morboh.class));
                        break;
                    case 13:
                        startActivity(new Intent(publications.this, purbey.class));
                        break;
                    case 14:
                        startActivity(new Intent(publications.this, vinod.class));

                        break;

                    case 15:
                        startActivity(new Intent(publications.this, alemwati.class));
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


       }




       }

