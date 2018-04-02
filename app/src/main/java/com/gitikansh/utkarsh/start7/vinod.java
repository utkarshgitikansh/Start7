package com.gitikansh.utkarsh.start7;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class vinod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vinod);

        String[] items = new String[]{"--Research papers by Vinod Kumar--", "Book 1", "Book 2", "Book 3", "Book 4", "Book 5", "Book 6", "Book 7", "Book 8", "Book 9", "Book 10", "Book 11", "Book 12", "Book 13", "Book 14", "Book 15", "Book 16", "Book 17", "Book 18", "Book 19", "Book 20", "Book 21", "Book 22", "Book 23", "Book 24"};

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
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/1-effect-of-cyperus-rotundus-rhizome-extract-on-fusarium-udum.pdf"));
                        startActivity(i);

                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/2-virulence-of-entomopathogenic-fungi-Beauveria-bassiana.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/3-mycotoxin-review.pdf"));
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/4-dynamics-of-soil-population-of-a-flavus.pdf"));
                        startActivity(i4);

                        break;

                    case 5:
                        Intent i5 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/5-nrch-148-paper.pdf"));
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/6-on-farm-evaluation_aflatoxin.pdf"));
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/7-interspecific-derivatives-for-widening-the-genetic-base-of-groundnut.pdf"));
                        startActivity(i7);

                        break;

                    case 8:
                        Intent i8 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/8-colour-sorting.pdf"));
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/9-salinity-paper.pdf"));
                        startActivity(i9);
                        break;
                    case 10:
                        Intent i10 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/10-emerging-pests-and-diseases-of-litchi.pdf"));
                        startActivity(i10);

                        break;

                    case 11:
                        Intent i11 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/11-evaluating-potting-media-for-litchi.pdf"));
                        startActivity(i11);
                        break;
                    case 12:
                        Intent i12 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/12-occurrence-of-alternaria-leaf-blight-of-groundnut.pdf"));
                        startActivity(i12);
                        break;
                    case 13:
                        Intent i13 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/13-stem-rot-paper.pdf"));
                        startActivity(i13);

                        break;

                    case 14:
                        Intent i14 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/14-thallasodes-pilaria-paper.pdf"));
                        startActivity(i14);
                        break;
                    case 15:
                        Intent i15 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/15-outbreak-of-perixera-illepidaria-on-litchi.pdf"));
                        startActivity(i15);
                        break;
                    case 16:
                        Intent i16 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/16-prevalence-of-some-threatening-pests-and-diseases-of-litchi.pdf"));
                        startActivity(i16);

                        break;

                    case 17:
                        Intent i17 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/17-pollinators-of-litchi.pdf"));
                        startActivity(i17);
                        break;
                    case 18:
                        Intent i18 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/18-moprhological-and-toxigeneic-variability-in-the-aspergillus-flavus.pdf"));
                        startActivity(i18);
                        break;
                    case 19:
                        Intent i19 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/19-molecular-characterisation-of-aspergillus-flavus-using-aflp.pdf"));
                        startActivity(i19);

                        break;

                    case 20:
                        Intent i20 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/20-abstract-management-of-soil-borne-diseases.pdf"));
                        startActivity(i20);
                        break;
                    case 21:
                        Intent i21 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/21-mycorrhiza-full-paper.pdf"));
                        startActivity(i21);
                        break;
                    case 22:
                        Intent i22 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/22-abstract-losses-in-litchi.pdf"));
                        startActivity(i22);
                        break;
                    case 23:
                        Intent i23 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/23.-Physiological-disorders.pdf"));
                        startActivity(i23);
                        break;
                    case 24:
                        Intent i24 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org//uploads/research-papers/Vinod-Kumar/24.-Effect-of-fructoplane-antagonists-on-fruit-rots.pdf"));
                        startActivity(i24);
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
