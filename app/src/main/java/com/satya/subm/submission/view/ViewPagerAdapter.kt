package com.satya.subm.submission.view

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.satya.subm.submission.view.landing.NowPlayingMovieFragment

//class ViewPagerAdapter(fm : FragmentManager, lc : Lifecycle): FragmentStateAdapter(fm, lc) {
//
//
//    override fun getItemCount(): Int = 2
//
//    override fun createFragment(position: Int): Fragment {
//        var fragment = Fragment()
//        when(position){
//            0 -> fragment = HomeFragment()
//            1 -> fragment = ProfileFragment()
//
//        }
//        return fragment
//    }
//}

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = NowPlayingMovieFragment()
            1 -> fragment = ProfileFragment()

        }
        return fragment
    }
}