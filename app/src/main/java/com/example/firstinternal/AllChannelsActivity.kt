package com.example.firstinternal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.firstinternal.adapter.AllChannelsAdapter
import com.example.firstinternal.adapter.TabsAdapter
import com.example.firstinternal.model.SampleData

class AllChannelsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_channels)

        val recyclerView5 = findViewById<RecyclerView>(R.id.rv5)
        recyclerView5.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        val recyclerView6 = findViewById<RecyclerView>(R.id.rv6)
        recyclerView6.layoutManager = LinearLayoutManager(this)

        val data5 = SampleData.tabsDemo
        val adapter5 = TabsAdapter(data5)
        recyclerView5.adapter = adapter5

        val data6 = SampleData.allChannelsDemo
        val adapter6 = AllChannelsAdapter(data6)
        recyclerView6.adapter = adapter6

    }
}