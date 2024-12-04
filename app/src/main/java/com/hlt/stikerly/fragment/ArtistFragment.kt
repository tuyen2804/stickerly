package com.hlt.stikerly.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hlt.stikerly.model.ArtistsModel
import com.hlt.stikerly.adapters.ArtistsAdapter
import com.hlt.stikerly.databinding.FragmentArtistBinding


class ArtistFragment : Fragment() {
   private lateinit var binding: FragmentArtistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentArtistBinding.inflate(inflater,container,false)
        val listArtists= listOf<ArtistsModel>(
            ArtistsModel("kill_kaka","23.1K Followers"),
            ArtistsModel("vani_bhandari","12K Followers"),
            ArtistsModel("hihi","13K Followers")
        )
        val adapter=ArtistsAdapter(listArtists)
        binding.rcvArtists.adapter=adapter

        return binding.root
    }

}