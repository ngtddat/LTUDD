package com.example.myapplication.tuan4

import VolleyKotlinFn
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Tuan41MainActivity : AppCompatActivity() {
    var btn:Button? = null
    var tvKQ:TextView? = null
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan41_main)
        btn=findViewById(R.id.tuan41Btn)
        tvKQ=findViewById(R.id.tuan41TvKQ)
        var fn=VolleyKotlinFn()
        btn!!.setOnClickListener { fn.getJasonArrayObject(context,tvKQ!!) }
    }
}