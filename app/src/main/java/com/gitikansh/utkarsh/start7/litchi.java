package com.gitikansh.utkarsh.start7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class litchi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.litchi);


        final TextView text1 = (TextView) findViewById(R.id.fruit_wiki);
        final TextView text2 = (TextView) findViewById(R.id.fruit_video);
        final TextView text3 = (TextView) findViewById(R.id.fruit_stats);

        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/Lychee"));
                startActivity(i);

            }
        });

        text2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=PiImqgrg1AU"));
                startActivity(i);

            }
        });

        text3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.fao.org/docrep/005/ac684e/ac684e08.htm"));
                startActivity(i);

            }
        });

    }


}