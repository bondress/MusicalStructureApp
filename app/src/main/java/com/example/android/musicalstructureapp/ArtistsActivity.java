package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtistsActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ButterKnife.bind(this);
        list.setBackgroundColor(getResources().getColor(R.color.artists_background));

        // Create an array of artists and number of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.artist_one), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.artist_two), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.artist_three), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.artist_four), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.artist_five), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.artist_six), (getString(R.string.two_songs))));
        songs.add(new Song(getString(R.string.artist_seven), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.artist_eight), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.artist_nine), (getString(R.string.one_song))));

        SongAdapter adapter =
                new SongAdapter(this, songs);
        list.setAdapter(adapter);
    }
}
