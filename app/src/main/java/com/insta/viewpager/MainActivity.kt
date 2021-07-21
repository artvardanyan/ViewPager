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

        var imageList: Array<Int> = arrayOf(
                R.drawable.ic_baseline_exposure_plus_1_24,
                R.drawable.ic_baseline_exposure_plus_2_24,
                R.drawable.ic_baseline_looks_3_24,
                R.drawable.ic_baseline_looks_4_24,
                R.drawable.ic_baseline_looks_5_24,
                R.drawable.ic_baseline_looks_6_24

        )

        adapter = NumberAdapter(this)
        binding?.viewPager?.adapter = adapter


        TabLayoutMediator(binding?.tabLayout!!, binding?.viewPager!!) { tab, position ->
            //tab.text = "TAB ${position + 1}"
            tab.setIcon(imageList[position])

            if (position == 2) {
                val badge = tab.orCreateBadge
                badge.number = 1
            }

        }.attach()

    }
}