package com.satya.subm.submission.network


import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideHttpLoggerInterception() : HttpLoggingInterceptor{
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Singleton
    @Provides
    fun provideCallFactory(httpLoggingInterceptor: HttpLoggingInterceptor) : Call.Factory{
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideMoshi(): Moshi {

        return Moshi.Builder().build()
    }

    @Singleton
    @Provides
    fun provideMoshiConverterFactory(): MoshiConverterFactory {
        return MoshiConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRxJava3CallAdapterFactory(): RxJava3CallAdapterFactory {
        return RxJava3CallAdapterFactory.create()
    }

    @Singleton
    @Provides
    fun provideBaseUrl(): String {
        return "https://api.themoviedb.org/3/"
    }


    @Singleton
    @Provides
    fun provideRetrofit(callFactory: Call.Factory,
    moshiConverterFactory: MoshiConverterFactory,
    rxJava3CallAdapterFactory: RxJava3CallAdapterFactory,
    baseUrl : String) : Retrofit{
        return Retrofit.Builder()
            .callFactory(callFactory)
            .addConverterFactory(moshiConverterFactory)
            .addCallAdapterFactory(rxJava3CallAdapterFactory)
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieService(retrofit: Retrofit) : MovieService{
        return retrofit.create(MovieService::class.java)
    }

    @Singleton
    @Provides
    fun provideNowPlayingMovieService(retrofit: Retrofit) : NowPlayingMovieService{
        return retrofit.create(NowPlayingMovieService::class.java)
    }
}