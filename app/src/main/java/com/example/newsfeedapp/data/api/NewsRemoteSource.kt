package com.example.newsfeedapp.data.api

import com.example.newsfeedapp.data.api.model.ApiResponseObject

class NewsRemoteSource(private val newsApi: NewsApi) {

    fun getNews(): ApiResponseObject {
        return newsApi.getNews()
    }
}