package com.gitikansh.utkarsh.start7;

import android.app.ActionBar;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import java.util.ArrayList;
import android.os.Handler;
import android.support.v4.view.ViewPager;

import android.widget.Spinner;
import android.widget.TextView;
import android.content.DialogInterface;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;

import me.relex.circleindicator.CircleIndicator;



public class Main2Activity extends AppCompatActivity {


    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] ugSlider = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide4, R.drawable.slide5, R.drawable.slide6, R.drawable.slide7, R.drawable.slide8, R.drawable.slide9, R.drawable.slide10, R.drawable.slide11};
    private ArrayList<Integer> ugArray = new ArrayList<Integer>();
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    DrawerLayout drawer;
    ActionBarDrawerToggle action;
    boolean isInitialized = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        final TextView text = (TextView) findViewById(R.id.text1);
        final TextView text2 = (TextView) findViewById(R.id.text2);
        final TextView click1 = (TextView) findViewById(R.id.event_2);
        final TextView click2 = (TextView) findViewById(R.id.event_3);
        final TextView click3 = (TextView) findViewById(R.id.event_4);
        final TextView click4 = (TextView) findViewById(R.id.event_5);
        final TextView click5 = (TextView) findViewById(R.id.event_6);
        final TextView click6 = (TextView) findViewById(R.id.event_7);
        final TextView click7 = (TextView) findViewById(R.id.event_8);
        final TextView click8 = (TextView) findViewById(R.id.event_9);
        final TextView click9 = (TextView) findViewById(R.id.event_10);
        final TextView click10 = (TextView) findViewById(R.id.event_11);
        final TextView click11 = (TextView) findViewById(R.id.event_12);
        final TextView click12 = (TextView) findViewById(R.id.event_1);



        final TextView click22 = (TextView) findViewById(R.id.event_22);
        final TextView click23 = (TextView) findViewById(R.id.event_23);
        final TextView click24 = (TextView) findViewById(R.id.event_24);



        String[] items = {"ABOUT US", "STAFF", "RESEARCH PROJECTS", "RESEARCH ACHIEVEMENTS", "PUBLICATIONS", "RECRUITMENTS", "TENDERS", "CONTACT US"};
        String[] items2 = new String[]{"-- Articles --", "स्वास्थ्य और सेहत भरी लीची","ट्राइकोडर्मा-कृषि के लिए एक बहुपयोगी सूक्ष्मजी","लीची और आम में कीट एवं रोग प्रबंधन","गुणवत्तायुक्त लीची का जैविक उत्पादन"};
        String[] items3 = new String[]{"-- Stories --", "एनआरसीएल ट्राइकोडर्मा – एक उत्कृष्ट कवकनाशी एवं जैव उर्वरक के सफलता की कहानी"};
        String[] items4 = new String[]{"-- Major Pests diagnosis--", "Diagnosis of major pests of litchi"};
        //List Items from array
        ListAdapter ugAdapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_activated_1, items);
        ListView ugListView = findViewById(R.id.ugListView);
        ugListView.setAdapter(ugAdapter);


        drawer = (DrawerLayout) findViewById(R.id.ug_drawer_layout);
        action = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        spinner1.setAdapter(adapter3);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner3);
        spinner2.setAdapter(adapter4);

        ugListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {


                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //String items = String.valueOf(parent.getItemAtPosition(position));

                        switch (position) {
                            //case 0:
                             //   startActivity(new Intent(Main2Activity.this, home.class));
                             //   break;
                            case 0:
                                startActivity(new Intent(Main2Activity.this, read_more2.class));
                                break;
                            case 1:
                                startActivity(new Intent(Main2Activity.this, staff.class));
                                break;
                            case 2:
                                startActivity(new Intent(Main2Activity.this, projects.class));
                                break;
                            case 3:
                                startActivity(new Intent(Main2Activity.this, achievements.class));
                                break;
                            case 4:
                                startActivity(new Intent(Main2Activity.this, publications.class));
                                break;
                            case 5:
                                startActivity(new Intent(Main2Activity.this, recruit.class));
                                break;
                            case 6:
                                startActivity(new Intent(Main2Activity.this, tenders.class));
                                break;
                            case 7:
                                startActivity(new Intent(Main2Activity.this, contact_us.class));
                                break;
                            default:
                                return;
                        }
                        drawer.closeDrawers();
                    }

                }

        );

        text.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, read_more.class));

            }
        });

        text2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, read_more2.class));

            }
        });

        drawer.addDrawerListener(action);

        NavigationView n = (NavigationView) findViewById(R.id.navigate);
        n.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                }
                drawer.closeDrawers();  // CLOSE DRAWER
                return true;
            }
        });

        click1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/ICAR-NRCL-ISO-certificate.pdf"));
                startActivity(i);
            }
        });

        click2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, read_more2.class));
            }
        });

        click3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, home_organo.class));
            }
        });

        click4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, infrastructure.class));
            }
        });

        click5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, governance.class));
            }
        });

        click6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, projects.class));
            }
        });

        click7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/Technology-Developed.pdf"));
                startActivity(i);
            }
        });

        click8.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, annual_report.class));
            }
        });

        click9.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Main2Activity.this, achievements.class));
            }
        });

        click10.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/vision-2030_NRCL.pdf"));
                startActivity(i);
            }
        });
        click11.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/nrcl_vision-2050.pdf"));
                startActivity(i);
            }
        });

        click12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/events/brochure-on-winter-school-at-nrcl.pdf"));
                startActivity(i);
            }
        });

        click22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/farmers-advisory/Advisory-on-management-of-fruit-borers-of-litchi-English-1.pdf"));
                startActivity(i);
            }
        });
        click23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/farmers-advisory/Advisory-on-management-of-fruit-borers-of-litchi-Hindi-1.pdf"));
                startActivity(i);
            }
        });
        click24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nrclitchi.org/uploads/farmers-advisory/Likely-%20attack-of-Loopers-in-litchi.pdf"));
                startActivity(i);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 1:

                        Intent i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/popular-articles/%E0%A4%B8%E0%A5%8D%E0%A4%B5%E0%A4%BE%E0%A4%B8%E0%A5%8D%E0%A4%A5%E0%A5%8D%E0%A4%AF-%E0%A4%94%E0%A4%B0-%E0%A4%B8%E0%A5%87%E0%A4%B9%E0%A4%A4-%E0%A4%AD%E0%A4%B0%E0%A5%80-%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80.pdf"));
                        startActivity(i);

                        break;

                    case 2:
                        Intent i2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/popular-articles/%E0%A4%9F%E0%A5%8D%E0%A4%B0%E0%A4%BE%E0%A4%87%E0%A4%95%E0%A5%8B%E0%A4%A1%E0%A4%B0%E0%A5%8D%E0%A4%AE%E0%A4%BE-%E0%A4%95%E0%A5%83%E0%A4%B7%E0%A4%BF-%E0%A4%95%E0%A5%87-%E0%A4%B2%E0%A4%BF%E0%A4%8F-%E0%A4%8F%E0%A4%95-%E0%A4%AC%E0%A4%B9%E0%A5%81%E0%A4%AA%E0%A4%AF%E0%A5%8B%E0%A4%97%E0%A5%80-%E0%A4%B8%E0%A5%82%E0%A4%95%E0%A5%8D%E0%A4%B7%E0%A5%8D%E0%A4%AE%E0%A4%9C%E0%A5%80%E0%A4%B5.pdf"));
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/popular-articles/%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%94%E0%A4%B0-%E0%A4%86%E0%A4%AE-%E0%A4%AE%E0%A5%87%E0%A4%82-%E0%A4%95%E0%A5%80%E0%A4%9F-%E0%A4%8F%E0%A4%B5%E0%A4%82-%E0%A4%B0%E0%A5%8B%E0%A4%97-%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%AC%E0%A4%82%E0%A4%A7%E0%A4%A8.pdf"));
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/popular-articles/%E0%A4%97%E0%A5%81%E0%A4%A3%E0%A4%B5%E0%A4%A4%E0%A5%8D%E0%A4%A4%E0%A4%BE%E0%A4%AF%E0%A5%81%E0%A4%95%E0%A5%8D%E0%A4%A4-%E0%A4%B2%E0%A5%80%E0%A4%9A%E0%A5%80-%E0%A4%95%E0%A4%BE-%E0%A4%9C%E0%A5%88%E0%A4%B5%E0%A4%BF%E0%A4%95-%E0%A4%89%E0%A4%A4%E0%A5%8D%E0%A4%AA%E0%A4%BE%E0%A4%A6%E0%A4%A8.pdf"));
                        startActivity(i4);
                        break;

                }
                spinner.setSelection(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 1:

                        Intent i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nrclitchi.org/uploads/success-stories/%E0%A4%8F%E0%A4%A8%E0%A4%86%E0%A4%B0%E0%A4%B8%E0%A5%80%E0%A4%8F%E0%A4%B2-%E0%A4%9F%E0%A5%8D%E0%A4%B0%E0%A4%BE%E0%A4%87%E0%A4%95%E0%A5%8B%E0%A4%A1%E0%A4%B0%E0%A5%8D%E0%A4%AE%E0%A4%BE%E2%80%93%E0%A4%8F%E0%A4%95-%E0%A4%89%E0%A4%A4%E0%A5%8D%E0%A4%95%E0%A5%83%E0%A4%B7%E0%A5%8D%E0%A4%9F-%E0%A4%95%E0%A4%B5%E0%A4%95%E0%A4%A8%E0%A4%BE%E0%A4%B6%E0%A5%80-%E0%A4%8F%E0%A4%B5%E0%A4%82-%E0%A4%9C%E0%A5%88%E0%A4%B5-%E0%A4%89%E0%A4%B0%E0%A5%8D%E0%A4%B5%E0%A4%B0%E0%A4%95-%E0%A4%95%E0%A5%87-%E0%A4%B8%E0%A4%AB%E0%A4%B2%E0%A4%A4%E0%A4%BE-%E0%A4%95%E0%A5%80-%E0%A4%95%E0%A4%B9%E0%A4%BE%E0%A4%A8%E0%A5%80.pdf"));
                        startActivity(i);

                        break;


                }
                spinner1.setSelection(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 1:

                        startActivity(new Intent(Main2Activity.this, pests.class));
                        break;


                }
                spinner2.setSelection(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle
        // If it returns true, then it has handled
        // the nav drawer indicator        touch event
        if (action.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
            case R.id.litchi:
                startActivity(new Intent(Main2Activity.this, litchi.class));
                break;
            case R.id.notice:
                startActivity(new Intent(Main2Activity.this, notice.class));
                break;
            case R.id.news:
                startActivity(new Intent(Main2Activity.this, news.class));
                break;
            case R.id.tender:
                startActivity(new Intent(Main2Activity.this, tenders.class));
                break;
            case R.id.recruit:
                startActivity(new Intent(Main2Activity.this, recruit.class));
                break;
        }
        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        action.syncState();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        action.onConfigurationChanged(newConfig);
    }


    private void init() {
        if (!isInitialized) {
            for (int i = 0; i < ugSlider.length; i++)
                ugArray.add(ugSlider[i]);

            mPager = (ViewPager) findViewById(R.id.pager);
            mPager.setAdapter(new MyAdapter(Main2Activity.this, ugArray));
            CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
            indicator.setViewPager(mPager);

            // Auto start of viewpager
            final Handler handler = new Handler();
            final Runnable Update = new Runnable() {
                public void run() {
                    if (currentPage == ugSlider.length) {
                        currentPage = 0;
                    }
                    mPager.setCurrentItem(currentPage++, true);
                }
            };
            // Timer swipeTimer = new Timer();
            // swipeTimer.schedule(new TimerTask() {
            //    @Override
            //   public void run() {
            //       handler.post(Update);
            //   }
            // }, 1500, 1500);
            // }
            //  isInitialized = true;
        }

    }

    @Override
    public void onBackPressed () {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Main2Activity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

}
