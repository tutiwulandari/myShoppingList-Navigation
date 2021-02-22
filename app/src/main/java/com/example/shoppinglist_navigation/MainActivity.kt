package com.example.shoppinglist_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val addItemFragment = AddItemFragment()
    private val listItemFragment = ListItemFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

//        navHostFragment =
//                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        navController = navHostFragment.findNavController()
                switchFragment(addItemFragment)
             bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.navigation_create -> switchFragment(addItemFragment)
                R.id.navigationList -> switchFragment(listItemFragment)
            }
            true
        }
    }



//        val buttonAddItemMenu = findViewById<Button>(R.id.btn_create)
//        buttonAddItemMenu.setOnClickListener{
//            println("BTN ADD")
//            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_addItemFragment)
//        }
//        val buttonViewListMenu = findViewById<Button>(R.id.btn_list)
//        buttonViewListMenu.setOnClickListener{
//            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_listItemFragment)
//        }


    private fun switchFragment(fragment: Fragment) {
//        if (fragment != null) {
//            val transaction = supportFragmentManager.beginTransaction()
//                    transaction.replace(R.id.nav_host_fragment, fragment).transaction.commit()
//        }
    }


}