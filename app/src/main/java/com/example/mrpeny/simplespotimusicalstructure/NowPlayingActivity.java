package com.example.mrpeny.simplespotimusicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.BrowseClickListener;
import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.MyMusicClickListener;
import com.example.mrpeny.simplespotimusicalstructure.onclicklisteners.SearchClickListener;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find Buttons to different Activities
        Button browseButton = (Button) findViewById(R.id.browse_button);
        Button myMusicButton = (Button) findViewById(R.id.my_music_button);
        Button searchButton = (Button) findViewById(R.id.search_button);

        //Set onClickListeners of the navigation button
        browseButton.setOnClickListener(new BrowseClickListener());
        myMusicButton.setOnClickListener(new MyMusicClickListener());
        searchButton.setOnClickListener(new SearchClickListener());
    }
}
