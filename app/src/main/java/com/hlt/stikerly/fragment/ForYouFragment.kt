package com.hlt.stikerly.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlt.stikerly.adapters.ForYouAdapter
import com.hlt.stikerly.databinding.FragmentForYouBinding
import com.hlt.stikerly.model.ForYouModel

class ForYouFragment : Fragment() {

    private var _binding: FragmentForYouBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentForYouBinding.inflate(inflater, container, false)

        // Set up RecyclerView with adapter
        val adapter = ForYouAdapter(getDummyData())
        binding.rcvSticker.layoutManager = LinearLayoutManager(requireContext())
        binding.rcvSticker.adapter = adapter

        return binding.root
    }

    private fun getDummyData(): List<ForYouModel> {
        return List(5) {
            ForYouModel(
                nameSticker = "Sticker ${it + 1}",
                txtTime = "${(it + 1)}d",
                txtAuthor = "Author ${it + 1}"
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
