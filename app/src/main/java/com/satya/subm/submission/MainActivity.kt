package com.satya.subm.submission

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.satya.subm.submission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    //private lateinit var viewPagerAdapter: ViewPagerAdapter

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
//
//        with(binding){
//            viewPager.adapter = viewPagerAdapter
//            TabLayoutMediator(tablayout,viewPager ){tab, position ->
//                when(position){
//                    0 -> tab.text = "HOME"
//                    1 -> tab.text = "PROFILE"
//
//                }
//
//            }.attach()
//        }
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            val fragment = TestFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragment, TestFragment::class.simpleName)
                .commit()
        }


    }

}