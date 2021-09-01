package com.satya.subm.submission.view.landing

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.satya.subm.submission.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class NowPlayingMovieFragment : Fragment(R.layout.now_playing_movie_fragment) {

    private val nowPlayingMovieViewModel by viewModels<NowPlayingMovieViewModel>()

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        nowPlayingMovieViewModel.nowPlayingMovies.observe(viewLifecycleOwner, Observer {
            Timber.i("success")
        })
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nowPlayingMovieViewModel.nowPlayingMovies.observe(viewLifecycleOwner, Observer {
            Timber.i("success")
        })
    }

}