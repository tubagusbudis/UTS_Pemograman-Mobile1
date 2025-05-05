package com.example.uts_pemmob1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NewsAdapter(private val newsList: ArrayList<NewsItem>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

//        Fungsi untuk membuat tampilan item pada RecyclerView
    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.newsImage)
        val title: TextView = itemView.findViewById(R.id.newsTitle)
        val desc: TextView = itemView.findViewById(R.id.newsDescription)
    }

//        Fungsi untuk membuat tampilan item pada RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

//        Fungsi untuk mengatur tampilan item pada RecyclerView
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = newsList[position]
        holder.title.text = item.title
        holder.desc.text = item.description

        Glide.with(holder.itemView.context)
            .load(item.imageUrl)
            .placeholder(R.drawable.ic_launcher_background) // optional
            .into(holder.img)

//        Animasi saat muncul item pada RecyclerView
        val animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.item_anim)
        holder.itemView.startAnimation(animation)
    }

    override fun getItemCount(): Int = newsList.size
}