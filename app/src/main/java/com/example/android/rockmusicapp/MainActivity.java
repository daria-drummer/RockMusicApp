package com.example.android.rockmusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the artist logo
        ImageView rollingstones = (ImageView) findViewById(R.id.rollingstones);

        // Set a click listener on that View
        rollingstones.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artist logo is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RollingStonesActivity}
                Intent rollingStonesIntent = new Intent(MainActivity.this, RollingStonesActivity.class);

                // Start the new activity
                startActivity(rollingStonesIntent);
            }
        });

        // Find the View that shows the artist logo
        ImageView theKiss = (ImageView) findViewById(R.id.thekiss);

        // Set a click listener on that View
        theKiss.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artist logo is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TheKissActivity}
                Intent theKissIntent = new Intent(MainActivity.this, TheKissActivity.class);

                // Start the new activity
                startActivity(theKissIntent);
            }
        });

        // Find the View that shows the artist logo
        ImageView gunsAndRoses = (ImageView) findViewById(R.id.gunsandroses);

        // Set a click listener on that View
        gunsAndRoses.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artist logo is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GunsAndRosesActivity}
                Intent gunsAndRosesIntent = new Intent(MainActivity.this, GunsAndRosesActivity.class);

                // Start the new activity
                startActivity(gunsAndRosesIntent);
            }
        });

        // Find the View that shows the artist logo
        ImageView theWho = (ImageView) findViewById(R.id.thewho);

        // Set a click listener on that View
        theWho.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artist logo is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GunsAndRosesActivity}
                Intent theWhoIntent = new Intent(MainActivity.this, TheWhoActivity.class);

                // Start the new activity
                startActivity(theWhoIntent);
            }
        });

        // Find the View that shows the artist logo
        ImageView acdc = (ImageView) findViewById(R.id.acdc);

        // Set a click listener on that View
        acdc.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artist logo is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GunsAndRosesActivity}
                Intent acdcIntent = new Intent(MainActivity.this, AcDcActivity.class);

                // Start the new activity
                startActivity(acdcIntent);
            }
        });

        // Find the View that shows the artist logo
        ImageView vanHalen = (ImageView) findViewById(R.id.vanhalen);

        // Set a click listener on that View
        vanHalen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artist logo is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GunsAndRosesActivity}
                Intent vanHalenIntent = new Intent(MainActivity.this, VanHalenActivity.class);

                // Start the new activity
                startActivity(vanHalenIntent);
            }
        });



    }
}
