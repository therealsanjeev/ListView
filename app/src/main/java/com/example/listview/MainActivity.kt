package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_fruit_items.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = Fruit.getRandomFruits(100)
        val fruitAdapter = FruitAdapter(fruits)
        rvFruits.layoutManager =LinearLayoutManager(this)
        rvFruits.adapter=fruitAdapter

//        lVFruits.adapter=ArrayAdapter<String>(
//            this,R.layout.list_fruit_items,
//            R.id.tvFruit,
//            arrayOf(
//                "Apples",
//                "Mangos",
//                "Guavas",
//                "Bananas",
//                "Grapes",
//                "Watermelons",
//                "Kiwis",
//                "Melons",
//                "Papayas",
//                "Strawberries"
//            )
//        )
//        lVFruits.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this,
//                "Jonny ate $position ${view.tvFruit.text}",
//                Toast.LENGTH_SHORT).show()
//        }
    }
}
