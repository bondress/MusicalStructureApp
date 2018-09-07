package com.example.android.musicalstructureapp;

/**
 * Contains the default Song objects and methods
 */
public class Song {

    /**
     * Song Title
     */
    private String mSongTitle;

    /**
     * Song Artist
     */
    private String mSongArtist;

    /**
     * Song Album
     */
    private String mSongAlbum;

    /**
     * Song Genre
     */
    private String mSongGenre;

    /**
     * Create a new Song object that takes two strings
     * Instance 1: Song Title and Song Artist
     * Instance 2: Song Artist and Number of Songs by the Artist
     * Instance 3: Album Title and Number of Songs in the Album
     */
    public Song(String songTitle, String songArtist) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
    }

    /**
     * Create a new Song object that takes four strings
     * For NowPlaying Screen
     */
    public Song(String songTitle, String songArtist,
                String songAlbum, String songGenre) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mSongAlbum = songAlbum;
        mSongGenre = songGenre;
    }


    /**
     * Get the Song Title
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the Song Artist
     */
    public String getSongArtist() {
        return mSongArtist;
    }

    /**
     * Get the Song Album
     */
    public String getSongAlbum() {
        return mSongAlbum;
    }

    /**
     * Get the Song Genre
     */
    public String getSongGenre() {
        return mSongGenre;
    }
}
