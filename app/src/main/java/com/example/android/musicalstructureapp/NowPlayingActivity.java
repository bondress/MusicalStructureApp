package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NowPlayingActivity extends AppCompatActivity {

    @BindView(R.id.play)
    ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        ButterKnife.bind(this);

        /* Set an onClickListener on the play ImageView
         * There is no music in this version so the image will just change to pause*/
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play.setImageResource(R.drawable.pause_icon);
                Toast.makeText(NowPlayingActivity.this, R.string.now_playing_message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}