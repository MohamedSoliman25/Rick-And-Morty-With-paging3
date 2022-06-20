package com.example.paging3_with_hilt_retrofit_mvvm.di

import com.example.paging3_with_hilt_retrofit_mvvm.api.ApiService
import com.example.paging3_with_hilt_retrofit_mvvm.utils.Constans
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBaseUrl() = Constans.BASE_URL

    @Provides
    @Singleton
    fun provideRetrofitInstance(BASE_URL: String):ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)


}