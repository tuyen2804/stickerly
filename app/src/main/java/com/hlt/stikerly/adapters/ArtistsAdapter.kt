package com.hlt.stikerly.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlt.stikerly.model.ArtistsModel
import com.hlt.stikerly.databinding.ItemArtistsBinding

class ArtistsAdapter(var dataList:List<ArtistsModel>):RecyclerView.Adapter<ArtistsAdapter.ViewHolder>() {
    class ViewHolder(private val binding:ItemArtistsBinding):RecyclerView.ViewHolder(binding.root) {
        val txtNameAuthor=binding.txtNameAuthor
        val txtQuantityFollowers=binding.txtQuantityFollowers

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding=ItemArtistsBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int =dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item=dataList[position]
        holder.txtNameAuthor.text=item.nameAuthor
        holder.txtQuantityFollowers.text=item.quantityFollowers
    }
}