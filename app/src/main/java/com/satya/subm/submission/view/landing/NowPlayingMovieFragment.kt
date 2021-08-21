package com.satya.subm.submission.view.landing

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.satya.subm.submission.R

class NowPlayingMovieFragment : Fragment() {

    companion object {
        fun newInstance() = NowPlayingMovieFragment()
    }

    private lateinit var viewModel: NowPlayingMovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.now_playing_movie_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NowPlayingMovieViewModel::class.java)
        // TODO: Use the ViewModel
    }

}