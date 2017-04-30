package com.example.mrpeny.simplespotimusicalstructure.onclicklisteners;

import android.content.Intent;
import android.view.View;

import com.example.mrpeny.simplespotimusicalstructure.MyMusicActivity;
import com.example.mrpeny.simplespotimusicalstructure.NowPlayingActivity;

/**
 * Created by MrPeny on 2017. 04. 30..
 */

public class MyMusicClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent myMusicIntent = new Intent(v.getContext(), MyMusicActivity.class);
        v.getContext().startActivity(myMusicIntent);
    }
}
