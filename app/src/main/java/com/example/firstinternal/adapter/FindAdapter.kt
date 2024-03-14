package com.example.firstinternal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstinternal.R
import com.example.firstinternal.model.FindItemModel

class FindAdapter(private val data: List<FindItemModel>): RecyclerView.Adapter<FindAdapter.ViewHolder>() {

    private lateinit var parent: ViewGroup

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var fProfile: ImageView = itemView.findViewById(R.id.img_fProfile)
        var fName: TextView = itemView.findViewById(R.id.ftv1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.parent = parent
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.find_item,parent,false)
        return FindAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.fProfile.setImageResource(item.fProfile)
        holder.fName.text = item.fname
    }

}