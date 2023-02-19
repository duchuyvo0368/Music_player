package com.example.navigationdrawer.fragment

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.navigationdrawer.R
import com.example.navigationdrawer.adapter.slider.SliderAdapter
import com.example.navigationdrawer.databinding.FragmentHomeBinding
import com.example.navigationdrawer.model.SliderModel
import java.util.*


class HomeFragment : Fragment() {
    private lateinit var bindHomeFragment: FragmentHomeBinding
    private lateinit var sliderAdapter: SliderAdapter
    private lateinit var timer: Timer
    private val slider = listOf(
        R.drawable.slider_iamge1,

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //loadSlider()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        bindHomeFragment = FragmentHomeBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        sliderAdapter = SliderAdapter()
       // bindHomeFragment.viewSlider.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        bindHomeFragment.imageSlider.adapter=sliderAdapter
        sliderAdapter.addSlider(SliderModel("https://www.w3schools.com/w3images/lights.jpg"))
        sliderAdapter.addSlider(SliderModel("https://www.w3schools.com/w3images/lights.jpg"))
        sliderAdapter.addSlider(SliderModel("https://www.w3schools.com/w3images/lights.jpg"))
        Toast.makeText(bindHomeFragment.root.context,"$sliderAdapter",Toast.LENGTH_SHORT).show()


        return bindHomeFragment.root

    }

    private fun loadSlider() {

        //timer = Timer()
//        timer.schedule(object : TimerTask() {
//            override fun run() {
//                bindHomeFragment.viewPageSlider.post {
//                    bindHomeFragment.viewPageSlider.currentItem =
//                        (bindHomeFragment.viewPageSlider.currentItem + 1) % slider.size
//
//                }
//            }
//
//        }, 3000, 3000)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_search, menu);
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
/*private fun searchSong() {
    searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            TODO("Not yet implemented")
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            TODO("Not yet implemented")
        }


    })
}*/


/* private fun getData() {
     val dataService: ApiInterface = ApiUtils.getDataService()
     val callback: Call<Data> = dataService.getSong()
     callback.enqueue(object : Callback<Data> {
         override fun onResponse(
             call: Call<Data>,
             response: Response<Data>
         ) {
             val listItem1 = response.body()!!.data.song as ArrayList<Song>
             bindHomeFragment.listView.layoutManager = LinearLayoutManager(activity)
             bindHomeFragment.listView.adapter = TopSongAdapter(listItem1, context!!)
             Log.d("AAA", listItem1.toString())
         }


         override fun onFailure(call: Call<Data>, t: Throwable) {

         }

     })
 }*/

}