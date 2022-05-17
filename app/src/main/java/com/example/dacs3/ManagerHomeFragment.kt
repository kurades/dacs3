package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.dacs3.Adapter.ProfilePagerAdapter
import com.example.dacs3.databinding.FragmentManagerHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class ManagerHomeFragment : Fragment() {
    private lateinit var homeBinding: FragmentManagerHomeBinding
    private lateinit var viewPager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = FragmentManagerHomeBinding.inflate(inflater,container,false)

        val data = ArrayList<Fragment>()
        data.add(MHRequestFragment())
        data.add(MHConfirmFragment())
        val adapter = ProfilePagerAdapter(this,data)
        viewPager = homeBinding.mHViewPager
        viewPager.adapter = adapter
        val tabLayout = homeBinding.mHTabLayout
        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            when(position){
                0 ->{
                    tab.text = "Request book"
                }
                1 ->{
                    tab.text = "Confirmed"
                }
            }
        }.attach()

        return homeBinding.root
    }


}