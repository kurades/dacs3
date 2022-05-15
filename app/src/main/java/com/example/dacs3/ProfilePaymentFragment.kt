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
        data.add(Subscription(3,123456,"BASIC","100 reads book per month","Advance service","2 books per loan"))
        data.add(Subscription(5,456789,"ADVANCE","200 reads book per month","Advance service","3 books per loan"))
        data.add(Subscription(7,987654,"PREMIUM","300 reads book per month","Advance service","4 books per loan"))
        paymentBinding.subscriptionRecyclerView.adapter = AdapterSubscription(data)
        return paymentBinding.root
    }


}