package com.example.appnews

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appnews.adapter.DcForYou
import com.example.appnews.adapter.ForYouAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: ForYouAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var forYouArrayList: ArrayList<DcForYou>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ambil referensi ke TextView
        val tvSelengkapnya: TextView = view.findViewById(R.id.tvSelengkapnya)
        val tvSelengkapnya2: TextView = view.findViewById(R.id.tvSelengkapnya2)

        // Ambil referensi ke TextView di FrameLayout pertama
        tvSelengkapnya.setOnClickListener {
            val url = "https://news.detik.com/berita/d-7353931/syl-palak-pegawai-kementan-minta-dibelikan-parfum-hp-hingga-pin-emas"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        // Atur OnClickListener
        tvSelengkapnya2.setOnClickListener {
            val url = "https://news.detik.com/video/240601071/megawati-pemimpin-itu-berjuang-untuk-bangsa-tak-lari-dari-tanggung-jawab"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }


        forYouArrayList = DcForYou.forYouSampleData()

        // Mengatur RecyclerView dengan LinearLayoutManager vertikal
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

        // Mengatur adapter dengan data dan menghubungkannya ke RecyclerView
        adapter = ForYouAdapter(forYouArrayList)
        recyclerView.adapter = adapter
    }
}