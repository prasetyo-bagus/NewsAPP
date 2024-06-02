package com.example.appnews

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter untuk RecyclerView yang menampilkan data headline berita
class HeadlineAdapter (private val headlineDataList : ArrayList<HeadlineDataClass>) : RecyclerView.Adapter<HeadlineAdapter.HeadlineViewHolder> () {

    // ViewHolder untuk item headline
    class HeadlineViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
        val titleImageNews : ImageView = view.findViewById(R.id.image_news)
        val tvAuthorNews : TextView = view.findViewById(R.id.author_news)
        val tvTitleNews : TextView = view.findViewById(R.id.title_news)
    }

    // Method untuk membuat ViewHolder baru saat RecyclerView memerlukannya
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeadlineViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_headline, parent, false)
        return HeadlineViewHolder(view)
    }

    // Method untuk menghubungkan data ke ViewHolder pada posisi tertentu
    override fun onBindViewHolder(holder: HeadlineViewHolder, position: Int) {
        val headlineItem = headlineDataList[position]
        holder.titleImageNews.setImageResource(headlineItem.titleImage)
        holder.tvAuthorNews.text = headlineItem.authorNews
        holder.tvTitleNews.text = headlineItem.titleNews

        // Menambahkan OnClickListener untuk item, yang akan membuka URL berita di browser
        holder.view.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(headlineItem.url)
            holder.view.context.startActivity(intent)
        }
    }

    // Method untuk mendapatkan jumlah item dalam daftar data headline
    override fun getItemCount(): Int {
        return headlineDataList.size
    }
}