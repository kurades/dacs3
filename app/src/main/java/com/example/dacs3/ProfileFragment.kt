package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.example.dacs3.Adapter.ProfilePagerAdapter
import com.example.dacs3.databinding.FragmentProfileBinding
import com.google.android.material.tabs.TabLayoutMediator


class ProfileFragment : Fragment() {
    private lateinit var profileBinding: FragmentProfileBinding
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileBinding = FragmentProfileBinding.inflate(inflater,container,false)
        val data = ArrayList<Fragment>()
        data.add(ProfileInfoFragment())
        data.add(ProfilePaymentFragment())
        val adapter = ProfilePagerAdapter(this,data)
        viewPager = profileBinding.viewPager
        viewPager.adapter = adapter
        val tabLayout = profileBinding.profileTabLayout
        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            when(position){
                0 ->{
                    tab.text = "Infomation"
                }
                1 ->{
                    tab.text = "Payment"
                }
            }
        }.attach()





        return profileBinding.root
    }

}