package com.example.newsfeedapp.features.main_screen.ui

import com.example.newsfeedapp.base.BaseViewModel
import com.example.newsfeedapp.base.Event
import com.example.newsfeedapp.base.attempt
import com.example.newsfeedapp.domain.NewsInteractor

class MainScreenViewModel(val newsInteractor: NewsInteractor) : BaseViewModel<ViewState>() {

    init {
        processDataEvent(DataEvent.OnLoadData)
    }

    override fun initialViewState(): ViewState {
        return ViewState(
            articleList = emptyList(),
            errorMessage = null,
            isLoading = true,
            isInErrorState = false
        )
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is DataEvent.OnLoadData -> {
                newsInteractor.getNews().fold(
                    onSuccess = {
                        processDataEvent(DataEvent.SuccessNewsRequest(articleList = it))
                    },
                    onError = {
                        it
                    }
                )
            }
            is DataEvent.SuccessNewsRequest -> {
                return previousState.copy(articleList = event.articleList, isLoading = false)
            }
            is UIEvent.GetCurrentNews -> {
                newsInteractor.getNews().fold(
                    {
                        processDataEvent(DataEvent.ErrorNewsRequest(it.localizedMessage ?: ""))
                    },
                    {

                    }
                )
            }
            is UIEvent.OnArticleClick -> {

            }
        }
        return null
    }
}