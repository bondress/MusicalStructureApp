package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlbumsActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ButterKnife.bind(this);
        list.setBackgroundColor(getResources().getColor(R.color.albums_background));

        // Create an array of albums and number of songs in the album
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.album_one), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_two), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_three), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_four), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_five), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_six), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_seven), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_eight), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_nine), (getString(R.string.one_song))));
        songs.add(new Song(getString(R.string.album_ten), (getString(R.string.one_song))));

        SongAdapter adapter =
                new SongAdapter(this, songs);
        list.setAdapter(adapter);
    }
}