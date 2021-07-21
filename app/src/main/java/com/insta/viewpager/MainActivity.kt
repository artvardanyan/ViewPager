package com.insta.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.insta.viewpager.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private var binding: ActivityMainBinding? = null
    private var adapter: NumberAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        adapter = NumberAdapter(this)
        binding?.viewPager?.adapter = adapter


        TabLayoutMediator(binding?.tabLayout!!, binding?.viewPager!!) { tab, position ->
            tab.text = "TAB ${position + 1}"

            if (position == 2) {
                val badge = tab.orCreateBadge
                badge.number = 1
            }

        }.attach()

    }
}