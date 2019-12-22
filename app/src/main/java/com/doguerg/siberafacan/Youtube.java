package com.doguerg.siberafacan;

import android.os.Bundle;
import android.widget.Button;
//Youtube api ile ilgili kütüphaneler
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Youtube extends YouTubeBaseActivity {
    //Youtube'dan gelecek videonun gösterileceği player
    YouTubePlayerView yTPW;
    //Youtube'un başlaması için kullanılacak listener
    YouTubePlayer.OnInitializedListener yOIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layout ayarlanması
        setContentView(R.layout.videoplayer);
        //intentle önceki sayfadan gönderilen verinin alınması
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        final String msg = extras.getString("Msg");

                yTPW = findViewById(R.id.youtubePlay);

        //youtube player başlatıldığında çalışacak
        yOIL = new YouTubePlayer.OnInitializedListener() {
            //başlatma başarılıysa çalışacak. Provider youtube player instance getirir
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //playera videoyu yükler
                youTubePlayer.loadVideo(msg, 0);
            }
            //hata varsa ne çalışacak
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        //play tuşuna basıldığında YouTubePlayerView, YoutubeConfig sayfasına kaydedilmiş api key ile videoyu başlatacak
        yTPW.initialize(YoutubeConfig.getApiKey(), yOIL);
    }
}

