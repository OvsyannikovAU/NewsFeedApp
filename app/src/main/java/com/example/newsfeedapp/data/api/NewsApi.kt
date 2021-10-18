package com.example.newsfeedapp.data.api

import com.example.newsfeedapp.data.api.model.ApiResponseObject
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsApi {
    //const val BASE_URL = "https://newsapi.org/v2/everything?q=tesla&from=2021-09-16&sortBy=publishedA"
    //GET https://newsapi.org/v2/everything?q=keyword&apiKey=2a573f6914a5489b9d902b4bfb752615

    @GET("everything")
    @Headers("X-Api-Key: 2a573f6914a5489b9d902b4bfb752615")
    fun getNews(
        @Query("q") word: String = "",
        @Query("language") language: String = "ru",
        @Query("country") country: String = "ru"
    ) : ApiResponseObject

}