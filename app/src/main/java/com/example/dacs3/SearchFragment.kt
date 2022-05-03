package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dacs3.Adapter.AdapterSearch
import com.example.dacs3.databinding.FragmentSearchBinding
import com.example.dacs3.model.Genre

class SearchFragment : Fragment() {
    private lateinit var searchBinding: FragmentSearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        searchBinding = FragmentSearchBinding.inflate(inflater, container, false)
        searchBinding.SearchRecyclerView.layoutManager = GridLayoutManager(context,2)

        val data = ArrayList<Genre>()
        for (i in 1..5) {
            data.add(Genre("this is a long Genre","https://imagepi.otakuscan.net/extendContent/Manga/26656/513f482e-a39f-448d-a254-bf8e45416b78.jpeg"))
        }
        searchBinding.SearchRecyclerView.adapter = AdapterSearch(data)

        return searchBinding.root
    }

}