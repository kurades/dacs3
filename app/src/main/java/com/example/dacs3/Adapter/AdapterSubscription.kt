package com.example.dacs3.Adapter

import android.graphics.Color
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs3.R
import com.example.dacs3.model.Subscription

class AdapterSubscription(private val dataSet : ArrayList<Subscription>) : RecyclerView.Adapter<AdapterSubscription.ViewHolder>() {
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val time : TextView
        val price : TextView
        val cardView : CardView
        val title : TextView
        val button : Button
        val benefit1 : CheckBox
        val benefit2 : CheckBox
        val benefit3 : CheckBox

        init {
            time = view.findViewById(R.id.subscriptionTime)
            price = view.findViewById(R.id.subscriptionPrice)
            cardView = view.findViewById(R.id.cardView3)
            title = view.findViewById(R.id.subscriptionTitle)
            button = view.findViewById(R.id.button6)
            benefit1 = view.findViewById(R.id.subscriptionBenefit1)
            benefit2 = view.findViewById(R.id.subscriptionBenefit2)
            benefit3 = view.findViewById(R.id.subscriptionBenefit3)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.subscription_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val color = arrayOf("#27856a","#1e3264","#8d67ab")
        holder.time.text = "${dataSet[position].time} MONTHS"
        holder.price.text = "${dataSet[position].price}VND"
        holder.title.text = dataSet[position].title
        holder.cardView.background.setTint(Color.parseColor(color[position]))
        holder.button.background.setTint(Color.parseColor(color[position]))
        holder.benefit1.text = dataSet[position].benefit1
        holder.benefit2.text = dataSet[position].benefit2
        holder.benefit3.text = dataSet[position].benefit3
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}