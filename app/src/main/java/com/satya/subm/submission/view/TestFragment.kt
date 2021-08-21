package com.satya.subm.submission.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.satya.subm.submission.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    private var _binding : FragmentTestBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewPagerAdapter: ViewPagerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTestBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPagerAdapter = ViewPagerAdapter(this)

        with(binding){
            viewPager.adapter = viewPagerAdapter
            TabLayoutMediator(tablayout,viewPager ){tab, position ->
                when(position){
                    0 -> tab.text = "HOME"
                    1 -> tab.text = "PROFILE"

                }

            }.attach()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}