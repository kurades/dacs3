package com.example.dacs3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs3.Adapter.AdapterCart
import com.example.dacs3.model.Book
import com.example.dacs3.model.Location

class CartActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cartRecyclerView = findViewById<RecyclerView>(R.id.cartRecyclerView)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Book>()
        for (i in 1..10){
            data.add(Book("123","this is the very very very veyr very very long title","https://product.hstatic.net/200000343865/product/6_90462943d6e348c8a807fddc3f0d688b_master.jpg","this is description","this is author","publisher",123456,Location("1","2","3")))

        }
        cartRecyclerView.adapter = AdapterCart(data)
    }
}