package com.example.appnews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



/**
 * A simple [Fragment] subclass.
 * Use the [HeadlineFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HeadlineFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    // Dekalarasi Variabel Yang Akan Digunakan Untuk Inisialisasi Data Fragment
    private lateinit var adapter: HeadlineAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var headlineArrayList: ArrayList<HeadlineDataClass>

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
        return inflater.inflate(R.layout.fragment_headline, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HeadlineFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HeadlineFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**
         * Inisialisasi Daftar Item Pada Fragment Ini
         * Dengan Sample Data Yang Ada Di Companion Objek
         * Pada Class HeadlineDataClass
         */
        headlineArrayList = HeadlineDataClass.headlineSampleData()

        // Mengatur RecyclerView dengan LinearLayoutManager vertikal
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerViewHeadline)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

        // Mengatur adapter dengan data dan menghubungkannya ke RecyclerView
        adapter = HeadlineAdapter(headlineArrayList)
        recyclerView.adapter = adapter
    }
}