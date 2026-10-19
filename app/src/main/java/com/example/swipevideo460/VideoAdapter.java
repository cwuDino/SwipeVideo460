package com.example.swipevideo460;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoAdapter {
    static class VideoViewHolder extends RecyclerView.ViewHolder{
        TextView textVideoTitle1, textVideoDescription1;
        VideoView videoView;

        ProgressBar progressBar;
    public VideoViewHolder(@NonNull View itemView){
        super(itemView);
        videoView = itemView.findViewById(R.id.videoView);
        textVideoTitle1 = itemView.findViewById(R.id.textVideoTitle);
        textVideoDescription1 = itemView.findViewById(R.id.textVideoDescription);



    }
    }

}
