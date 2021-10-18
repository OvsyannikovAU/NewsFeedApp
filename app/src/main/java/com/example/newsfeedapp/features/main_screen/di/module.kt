package com.example.newsfeedapp.features.main_screen.di

import com.example.newsfeedapp.data.api.NewsApi
import com.example.newsfeedapp.data.api.NewsRemoteSource
import com.example.newsfeedapp.data.api.NewsRepo
import com.example.newsfeedapp.data.api.NewsRepoImpl
import com.example.newsfeedapp.domain.NewsInteractor
import com.example.newsfeedapp.features.main_screen.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainScreenModule = module {
    viewModel {
        MainScreenViewModel()
    }

    single { NewsInteractor(get()) }

    single<NewsRepo> { NewsRepoImpl(get()) }

    single { NewsRemoteSource(get()) }

    single { get<Retrofit>().create(NewsApi::class.java) }

}