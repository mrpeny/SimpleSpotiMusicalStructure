package com.example.mrpeny.simplespotimusicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.MyMusicClickListener;
import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.NowPlayingClickListener;
import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.SearchClickListener;

/**
 * Created by MrPeny on 2017. 04. 30..
 */

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        Button myMusicButton = (Button) findViewById(R.id.my_music_button);
        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);
        Button searchButton = (Button) findViewById(R.id.search_button);

        myMusicButton.setOnClickListener(new MyMusicClickListener());
        nowPlayingButton.setOnClickListener(new NowPlayingClickListener());
        searchButton.setOnClickListener(new SearchClickListener());
    }
}