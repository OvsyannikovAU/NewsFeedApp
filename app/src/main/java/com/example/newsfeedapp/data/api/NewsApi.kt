package com.example.newsfeedapp.data.api

import com.example.newsfeedapp.data.api.model.ApiResponseObject
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsApi {
    //const val BASE_URL = "https://newsapi.org/v2/everything?q=tesla&from=2021-09-16&sortBy=publishedA"
    //GET https://newsapi.org/v2/everything?q=keyword&apiKey=2a573f6914a5489b9d902b4bfb752615

    @GET("v2/everything")
    @Headers("X-Api-Key: 6ff13a158eaa419cb341727dbf6a60ab")
    fun getNews(
        @Query("q") q: String = "TEST",
        @Query("language") language: String = "ru",
        @Query("country") country: String = "ru"
    ) : ApiResponseObject


    @GET("v2/everything")
    suspend fun getEverythingNews(
        @Query("q") query: String = "bitcoin",
        @Query("qInTitle") queryInTitle: String = "",
        @Query("sources") sources: String = "",
        @Query("domains") domains: String = "",
        @Query("excludeDomains") excludeDomains: String = "",
        @Query("from") from: String = "",
        @Query("to") to: String = "",
        @Query("language") language: String = "ru",
        @Query("sortBy") sortBy: String = "",
        @Query("pageSize") pageSize: Int = 100,
        @Query("page") page: Int = 1,
    ): ApiResponseObject

    @GET("v2/top-headlines")
    suspend fun getHeadlinesNews(
        @Query("country") country: String = "",
        @Query("category") category: String = "",
        @Query("sources") sources: String = "",
        @Query("q") query: String = "",
        @Query("pageSize") pageSize: Int = 20,
        @Query("page") page: Int = 1,
    ): ApiResponseObject
}