package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lVFruits.adapter=ArrayAdapter<String>(
            this,R.layout.list_fruit_items,
            R.id.tvFruit,
            arrayOf(
                "Apple",
                "Mango",
                "Guava",
                "Banana",
                "Grapes",
                "Watermelon",
                "Kiwi"
            )
        )
    }
}
