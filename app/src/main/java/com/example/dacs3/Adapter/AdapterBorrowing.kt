package com.example.dacs3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs3.R
import com.example.dacs3.model.Book
import com.squareup.picasso.Picasso


class AdapterBorrowing(private val dataSet: ArrayList<Book>) :
    RecyclerView.Adapter<AdapterBorrowing.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val thubnail: ImageView
        init {
            title = view.findViewById(R.id.cardTitle)
            thubnail = view.findViewById(R.id.cardThumbnail)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.detail_card, viewGroup, false)


        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        Picasso.get()
            .load(dataSet[position].thumbnail)
            .placeholder(R.drawable.ic_launcher_background)
            .into(viewHolder.thubnail)

        viewHolder.title.text = dataSet[position].title
    }

    override fun getItemCount() = dataSet.size

}