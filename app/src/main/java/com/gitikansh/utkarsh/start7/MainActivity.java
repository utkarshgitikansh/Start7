package com.gitikansh.utkarsh.start7;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.app.AlertDialog;

import java.util.ArrayList;

import android.support.v4.view.ViewPager;
import java.util.Timer;
import java.util.TimerTask;

import android.content.DialogInterface;


public class MainActivity extends Activity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] ugSlider = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide4, R.drawable.slide5, R.drawable.slide6, R.drawable.slide7, R.drawable.slide8, R.drawable.slide9, R.drawable.slide10, R.drawable.slide11};
    private ArrayList<Integer> ugArray = new ArrayList<Integer>();

    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CharSequence text_toast = "Welcome...";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text_toast, duration);
        toast.show();


        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                MainActivity.this.finish();
            }
        }, 2000);

        // @Override

        //    b = (Button) findViewById(R.id.button_1);

        //    b.setOnClickListener(new View.OnClickListener() {
          //      public void onClick(View v) {
           //         startActivity(new Intent(MainActivity.this, Main2Activity.class));
           //         MainActivity.this.finish();
           //     }
         //   });

    };
    /*   private void init() {
        for (int i = 0; i < ugSlider.length; i++)
            ugArray.add(ugSlider[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(MainActivity.this, ugArray));
        //CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
       // indicator.setViewPager(mPager);

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
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 1500, 1500);

        */
    @Override
    public void onBackPressed () {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }



}


/* android_main

<ImageView
        android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/litchi"/>


<TextView
        android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/main_1"
                android:layout_marginTop="250dp"
                android:layout_centerHorizontal="true"

                android:textColor="@color/white"
                android:id="@+id/textView"
                />

<Button
        android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:id="@+id/button_1"
                android:layout_marginTop="410dp"
                android:text="CONTINUE"
                android:layout_centerHorizontal="true"
                android:background="#198a7f"
                android:textColor="@color/white"/>



*/