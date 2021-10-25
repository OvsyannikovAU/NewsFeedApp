package com.example.newsfeedapp.features.main_screen.di

import com.example.newsfeedapp.data.api.NewsApi
import com.example.newsfeedapp.data.api.NewsRemoteSource
import com.example.newsfeedapp.data.api.NewsRepo
import com.example.newsfeedapp.data.api.NewsRepoImpl
import com.example.newsfeedapp.domain.NewsInteractor
import com.example.newsfeedapp.features.main_screen.ui.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainScreenModule = module {
    viewModel {
        MainScreenViewModel(get<NewsInteractor>())
    }

    single { NewsInteractor(get()) }

    single<NewsRepo> {
        NewsRepoImpl(get<NewsRemoteSource>())
    }

    single<NewsRemoteSource> {
        NewsRemoteSource(get<NewsApi>())
    }


    single<NewsInteractor> {
        NewsInteractor(get<NewsRepo>())
    }

    single {
        get<Retrofit>().create(NewsApi::class.java)
    }

    /*single<MainScreenNewsApi> {
        get<Retrofit>(qualifier = named(APP_MODULE_RETROFIT)).create()
    }

    single<NewsRemoteSource> {
        NewsRemoteSource(get<MainScreenNewsApi>())
    }

    single<NewsRepository> {
        NewsRepositoryImpl(get<NewsRemoteSource>())
    }

    single<NewsFeedInteractor> {
        NewsFeedInteractor(get<NewsRepository>())
    }

    viewModel(named(MAIN_SCREEN_VIEW_MODEL)) {
        NewsFeedScreenViewModel(get<NewsFeedInteractor>())
    }*/

}