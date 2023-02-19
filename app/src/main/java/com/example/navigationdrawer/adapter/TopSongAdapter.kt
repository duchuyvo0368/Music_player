package com.example.navigationdrawer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationdrawer.R
import com.example.navigationdrawer.fragment.HomeFragment
import com.example.navigationdrawer.model.Song

class TopSongAdapter(private val mList:List<Song>, private val context:Context) : RecyclerView.Adapter<TopSongAdapter.ListSongViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSongViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_song,parent,false)
        return ListSongViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListSongViewHolder, position: Int) {
        val itemViewHolder=mList[position]
        Glide.with(context).load(mList[position].thumbnail.toString())
            .centerCrop().error(R.mipmap.ic_launcher).into(holder.imageView)
        holder.song.text=itemViewHolder.name
        holder.singer.text=itemViewHolder.artists_names
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ListSongViewHolder(private val listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        var imageView:ImageView=listItemView.findViewById(R.id.iv_image)
        var song:TextView=listItemView.findViewById(R.id.tv_song)
        var singer:TextView=listItemView.findViewById(R.id.tv_singer)
    }
}