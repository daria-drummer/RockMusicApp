package com.example.android.rockmusicapp;


/**
 * {@link Song} represents a song that the user wants to listen.
 * It contains a song name and a albums name.
 */


public class Song {
    /** Album name */
    private String mAlbumName;

    /** SongName */
    private String mSongName;

    /**
     * Create a new Song object.
     *
     * @param albumName
     * @param songName
     */
    public Song(String albumName, String songName) {
        mAlbumName = albumName;
        mSongName = songName;
    }

    /**
     * Get the album name.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the name of the song.
     */
    public String getSongName() {
        return mSongName;
    }




}
