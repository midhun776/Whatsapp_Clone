package com.example.firstinternal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstinternal.adapter.ChannelAdapter
import com.example.firstinternal.adapter.FindAdapter
import com.example.firstinternal.adapter.StatusAdapter
import com.example.firstinternal.model.SampleData

class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var seeAll = findViewById<TextView>(R.id.tv_seeAll)
        seeAll.setOnClickListener {
            var i = Intent(this,AllChannelsActivity::class.java)
            startActivity(i)
        }
        
        val popMenu = findViewById<CardView>(R.id.popCard)
        popMenu.setOnClickListener { 
            showMenu(popMenu)
        }

        var recyclerView1 = findViewById<RecyclerView>(R.id.rv1)
        recyclerView1.layoutManager = LinearLayoutManager(applicationContext,RecyclerView.HORIZONTAL,false)

        var recyclerView2 = findViewById<RecyclerView>(R.id.rv2)
        recyclerView2.layoutManager = LinearLayoutManager(applicationContext)

        var recyclerView3 = findViewById<RecyclerView>(R.id.rv3)
        recyclerView3.layoutManager = LinearLayoutManager(applicationContext,RecyclerView.HORIZONTAL,false)

        var data1 = SampleData.statusDemo
        val adapter1 = StatusAdapter(data1)
        recyclerView1.adapter = adapter1

        var data2 = SampleData.channelDemo
        val adapter2 = ChannelAdapter(data2)
        recyclerView2.adapter = adapter2

        var data3 = SampleData.findDemo
        val adapter3 = FindAdapter(data3)
        recyclerView3.adapter = adapter3

    }

    private fun showMenu(v: View?): Boolean {
        PopupMenu(this, v).apply {
            setOnMenuItemClickListener(this@MainActivity)
            inflate(R.menu.popup)
            show()
        }
        return true
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.find_channels -> {
                var i = Intent(this,AllChannelsActivity::class.java)
                startActivity(i)
                return true
            }
            R.id.create_channel -> {
                Toast.makeText(applicationContext,"New channel created!",Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return false
    }
}