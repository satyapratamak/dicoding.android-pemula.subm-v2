package com.satya.subm.submission.view.landing

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satya.subm.submission.model.NowPlayingMovie
import com.satya.subm.submission.repository.NowPlayingMovieRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class NowPlayingMovieViewModel @ViewModelInject constructor(
    nowPlayingMovieRepository : NowPlayingMovieRepository
) : ViewModel() {
    private val _nowPlayingMovies = MutableLiveData<NowPlayingMovie>()

    val nowPlayingMovies : LiveData<NowPlayingMovie>
    get() = _nowPlayingMovies

    init {
        nowPlayingMovieRepository.getNowPlayingMovie()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()
    }
}