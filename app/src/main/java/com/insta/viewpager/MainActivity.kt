package com.insta.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
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
    }
}