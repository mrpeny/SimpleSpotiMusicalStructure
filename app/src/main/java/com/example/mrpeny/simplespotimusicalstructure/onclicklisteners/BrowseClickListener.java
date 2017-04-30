package com.example.mrpeny.simplespotimusicalstructure.onclicklisteners;

import android.content.Intent;
import android.view.View;

import com.example.mrpeny.simplespotimusicalstructure.BrowseActivity;
import com.example.mrpeny.simplespotimusicalstructure.NowPlayingActivity;

/**
 * Created by MrPeny on 2017. 04. 30..
 */

public class BrowseClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent browseIntent = new Intent(v.getContext(), BrowseActivity.class);
        v.getContext().startActivity(browseIntent);
    }
}
