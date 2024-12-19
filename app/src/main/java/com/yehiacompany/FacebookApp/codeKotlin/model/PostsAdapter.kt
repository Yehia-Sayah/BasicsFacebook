package com.yehiacompany.FacebookApp.codeKotlin.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yehiacompany.FacebookApp.R


class PostsAdapter(var postlist: List<Post>) : RecyclerView.Adapter<PostsAdapter.myViewHolder>() {

    class myViewHolder(val postView: View) : RecyclerView.ViewHolder(postView) {
        private val profileTv: ImageView = postView.findViewById(R.id.CrV_ProfilePichture)
        private val profileNameTv: TextView = postView.findViewById(R.id.TV_username)
        private val postDateTv: TextView = postView.findViewById(R.id.TV_TimePost)
        private val postContentTv: TextView = postView.findViewById(R.id.TV_content)
        private val postImageViewIV: ImageView = postView.findViewById(R.id.IMV_post)

        fun bind(post: Post) {
            profileTv.setImageResource(post.author.profilePic)
            profileNameTv.text = post.author.name
            postDateTv.text = post.date
            postContentTv.text = post.content
            postImageViewIV.setImageResource(post.image)
        }

    }

    //access on view only > but working Generate for view the same size screen only first Time
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val postView = LayoutInflater.from(parent.context)
            .inflate(com.yehiacompany.FacebookApp.R.layout.activity_templat_timeline, parent, false)
        return myViewHolder(postView)
    }


    //access on view using parameter holder > and access on data using parameter position
    // return recycle view > after on create view fullscreen
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        val post = postlist[position]

    }

    // Show much count items
    override fun getItemCount(): Int = postlist.size   //using with one statement


}

