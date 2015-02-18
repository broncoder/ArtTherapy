package com.example.matthewjin.arttherapy;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;

/**
 * Created by MatthewJin on 2/17/15.
 */
public class PlayEffect extends IntentService {
    public PlayEffect() {
        super("ERASE");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.eraser);
        mediaPlayer.start();
    }

}
