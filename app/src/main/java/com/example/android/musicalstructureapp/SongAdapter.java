package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Song object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID songs
        TextView song = listItemView.findViewById(R.id.song);

        // Get the Song Title from the current Song object and
        // set this text on the Song Title TextView
        song.setText(currentSong.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID artist
        TextView artist = listItemView.findViewById(R.id.artist);
        // Get the Song Artist from the current Song object and
        // set this text on the Song Artist TextView
        artist.setText(currentSong.getSongArtist());

        // Find the TextView in the list_item.xml layout with the ID songs
        TextView album = listItemView.findViewById(R.id.album);
        // Get the Song Album from the current Song object and
        // set this text on the Song Album TextView
        album.setText(currentSong.getSongAlbum());

        // Find the TextView in the list_item.xml layout with the ID songs
        TextView genre = listItemView.findViewById(R.id.genre);
        // Get the Song Genre from the current Song object and
        // set this text on the Song Genre TextView
        genre.setText(currentSong.getSongGenre());

        // Return the whole list item layout (containing 4 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
