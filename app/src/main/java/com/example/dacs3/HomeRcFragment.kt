package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dacs3.Adapter.AdapterBorrowing
import com.example.dacs3.databinding.FragmentHomeBrBinding
import com.example.dacs3.databinding.FragmentHomeRcBinding
import com.example.dacs3.model.Book
import com.example.dacs3.model.Location


class HomeRcFragment : Fragment() {
    private lateinit var binding : FragmentHomeRcBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeRcBinding.inflate(inflater,container,false)
        binding.HomeRcRecyclerView.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<Book>()
        for (i in 1..5) {
            data.add(
                Book("123","this is the title","https://product.hstatic.net/200000343865/product/6_90462943d6e348c8a807fddc3f0d688b_master.jpg","this is description","this is author","publisher",123456,
                    Location("1","2","3")
                )
            )
        }
        binding.HomeRcRecyclerView.adapter = AdapterBorrowing(data)
        return binding.root
    }
}