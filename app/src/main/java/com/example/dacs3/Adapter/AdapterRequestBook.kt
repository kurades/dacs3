package com.example.dacs3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs3.R
import com.example.dacs3.model.RequestBook
import com.squareup.picasso.Picasso
import java.time.format.DateTimeFormatter


class AdapterRequestBook(private val dataSet: ArrayList<RequestBook>) :
    RecyclerView.Adapter<AdapterRequestBook.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val author : TextView
        val thumbnail: ImageView
        val requestDay : TextView
        val status : TextView
        val pYear : TextView
        init {
            title = view.findViewById(R.id.requestTitle)
            author = view.findViewById(R.id.requestAuthor)
            thumbnail = view.findViewById(R.id.requestThumbnail)
            requestDay = view.findViewById(R.id.requestDay)
            status = view.findViewById(R.id.requestStatus)
            pYear = view.findViewById(R.id.pYear)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.request_item, viewGroup, false)


        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        Picasso.get()
            .load(dataSet[position].thumbnail)
            .placeholder(R.drawable.ic_launcher_background)
            .into(viewHolder.thumbnail)

        viewHolder.title.text = dataSet[position].title
        viewHolder.author.text = "Author: "+dataSet[position].author
        viewHolder.requestDay.text = dataSet[position].requestDay.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        viewHolder.status.text = dataSet[position].status
        viewHolder.pYear.text = "Publish year: "+dataSet[position].publishYear.toString()
    }

    override fun getItemCount() = dataSet.size

}