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

class DuniaAdapter (private val duniaDataList : ArrayList<DuniaDataClass>) : RecyclerView.Adapter<DuniaAdapter.DuniaViewHolder> () {

    class DuniaViewHolder (val view : View) : RecyclerView.ViewHolder(view) {
        val titleImageNews : ImageView = view.findViewById(R.id.image_news)
        val tvAuthorNews : TextView = view.findViewById(R.id.author_news)
        val tvTitleNews : TextView = view.findViewById(R.id.title_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DuniaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_indonesia_category,parent, false)
        return DuniaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DuniaViewHolder, position: Int) {
        val duniaItem = duniaDataList[position]
        holder.titleImageNews.setImageResource(duniaItem.titleImage)
        holder.tvAuthorNews.text = duniaItem.authorNews
        holder.tvTitleNews.text = duniaItem.titleNews

        holder.view.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(duniaItem.url)
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return duniaDataList.size
    }
}