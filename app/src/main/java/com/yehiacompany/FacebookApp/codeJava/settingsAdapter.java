package com.yehiacompany.FacebookApp.codeJava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yehiacompany.FacebookApp.R;

import java.util.ArrayList;

public class settingsAdapter extends RecyclerView.Adapter<settingsAdapter.seetingsViewHolder> {

    ArrayList<DataTimeLine> DataLines;

    public settingsAdapter(ArrayList<DataTimeLine> DataLines) {
        this.DataLines = DataLines;
    }


    @NonNull
    @Override
    public seetingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater myinflate = LayoutInflater.from(parent.getContext());
        View view = myinflate.inflate(R.layout.activity_templat_timeline, parent, false);

        return new seetingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull seetingsViewHolder holder, int position) {

        DataTimeLine items = DataLines.get(position);

        holder.profilePictureBig.setImageResource(items.getProfilePictureBig());
        holder.contentPhotoPost.setImageResource(items.getContentPhotoPost());
        holder.profilePhotoSmall.setImageResource(items.getProfilePhotoSmall());
        holder.userName.setText(items.getUserName());
        holder.timePost.setText(items.getTimePost());
        holder.contentTextPost.setText(items.getContentTextPost());


    }

    @Override
    public int getItemCount() {
        if (DataLines == null) {
            return 0;
        } else {
            return DataLines.size();
        }
    }

    class seetingsViewHolder extends RecyclerView.ViewHolder {

        ImageView profilePictureBig;
        ImageView contentPhotoPost;
        ImageView profilePhotoSmall;
        TextView userName;
        TextView timePost;
        TextView contentTextPost;


        public seetingsViewHolder(@NonNull View itemView) {
            super(itemView);

            profilePictureBig = itemView.findViewById(R.id.CrV_ProfilePichture);
            contentPhotoPost = itemView.findViewById(R.id.IMV_post);
            profilePhotoSmall = itemView.findViewById(R.id.IMV_ProfilePichture2);
            userName = itemView.findViewById(R.id.TV_username);
            timePost = itemView.findViewById(R.id.TV_TimePost);
            contentTextPost = itemView.findViewById(R.id.TV_content);
        }


    }
}
