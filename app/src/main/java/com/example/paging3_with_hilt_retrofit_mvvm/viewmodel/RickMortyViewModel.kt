package com.example.paging3_with_hilt_retrofit_mvvm.viewmodel

import androidx.lifecycle.*
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.paging3_with_hilt_retrofit_mvvm.api.ApiService
import com.example.paging3_with_hilt_retrofit_mvvm.paging.RickMortyPagingSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RickMortyViewModel @Inject constructor(private val apiService: ApiService):ViewModel() {

    val listData = Pager(PagingConfig(pageSize = 1)){
        RickMortyPagingSource(apiService)
    }.flow.cachedIn(viewModelScope)


}