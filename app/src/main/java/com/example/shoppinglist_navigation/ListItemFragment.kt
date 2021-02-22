package com.example.shoppinglist_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_list_item.*


class ListItemFragment : Fragment(), View.OnClickListener{
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        btnAdd.setOnClickListener(this)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ListItemFragment()
    }

    override fun onClick(view: View?) {
     when(view) {
//         btnAdd -> navController.navigate(R.id.action_listItemFragment_to_addItemFragment)
     }
    }
}