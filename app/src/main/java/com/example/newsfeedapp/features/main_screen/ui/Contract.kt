package com.example.newsfeedapp.features.main_screen.ui

import com.example.newsfeedapp.base.Event
import com.example.newsfeedapp.data.api.model.ApiArticleModel
import com.example.newsfeedapp.domain.model.NewsDomainModel

data class ViewState(
    val articleList: List<NewsDomainModel>,
    val isLoading: Boolean,
    val errorMessage: String?,
    val isInErrorState: Boolean
)

sealed class UIEvent() : Event {  //события, которые вызывает сам пользователь
    object GetCurrentNews : UIEvent()
    class OnArticleClick : UIEvent()
}

sealed class DataEvent() : Event {  //события, происходящие не от пользователя
    object OnLoadData : DataEvent()
    data class SuccessNewsRequest(val articleList: List<NewsDomainModel>) : DataEvent()
    data class ErrorNewsRequest(val errorMessage: String) : DataEvent()
}