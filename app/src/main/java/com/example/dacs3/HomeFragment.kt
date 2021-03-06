package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.dacs3.Adapter.AdapterBorrowing
import com.example.dacs3.Adapter.ProfilePagerAdapter
import com.example.dacs3.databinding.FragmentHomeBinding
import com.example.dacs3.databinding.FragmentManagerHomeBinding
import com.example.dacs3.model.Book
import com.example.dacs3.model.Location
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {
    private lateinit var homeBinding: FragmentHomeBinding
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = FragmentHomeBinding.inflate(inflater,container,false)

        val data = ArrayList<Fragment>()
        data.add(HomeBrFragment())
        data.add(HomeRcFragment())
        data.add(HomeRqFragment())
        val adapter = ProfilePagerAdapter(this,data)
        viewPager = homeBinding.HomeViewPager
        viewPager.adapter = adapter
        val tabLayout = homeBinding.HomeTabLayout
        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            when(position){
                0 ->{
                    tab.text = "Borrowing"
                }
                1 ->{
                    tab.text = "Recent Books"
                }
                2 ->{
                    tab.text = "Request Books"
                }
            }
        }.attach()

        return homeBinding.root
    }
}