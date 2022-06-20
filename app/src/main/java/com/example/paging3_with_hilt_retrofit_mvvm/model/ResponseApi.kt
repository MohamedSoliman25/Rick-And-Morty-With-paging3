package com.example.paging3_with_hilt_retrofit_mvvm.model


import com.google.gson.annotations.SerializedName

data class ResponseApi(
    @SerializedName("info")
    var info: Info?,
    @SerializedName("results")
    var results: List<RickMorty>?
)