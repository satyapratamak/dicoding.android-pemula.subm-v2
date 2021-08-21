package com.satya.subm.submission.network

import com.satya.subm.submission.model.APINowPlayingMovies
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface MovieService {

    @GET("movie/now_playing?api_key=82b5ea77886876880c5780f4c8f5ad6c&language=en-US&page=1")
    fun getNowPlayingMovie(): Single<APINowPlayingMovies>
}