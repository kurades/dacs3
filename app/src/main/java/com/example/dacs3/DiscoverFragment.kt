package com.example.dacs3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dacs3.Adapter.AdapterBorrowing
import com.example.dacs3.Adapter.AdapterDiscoverParent
import com.example.dacs3.databinding.FragmentDiscoverBinding
import com.example.dacs3.model.Book
import com.example.dacs3.model.DiscoverParent

class DiscoverFragment : Fragment() {
    private lateinit var disBinding: FragmentDiscoverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        disBinding = FragmentDiscoverBinding.inflate(inflater, container, false)
        disBinding.DiscoverRecyclerView.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<DiscoverParent>()
        val childData = ArrayList<Book>()
        for (i in 1..5) {
            childData.add(Book("123","this is the very long long title","https://www.toponseek.com/blogs/wp-content/uploads/2019/06/toi-uu-hinh-anh-optimize-image-4-1200x700.jpg","this is the dsescription","author unknown","publisher unknown"))
        }

//        5 children field
        for (i in 1..5) {
            data.add(DiscoverParent("title "+i,childData))
        }
        disBinding.DiscoverRecyclerView.adapter = AdapterDiscoverParent(data)
        return disBinding.root
    }
}