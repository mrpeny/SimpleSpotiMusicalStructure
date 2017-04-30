package com.example.mrpeny.simplespotimusicalstructure.onclicklisteners;

import android.content.Intent;
import android.view.View;

import com.example.mrpeny.simplespotimusicalstructure.NowPlayingActivity;

/**
 * Created by MrPeny on 2017. 04. 30..
 */

public class NowPlayingClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent nowPlayingIntent = new Intent(v.getContext(), NowPlayingActivity.class);
        v.getContext().startActivity(nowPlayingIntent);
    }
}
