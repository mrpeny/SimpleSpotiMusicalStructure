package com.example.mrpeny.simplespotimusicalstructure.onclicklisteners;

import android.content.Intent;
import android.view.View;

import com.example.mrpeny.simplespotimusicalstructure.NowPlayingActivity;
import com.example.mrpeny.simplespotimusicalstructure.SearchActivity;

/**
 * Created by MrPeny on 2017. 04. 30..
 */

public class SearchClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent searchIntent = new Intent(v.getContext(), SearchActivity.class);
        v.getContext().startActivity(searchIntent);
    }
}
