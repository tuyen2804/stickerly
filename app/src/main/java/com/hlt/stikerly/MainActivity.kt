package com.hlt.stikerly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view_tag, HomeFragment())
            .commit()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val fragment: Fragment = when (tab?.position) {
                    0 -> HomeFragment()
                    1 -> SearchFragment()
                    2 -> AddFragment()
                    3 -> NotifiFragment()
                    4 -> ProfileFragment()
                    else -> HomeFragment()
                }

                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view_tag, fragment)
                    .commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Không làm gì khi tab bị bỏ chọn
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Không làm gì khi tab được chọn lại
            }
        })
    }
}
