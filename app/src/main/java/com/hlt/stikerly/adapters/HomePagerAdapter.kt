package com.hlt.stikerly.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hlt.stikerly.fragment.FollowingFragment
import com.hlt.stikerly.fragment.TrendingFragment
import com.hlt.stikerly.fragment.ForYouFragment
import com.hlt.stikerly.fragment.ArtistFragment
import com.hlt.stikerly.fragment.CreatorsFragment
import com.hlt.stikerly.fragment.MemeBlankFragment

class HomePagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ForYouFragment()
            1 -> ArtistFragment()
            2 -> TrendingFragment()
            3 -> FollowingFragment()
            4->MemeBlankFragment()
            5->CreatorsFragment()
            else -> ForYouFragment() // Mặc định trả về fragment đầu tiên
        }
    }
}
