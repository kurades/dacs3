package com.example.dacs3

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs3.Adapter.AdapterComment
import com.example.dacs3.model.Comment

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
//      favorite toggle
        val favoriteToggle = findViewById<ToggleButton>(R.id.favoriteToggle)
        favoriteToggle.isChecked = false
        favoriteToggle.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
        favoriteToggle.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if(p1){
                    favoriteToggle.setBackgroundResource(R.drawable.ic_baseline_favorite_red_24)
                }else{
                    favoriteToggle.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
                }
            }
        })

//        comment recyclerview
        val commentRecycler = findViewById<RecyclerView>(R.id.CommentRecyclerView)
        commentRecycler.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Comment>()
        for (i in 1..5){
            data.add(Comment("Tuan anh","https://image.thanhnien.vn/460x306/Uploaded/2022/lxwpcqjwp/2021_03_14/av-02_ayrt.jpeg","the book is terrible",3.0))
        }
        commentRecycler.adapter = AdapterComment(data)
    }
}