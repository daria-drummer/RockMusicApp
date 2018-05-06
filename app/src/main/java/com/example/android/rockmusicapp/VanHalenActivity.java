package com.example.android.rockmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class VanHalenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an arrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1984 (1984)", "Jump"));
        songs.add(new Song("Van Halen (1978)", "You Really Got Me"));
        songs.add(new Song("1984 (1984)", "Hot for Teacher"));
        songs.add(new Song("Van Halen (1978)", "Ain't Talkin' 'Bout Love"));
        songs.add(new Song("Diver Down (1982)", "Little Guitars"));
        songs.add(new Song("Women and Children First (1980)", "Everybody Wants Some!!"));
        songs.add(new Song("Balance (1995)", "Can't Stop Lovin' You"));
        songs.add(new Song("For Unlawful Carnal Knowledge (1991)", "Poundcake"));
        songs.add(new Song("Twister (1996)", "Humans Being"));
        songs.add(new Song("Van Halen II (1979)", "Beautiful Girls"));

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