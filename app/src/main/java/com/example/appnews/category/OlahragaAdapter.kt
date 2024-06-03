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

class OlahragaAdapter (private val olahragaDataList : ArrayList<OlahragaDataClass>) : RecyclerView.Adapter<OlahragaAdapter.OlahragaViewHolder> () {

    class OlahragaViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val titleImageNews: ImageView = view.findViewById(R.id.image_news)
        val tvAuthorNews: TextView = view.findViewById(R.id.author_news)
        val tvTitleNews: TextView = view.findViewById(R.id.title_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OlahragaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_indonesia_category, parent, false)
        return OlahragaViewHolder(view)
    }

    override fun onBindViewHolder(holder: OlahragaViewHolder, position: Int) {
        val olahrgaItem = olahragaDataList[position]
        holder.titleImageNews.setImageResource(olahrgaItem.titleImage)
        holder.tvAuthorNews.text = olahrgaItem.authorNews
        holder.tvTitleNews.text = olahrgaItem.titleNews

        holder.view.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(olahrgaItem.url)
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return olahragaDataList.size
    }
}