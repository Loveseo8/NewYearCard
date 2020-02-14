package com.example.newyearcard;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;


class AudioPlayer {

    private MediaPlayer mediaPlayer;

    public void play(Context context){
        stop();
        mediaPlayer = MediaPlayer.create(context,R.raw.christmas);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mediaPlayer.start();
    }

    public void stop(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }

    }
}
