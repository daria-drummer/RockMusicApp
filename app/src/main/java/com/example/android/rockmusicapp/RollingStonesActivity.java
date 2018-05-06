package com.example.android.rockmusicapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RollingStonesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an arrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Aftermath (1966)", "Paint It Black"));
        songs.add(new Song("Sticky Fingers (1971)", "Wild Horses"));
        songs.add(new Song("Out of Our Heads (1965)", "Satisfaction"));
        songs.add(new Song("Sticky Fingers (1971)", "Brown Sugar"));
        songs.add(new Song("It’s Only Rock ’n’ Roll (1974)", "It’s Only Rock ’n’ Roll"));
        songs.add(new Song("Hyde Park Live (2013)", "Doom And Gloom"));
        songs.add(new Song("Tattoo You (1981)", "Start Me Up"));
        songs.add(new Song("Live'r Than You'll Ever Be (1969)", "Honky tonk women"));
        songs.add(new Song("Let It Bleed (1969)", "Midnight Rambler"));
        songs.add(new Song("Their Satanic Majesties Request (1967)", "She's a rainbow"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sord} in the list.
        listView.setAdapter(adapter);
    }
}
