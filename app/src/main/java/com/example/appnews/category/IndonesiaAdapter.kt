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

class IndonesiaAdapter (private val indonesiaDataList : ArrayList<IndonesiaDataClass>) : RecyclerView.Adapter<IndonesiaAdapter.IndonesiaViewHolder> () {

    class IndonesiaViewHolder (val view : View) : RecyclerView.ViewHolder(view) {
        val titleImageNews : ImageView = view.findViewById(R.id.image_news)
        val tvAuthorNews : TextView = view.findViewById(R.id.author_news)
        val tvTitleNews : TextView = view.findViewById(R.id.title_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndonesiaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_indonesia_category,parent, false)
        return IndonesiaViewHolder(view)
    }

    override fun onBindViewHolder(holder: IndonesiaViewHolder, position: Int) {
        val indonesiaItem = indonesiaDataList[position]
        holder.titleImageNews.setImageResource(indonesiaItem.titleImage)
        holder.tvAuthorNews.text = indonesiaItem.authorNews
        holder.tvTitleNews.text = indonesiaItem.titleNews

        holder.view.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(indonesiaItem.url)
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return indonesiaDataList.size
    }
}