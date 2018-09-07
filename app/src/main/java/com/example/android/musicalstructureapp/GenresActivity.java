package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GenresActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ButterKnife.bind(this);
        list.setBackgroundColor(getResources().getColor(R.color.genres_background));

        // Create an array of genres and number of songs in the album
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.genre_one), (getString(R.string.two_songs))));
        songs.add(new Song(getString(R.string.genre_two), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.genre_three), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.genre_four), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.genre_five), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.genre_six), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.genre_seven), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.genre_eight), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.genre_nine), (getString(R.string.one_song))));

        SongAdapter adapter =
                new SongAdapter(this, songs);
        list.setAdapter(adapter);
    }
}