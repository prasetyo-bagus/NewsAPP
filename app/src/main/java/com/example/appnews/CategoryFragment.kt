package com.example.appnews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.example.appnews.category.IndonesiaCategoryFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@Suppress("UNREACHABLE_CODE")
class CategoryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        val btnCategoryIndonesia = view.findViewById<Button>(R.id.btnCategoryIndonesia)
        val btnCategoryDunia = view.findViewById<Button>(R.id.btnCategoryDunia)
        val btnCategoryTeknologi = view.findViewById<Button>(R.id.btnCategoryTeknologi)
        val btnCategoryHiburan = view.findViewById<Button>(R.id.btnCategoryHiburan)
        val btnCategoryOlahraga = view.findViewById<Button>(R.id.btnCategoryOlahraga)

        btnCategoryIndonesia.setOnClickListener {
            findNavController().navigate(R.id.action_category_bottom_menu_to_indonesiaCategoryFragment)
        }
        btnCategoryDunia.setOnClickListener {
            findNavController().navigate(R.id.action_category_bottom_menu_to_duniaCategoryFragment)

        }

        btnCategoryTeknologi.setOnClickListener {
            findNavController().navigate(R.id.action_category_bottom_menu_to_teknologiCategoryFragment)
        }
        btnCategoryHiburan.setOnClickListener {
            findNavController().navigate(R.id.action_category_bottom_menu_to_hiburanCategoryFragment)
        }
        btnCategoryOlahraga.setOnClickListener {
            findNavController().navigate(R.id.action_category_bottom_menu_to_teknologiCategoryFragment)
       }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigasi otomatis ke fragmen Indonesia
        findNavController().navigate(R.id.action_category_bottom_menu_to_indonesiaCategoryFragment)
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
         * @return A new instance of fragment CategoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CategoryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}