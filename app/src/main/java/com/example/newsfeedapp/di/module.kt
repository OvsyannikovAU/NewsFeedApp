package com.example.newsfeedapp.di

import com.example.newsfeedapp.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://newsapi.org/"
const val APP_MODULE_OKHTTP = "APP_MODULE_OKHTTP"
const val APP_MODULE_RETROFIT = "APP_MODULE_RETROFIT"

val appModule = module {

    single<OkHttpClient>(named(APP_MODULE_OKHTTP)) {
        OkHttpClient.Builder().build()
    }


    single<Retrofit>(named(APP_MODULE_RETROFIT)) {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get<OkHttpClient>(qualifier = named(APP_MODULE_OKHTTP)))
            .build()
    }

}