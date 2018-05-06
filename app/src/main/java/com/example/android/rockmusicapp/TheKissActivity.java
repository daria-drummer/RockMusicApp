package com.example.android.rockmusicapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TheKissActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an arrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Dynasty (1979)", "I was made for lovin' you baby"));
        songs.add(new Song("Lick It Up (1983)", "Lick It Up"));
        songs.add(new Song("Dressed to Kill (1975)", "Rock and Roll All Nite"));
        songs.add(new Song("Creatures of the Night(1982)", "I Love It Loud"));
        songs.add(new Song("Hot in the Shade (1989)", "Forever"));
        songs.add(new Song("Rock and Roll Over (1976)", "Calling Dr. Love"));
        songs.add(new Song("Psycho Circus (1998)", "Psycho Circus"));
        songs.add(new Song("Crazy Nights (1987)", "Turn on the Night"));
        songs.add(new Song("Love Gun (1977)", "Love Gun"));
        songs.add(new Song("Revenge (1992)", "Every Time I Look At You"));

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