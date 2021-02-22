package com.example.shoppinglist_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val addItemFragment = AddItemFragment()
    private val listItemFragment = ListItemFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        supportActionBar?.hide()

//        switchFragment(addItemFragment)
        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.navigation_create -> {
                    switchFragment(addItemFragment)
                    replaceTitle(getString(R.string.title_create))
                }
                R.id.navigation_list -> {
                    switchFragment(listItemFragment)
                    replaceTitle(getString(R.string.title_list))
                }
            }
            true
        }
    }

    private fun switchFragment(fragment: Fragment) {
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nav_host_fragment, fragment)
            transaction.commit()
        }
    }
    private fun  replaceTitle(title:String) {
        supportActionBar?.title = title
    }
}