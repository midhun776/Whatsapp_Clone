package com.example.firstinternal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstinternal.R
import com.example.firstinternal.model.ChannelItemModel

class ChannelAdapter(private val data: List<ChannelItemModel>): RecyclerView.Adapter<ChannelAdapter.ViewHolder>() {

    private lateinit var parent: ViewGroup

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var icon: ImageView = itemView.findViewById(R.id.img_icon)
        var post: ImageView = itemView.findViewById(R.id.img_post)
        var ctv1: TextView = itemView.findViewById(R.id.ctv1)
        var ctv2: TextView = itemView.findViewById(R.id.ctv2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.parent = parent
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.channel_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.icon.setImageResource(item.icon)
        holder.post.setImageResource(item.post)
        holder.ctv1.text = item.cName
        holder.ctv2.text = item.cDesc
    }
}