package com.example.newyearcard;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;


import static com.example.newyearcard.R.drawable.picture;

public class MainActivity extends Activity {
    ImageButton card;
    int a = 0;

    private AudioPlayer mediaPlayer = new AudioPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card = (ImageButton) findViewById(R.id.card);
        card.setImageResource(picture);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a == 0) {
                    mediaPlayer.play(MainActivity.this);
                    a = 1;
                }else{
                    mediaPlayer.stop();
                    a = 0;
                }
            }
        });

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }
}
