package com.hlt.stikerly.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlt.stikerly.model.ForYouModel
import com.hlt.stikerly.databinding.ItemForYouBinding

class ForYouAdapter(private val dataList: List<ForYouModel>) : RecyclerView.Adapter<ForYouAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemForYouBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = dataList.size

    inner class ViewHolder(private val binding: ItemForYouBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ForYouModel) {
            binding.txtNameSticker.text = item.nameSticker
            binding.txtTime.text = item.txtTime
            binding.txtAuthor.text = item.txtAuthor
        }
    }
}
