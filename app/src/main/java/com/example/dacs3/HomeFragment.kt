package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dacs3.Adapter.AdapterBorrowing
import com.example.dacs3.databinding.FragmentHomeBinding
import com.example.dacs3.model.Book

class HomeFragment : Fragment() {
    private lateinit var homeBinding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var expand  = false
        // Inflate the layout for this fragment
        homeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        homeBinding.RecyclerViewBorrowing.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<Book>()
        for (i in 1..5) {
            data.add(Book("123","this is the title","https://www.toponseek.com/blogs/wp-content/uploads/2019/06/toi-uu-hinh-anh-optimize-image-4-1200x700.jpg","this is the dsescription","author unknown","publisher unknown"))
        }


        homeBinding.RecyclerViewBorrowing.adapter = AdapterBorrowing(data)
        homeBinding.textViewBr.setOnClickListener{
            expand = !expand;
            activity?.runOnUiThread{
                homeBinding.expandedViewBr.visibility = if(expand) View.VISIBLE else View.GONE
            }
        }

        homeBinding.RecyclerViewRecent.adapter = AdapterBorrowing(data)
        homeBinding.RecyclerViewRecent.layoutManager = LinearLayoutManager(context)
        homeBinding.textViewRc.setOnClickListener{
            expand = !expand;
            activity?.runOnUiThread{
                homeBinding.expandedViewRc.visibility = if(expand) View.VISIBLE else View.GONE
            }
        }

        homeBinding.RecyclerViewRequest.adapter = AdapterBorrowing(data)
        homeBinding.RecyclerViewRequest.layoutManager = LinearLayoutManager(context)
        homeBinding.textViewRq.setOnClickListener{
            expand = !expand;
            activity?.runOnUiThread{
                homeBinding.expandedViewRq.visibility = if(expand) View.VISIBLE else View.GONE
            }
        }


        return homeBinding.root
    }
}