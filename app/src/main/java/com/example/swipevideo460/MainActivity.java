package com.example.swipevideo460;



import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final ViewPager2 videoViewPager = findViewById(R.id.videosViewPager);
        List<VideoItem> videoItemsList = new ArrayList<>();
        VideoItem resonators = new VideoItem();
        resonators.videoURL ="https://github.com/cwuDino/myVideos/raw/refs/heads/main/Same%20deck%20%23yugioh_Zetafit%20Gaming%20-%20Master%20Duel%20Links_Y8kZi_6E_Vw.mp4";
        resonators.videoTitle = "Resonator vs Resonator";
        resonators.videoDescription = "I'm the better master of faster" ;

        VideoItem theClashOfTheGods = new VideoItem();
        theClashOfTheGods.videoURL ="https://github.com/cwuDino/myVideos/raw/refs/heads/main/Who%20Would%20Win%EF%BC%9A%20Exodia%20or%20Obelisk%EF%BC%9F_NerdFainter_qZAtQv0doK0.mp4";
        theClashOfTheGods.videoTitle = "Exodia vs Oblelisk";
        theClashOfTheGods.videoDescription = "Who would win in a fight?" ;

        VideoItem exodiaIsWrath = new VideoItem();
        exodiaIsWrath.videoURL ="https://github.com/cwuDino/myVideos/raw/refs/heads/main/Yugi%20summons%20EXODIA%20%23yugioh%20%23anime%20%23exodia_Prime%20Video%20AU%20&%20NZ_B3JvIftKIjo.mp4";
        exodiaIsWrath.videoTitle = "Exodia";
        exodiaIsWrath.videoDescription = "The unstopable exodia";



        videoItemsList.add(resonators);
        videoItemsList.add(theClashOfTheGods);
        videoItemsList.add(exodiaIsWrath);



        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));
    }
}