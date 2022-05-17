package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dacs3.Adapter.AdapterRequestBook
import com.example.dacs3.databinding.FragmentMHRequestBinding
import com.example.dacs3.model.RequestBook
import java.time.LocalDate
import java.time.Year
import java.time.format.DateTimeFormatter
import kotlin.collections.ArrayList


class MHRequestFragment : Fragment() {
    private lateinit var binding : FragmentMHRequestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMHRequestBinding.inflate(inflater,container,false)
        binding.MHRequestList.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<RequestBook>()
        for(i in 1..5){
            data.add(RequestBook("this is the title","https://product.hstatic.net/200000343865/product/6_90462943d6e348c8a807fddc3f0d688b_master.jpg","this is the author",
                LocalDate.parse("20/12/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                Year.parse("2022"),"romcom","pending"
            ))
        }
        binding.MHRequestList.adapter = AdapterRequestBook(data)
        return binding.root
    }

}