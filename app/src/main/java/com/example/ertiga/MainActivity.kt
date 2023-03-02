package com.example.ertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var rvSerets : RecyclerView? =null
    private var list : ArrayList<Seret> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = ("Ertiga")

        rvSerets = findViewById(R.id.rv_seret)
        rvSerets?.setHasFixedSize(true)

        list.addAll(SeretsData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rvSerets?.layoutManager = LinearLayoutManager(this)
        val listSeretAdapter = ListSeretAdapter(list)
        rvSerets?.adapter = listSeretAdapter

        listSeretAdapter.setOnItemClickCallback(object : ListSeretAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Seret) {
                (data)
            }
        })

    }
}
