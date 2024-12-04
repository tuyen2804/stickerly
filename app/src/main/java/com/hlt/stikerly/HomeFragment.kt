package com.hlt.stikerly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hlt.stikerly.databinding.FragmentHomeBinding
import com.hlt.stikerly.adapters.HomePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    // ViewBinding
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using ViewBinding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set up the ViewPager with the adapter
        val pagerAdapter = HomePagerAdapter(this)
        binding.vpgHome.adapter = pagerAdapter

        // Set up the TabLayout with ViewPager2 using TabLayoutMediator
        TabLayoutMediator(binding.tabLayoutHome, binding.vpgHome) { tab, position ->
            when (position) {
                0 -> tab.text = "For You"
                1 -> tab.text = "Artist"
                2 -> tab.text = "Trending"
                3 -> tab.text = "Following"
                4->tab.text="Meme"
                5->tab.text="Creators"
            }
        }.attach()  // This automatically syncs the TabLayout with ViewPager2

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear binding
    }
}
