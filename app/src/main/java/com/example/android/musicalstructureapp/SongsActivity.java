package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SongsActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ButterKnife.bind(this);
        list.setBackgroundColor(getResources().getColor(R.color.songs_background));

        // Create an array of songs and artists
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.song_one), getString(R.string.artist_one), getString(R.string.album_one), getString(R.string.genre_one)));
        songs.add(new Song(getString(R.string.song_two), getString(R.string.artist_two), getString(R.string.album_two), getString(R.string.genre_two)));
        songs.add(new Song(getString(R.string.song_three), getString(R.string.artist_three), getString(R.string.album_three), getString(R.string.genre_three)));
        songs.add(new Song(getString(R.string.song_four), getString(R.string.artist_four), getString(R.string.album_four), getString(R.string.genre_four)));
        songs.add(new Song(getString(R.string.song_five), getString(R.string.artist_five), getString(R.string.album_five), getString(R.string.genre_five)));
        songs.add(new Song(getString(R.string.song_six), getString(R.string.artist_six), getString(R.string.album_six), getString(R.string.genre_six)));
        songs.add(new Song(getString(R.string.song_seven), getString(R.string.artist_seven), getString(R.string.album_seven), getString(R.string.genre_seven)));
        songs.add(new Song(getString(R.string.song_eight), getString(R.string.artist_six), getString(R.string.album_eight), getString(R.string.genre_eight)));
        songs.add(new Song(getString(R.string.song_nine), getString(R.string.artist_eight), getString(R.string.album_nine), getString(R.string.genre_one)));
        songs.add(new Song(getString(R.string.song_ten), getString(R.string.artist_nine), getString(R.string.album_ten), getString(R.string.genre_nine)));

        SongAdapter adapter =
                new SongAdapter(this, songs);
        list.setAdapter(adapter);
    }
}