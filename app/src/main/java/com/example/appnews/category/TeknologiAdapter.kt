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

class TeknologiAdapter (private val teknologiDataList : ArrayList<TeknologiDataClass>) : RecyclerView.Adapter<TeknologiAdapter.TeknologiViewHolder> () {


    class TeknologiViewHolder (val view : View) : RecyclerView.ViewHolder(view) {
        val titleImageNews : ImageView = view.findViewById(R.id.image_news)
        val tvAuthorNews : TextView = view.findViewById(R.id.author_news)
        val tvTitleNews : TextView = view.findViewById(R.id.title_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeknologiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_teknologi_category,parent, false)
        return TeknologiViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeknologiViewHolder, position: Int) {
        val teknologiItem = teknologiDataList[position]
        holder.titleImageNews.setImageResource(teknologiItem.titleImage)
        holder.tvAuthorNews.text = teknologiItem.authorNews
        holder.tvTitleNews.text = teknologiItem.titleNews

        holder.view.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(teknologiItem.url)
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return teknologiDataList.size
    }
}