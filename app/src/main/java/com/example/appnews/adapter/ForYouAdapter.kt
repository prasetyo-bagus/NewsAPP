package com.example.appnews.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appnews.R

class ForYouAdapter(private val beritaFy: List<DcForYou>):
    RecyclerView.Adapter<ForYouAdapter.DcForYouViewHolder>() {

    class DcForYouViewHolder (val row : View) : RecyclerView.ViewHolder(row){
        val imageIv : ImageView = row.findViewById(R.id.ivGambar)
        val judulTv : TextView = row.findViewById(R.id.tvJudulBerita)
        val sumberTv : TextView = row.findViewById(R.id.tvSumber)
        val waktuTv : TextView = row.findViewById(R.id.tvWaktu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DcForYouViewHolder {
        val layoutData =LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return DcForYouViewHolder(layoutData)
    }

    override fun getItemCount(): Int {
        return beritaFy.size
    }

    override fun onBindViewHolder(holder: DcForYouViewHolder, position: Int) {
        val dataBerita = beritaFy[position]

        holder.imageIv.setImageResource(dataBerita.image)
        holder.judulTv.text = dataBerita.judul
        holder.sumberTv.text = dataBerita.sumber
        holder.waktuTv.text = dataBerita.waktu

        holder.row.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(dataBerita.url)
            holder.row.context.startActivity(intent)
        }


    }


}