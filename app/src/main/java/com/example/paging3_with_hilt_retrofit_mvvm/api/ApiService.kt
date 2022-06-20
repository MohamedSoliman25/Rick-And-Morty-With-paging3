package com.example.paging3_with_hilt_retrofit_mvvm.api

import com.example.paging3_with_hilt_retrofit_mvvm.model.ResponseApi
import com.example.paging3_with_hilt_retrofit_mvvm.utils.Constans
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(Constans.END_PONIT)
    suspend fun getAllCharacters(
        @Query("page") page:Int
    ):Response<ResponseApi>
}