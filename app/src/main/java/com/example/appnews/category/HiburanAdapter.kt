package com.example.appnews.category

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appnews.R

class HiburanAdapter (private val hiburanDataList : ArrayList<HiburanDataClass>) : RecyclerView.Adapter<HiburanAdapter.HiburanViewHolder> () {

    class HiburanViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val titleImageNews: ImageView = view.findViewById(R.id.image_news)
        val tvAuthorNews: TextView = view.findViewById(R.id.author_news)
        val tvTitleNews: TextView = view.findViewById(R.id.title_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HiburanViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_indonesia_category, parent, false)
        return HiburanViewHolder(view)
    }

    override fun onBindViewHolder(holder: HiburanViewHolder, position: Int) {
        val hiburanItem = hiburanDataList[position]
        holder.titleImageNews.setImageResource(hiburanItem.titleImage)
        holder.tvAuthorNews.text = hiburanItem.authorNews
        holder.tvTitleNews.text = hiburanItem.titleNews

        holder.view.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(hiburanItem.url)
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return hiburanDataList.size
    }
}