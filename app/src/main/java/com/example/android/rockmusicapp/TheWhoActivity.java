package com.example.android.rockmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TheWhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an arrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Who Are You (1978)", "Who Are You"));
        songs.add(new Song("My Generation (1965)", "My Generation"));
        songs.add(new Song("The Kids Are Alright (1971)", "Baba O'Riley"));
        songs.add(new Song("Who’s Next (1971)", "Won't Get Fooled Again"));
        songs.add(new Song("The Kids Are Alright (1979)", "I Can’t Explain"));
        songs.add(new Song("Quadrophenia (1973)", "The Real Me"));
        songs.add(new Song("Tommy (1969)", "I'm Free"));
        songs.add(new Song("American Beauty (1999)", "The Seeker"));
        songs.add(new Song("It's Hard (1982)", "Eminence Front"));
        songs.add(new Song("Join Together (1990)", "Join Together"));

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