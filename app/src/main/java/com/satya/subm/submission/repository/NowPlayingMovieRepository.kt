package com.satya.subm.submission.repository

import com.satya.subm.submission.model.NowPlayingMovies
import com.satya.subm.submission.network.NowPlayingMovieService
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NowPlayingMovieRepository @Inject constructor(
    private val nowPlayingMovieService: NowPlayingMovieService
) {

    fun getNowPlayingMovie() : Single<NowPlayingMovies> {
        return nowPlayingMovieService.getNowPlayingMovie()
            .subscribeOn(Schedulers.io())
    }
}