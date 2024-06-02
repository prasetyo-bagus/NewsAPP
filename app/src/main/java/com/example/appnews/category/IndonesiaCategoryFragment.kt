package com.example.appnews.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appnews.HeadlineAdapter
import com.example.appnews.R
import com.example.appnews.category.IndonesiaDataClass.Companion.indonesiaSampleData

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [IndonesiaCategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class IndonesiaCategoryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    // Dekalarasi Variabel Yang Akan Digunakan Untuk Inisialisasi Data Fragment
    private lateinit var adapter: IndonesiaAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var indonesiaArrayList: ArrayList<IndonesiaDataClass>

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
        val view = inflater.inflate(R.layout.fragment_indonesia_category, container, false)

        val btnCategoryDunia = view.findViewById<Button>(R.id.btnCategoryDunia)
        val btnCategoryTeknologi = view.findViewById<Button>(R.id.btnCategoryTeknologi)
        val btnCategoryHiburan = view.findViewById<Button>(R.id.btnCategoryHiburan)
        val btnCategoryOlahraga = view.findViewById<Button>(R.id.btnCategoryOlahraga)

        btnCategoryDunia.setOnClickListener {
            findNavController().navigate(R.id.action_indonesiaCategoryFragment_to_duniaCategoryFragment)
        }

        btnCategoryTeknologi.setOnClickListener {
            findNavController().navigate(R.id.action_indonesiaCategoryFragment_to_teknologiCategoryFragment)
        }
        btnCategoryHiburan.setOnClickListener {
            findNavController().navigate(R.id.action_indonesiaCategoryFragment_to_hiburanCategoryFragment)
        }
        btnCategoryOlahraga.setOnClickListener {
            findNavController().navigate(R.id.action_indonesiaCategoryFragment_to_olahragaCategoryFragment)
        }
        return view
    }

    private fun openFragment(fragmentId: Int) {
        // Menggunakan NavController untuk melakukan navigasi ke fragment tujuan
        findNavController().navigate(fragmentId)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment IndonesiaCategoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            IndonesiaCategoryFragment().apply {
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
         * Pada Class IndonesiaDataClass
         */
//        indonesiaArrayList = IndonesiaDataClass.indonesiaSampleData()
        indonesiaArrayList = IndonesiaDataClass.indonesiaSampleData()

        // Mengatur RecyclerView dengan LinearLayoutManager vertikal
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycleViewCategoryIndonesia)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

        // Mengatur adapter dengan data dan menghubungkannya ke RecyclerView
        adapter = IndonesiaAdapter(indonesiaArrayList)
        recyclerView.adapter = adapter
    }

}