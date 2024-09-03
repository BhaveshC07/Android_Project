package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView=findViewById<ListView>(R.id.listview)

        val tasklist= arrayListOf<String>();
        tasklist.add("Wakeup");
        tasklist.add("fresh");
        tasklist.add("College");
        tasklist.add("Study");
        tasklist.add("sleep");

        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,tasklist)
        listView.adapter=adapter
        
        listView.setOnItemClickListener { parent, view, position, id ->

            val text="Clicked on item : "+(view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
    }

}