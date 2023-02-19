package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Video
import android.util.Log
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationdrawer.adapter.TopSongAdapter
import com.example.navigationdrawer.api.ApiInterface
import com.example.navigationdrawer.api.ApiUtils
import com.example.navigationdrawer.databinding.ActivityMainBinding
import com.example.navigationdrawer.fragment.DiscoverFragment
import com.example.navigationdrawer.fragment.HomeFragment
import com.example.navigationdrawer.fragment.VideoFragment
import com.example.navigationdrawer.model.Data
import com.example.navigationdrawer.model.Song
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentHome0: HomeFragment
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnNavigation.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.icon_navigation_home -> {
                        if (supportFragmentManager.findFragmentById(R.id.frame_layout) !is HomeFragment) {//kiểm tra fragment đã được gắn vào frame_layout hay chưa
                            fragmentHome0 = HomeFragment()
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.frame_layout, fragmentHome0).commit()
                        }
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.icon_navigation_video -> {
                        if (supportFragmentManager.findFragmentById(R.id.frame_layout) !is VideoFragment) {
                            val fragmentHome1 = VideoFragment()
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.frame_layout, fragmentHome1).commit()
                        }
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.icon_navigation_discover -> {
                        val fragmentHome2 = DiscoverFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.frame_layout, fragmentHome2).commit()
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.icon_navigation_more -> {
                        Toast.makeText(applicationContext, "navigation more", Toast.LENGTH_SHORT)
                            .show()
                        return@setOnNavigationItemSelectedListener true
                    }


                    else -> false
                }
            }

        }
        val fragmentHome = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, fragmentHome)
            .commit()
    }
/*   private fun getData() {
    }*/


}