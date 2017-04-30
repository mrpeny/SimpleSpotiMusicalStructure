package com.example.mrpeny.simplespotimusicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.BrowseClickListener;
import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.NowPlayingClickListener;
import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.SearchClickListener;

public class MyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        //Find Buttons to different Activities
        Button browseButton = (Button) findViewById(R.id.browse_button);
        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);
        Button searchButton = (Button) findViewById(R.id.search_button);

        //Set onClickListeners of the navigation button
        browseButton.setOnClickListener(new BrowseClickListener());
        nowPlayingButton.setOnClickListener(new NowPlayingClickListener());
        searchButton.setOnClickListener(new SearchClickListener());
    }
}
