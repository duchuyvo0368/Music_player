package com.example.navigationdrawer.adapter.slider

import android.transition.Slide
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationdrawer.R
import com.example.navigationdrawer.databinding.ItemSliderBinding
import com.example.navigationdrawer.model.SliderModel
import com.smarteist.autoimageslider.SliderViewAdapter
import com.smarteist.autoimageslider.SliderViewAdapter.ViewHolder

class SliderAdapter : RecyclerView.Adapter<SliderAdapter.SliderAdapterVH>() {
    private val imageSlider = mutableListOf<SliderModel>()
    fun addSlider(sliderModel: SliderModel) {
        imageSlider.add(sliderModel)
        notifyDataSetChanged()
    }
   inner class SliderAdapterVH(private val binding: ItemSliderBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(sliderModel: SliderModel) {
            Glide.with(binding.root.context).load(sliderModel.image).centerCrop().into(binding.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderAdapterVH {
        val binding = ItemSliderBinding.bind(
            LayoutInflater.from(parent.context).inflate(R.layout.item_slider, parent,false)
        )
        return SliderAdapterVH(binding)
    }

    override fun getItemCount(): Int {
        return imageSlider.size
    }

    override fun onBindViewHolder(holder: SliderAdapterVH, position: Int) {
        holder.bind(imageSlider[position])
    }

//    private val imageSlider = mutableListOf<SliderModel>()
//    fun addSlider(sliderModel: SliderModel) {
//        imageSlider.add(sliderModel)
//        notifyDataSetChanged()
//    }
//
//    inner class SliderAdapterVH(private val binding: ItemSliderBinding) : ViewHolder(binding.root) {
//        fun bind(sliderModel: SliderModel) {
//            Glide.with(itemView).load(sliderModel.image).centerCrop().into(binding.imageView)
//        }
//    }
//
//    override fun getCount(): Int {
//        return imageSlider.size
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapterVH {
//        val binding = ItemSliderBinding.bind(
//            LayoutInflater.from(parent!!.context).inflate(R.layout.item_slider, null)
//        )
//        return SliderAdapterVH(binding)
//    }
//
//    override fun onBindViewHolder(viewHolder: SliderAdapterVH?, position: Int) {
//        viewHolder?.bind(imageSlider[position])
//    }


}