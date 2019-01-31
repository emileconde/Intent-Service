package com.example.android.conde.com.musicmachine;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class DownLoadIntentService extends IntentService {

    public DownLoadIntentService() {
        super("DownloadIntentService");
        setIntentRedelivery(true);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String song = intent.getStringExtra(MainActivity.KEY_SONG);
        downloadSong(song);
    }

    private void downloadSong(String song) {
        long endTime = System.currentTimeMillis() + 10 * 1000;
        while (System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d(MainActivity.TAG, song + " downloaded ");
    }
}
