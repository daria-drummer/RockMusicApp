package com.example.android.rockmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AcDcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an arrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Back In Black (1990)", "Back In Black"));
        songs.add(new Song("Highway to Hell(1979)", "Highway to Hell"));
        songs.add(new Song("Back In Black (1980)", "Hell's bells"));
        songs.add(new Song("The Razor's Edge (1990)", "Thunderstruck"));
        songs.add(new Song("Black Ice (2008)", "Rock 'n' Roll Train"));
        songs.add(new Song("Rock or Bust (2014)", "Rock or Bust"));
        songs.add(new Song("Ballbreaker (1995)", "Hard as a Rock"));
        songs.add(new Song("Back In Black (1980)", "Have A Drink On Me"));
        songs.add(new Song("Stiff Upper Lip (2000)", "Safe In New York City"));
        songs.add(new Song("The Razor’s Edge (1990)", "Are You Ready"));

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