package com.example.firstinternal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstinternal.R
import com.example.firstinternal.model.AllChannelModel

class AllChannelsAdapter(private val data: List<AllChannelModel>): RecyclerView.Adapter<AllChannelsAdapter.ViewHolder>() {
    private lateinit var parent: ViewGroup

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var cImage: ImageView = itemView.findViewById(R.id.channelImg)
        var cName: TextView = itemView.findViewById(R.id.tv_cName)
        var cFollow: TextView = itemView.findViewById(R.id.tv_cFollow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.parent = parent
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.channel_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.cImage.setImageResource(item.image)
        holder.cName.text = item.name
        holder.cFollow.text = item.followers
    }
}