package com.example.android.rockmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GunsAndRosesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an arrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Days of Thunder (1990)", "Knockin' on Heaven's Door"));
        songs.add(new Song("Appetite for Destruction (1987)", "Paradise City"));
        songs.add(new Song("Use Your Illusion II (1991)", "Get in the Ring"));
        songs.add(new Song("Appetite for Destruction (1987)", "Welcome to the Jungle"));
        songs.add(new Song("Use Your Illusion II (1991)", "You Could Be Mine"));
        songs.add(new Song("G N’ R Lies (1988)", "Used to Love Her"));
        songs.add(new Song("Appetite for Destruction (1987)", "Nightrain"));
        songs.add(new Song("Use Your Illusion II (1991)", "Estranged"));
        songs.add(new Song("Appetite for Destruction (1987)", "My Michelle"));
        songs.add(new Song("Chinese Democracy (2008)", "Better"));

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