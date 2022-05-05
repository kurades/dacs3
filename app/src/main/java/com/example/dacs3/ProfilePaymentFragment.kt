package com.example.dacs3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs3.Adapter.AdapterSubscription
import com.example.dacs3.databinding.FragmentProfilePaymentBinding
import com.example.dacs3.model.Subscription


class ProfilePaymentFragment : Fragment() {
    private lateinit var paymentBinding: FragmentProfilePaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        paymentBinding = FragmentProfilePaymentBinding.inflate(inflater, container, false)
        paymentBinding.subscriptionRecyclerView.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<Subscription>()
        for(i in 1..5){
            data.add(Subscription(3,40,123456))
        }
        paymentBinding.subscriptionRecyclerView.adapter = AdapterSubscription(data)
        return paymentBinding.root
    }


}