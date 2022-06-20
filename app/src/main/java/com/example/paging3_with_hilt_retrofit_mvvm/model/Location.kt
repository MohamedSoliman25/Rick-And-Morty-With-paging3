package com.example.paging3_with_hilt_retrofit_mvvm.model


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("name")
    var name: String?,
    @SerializedName("url")
    var url: String?
)