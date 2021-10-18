package com.example.newsfeedapp.data.api

import com.example.newsfeedapp.data.toDomain
import com.example.newsfeedapp.domain.model.NewsDomainModel

class NewsRepoImpl(private val newsRemoteSource: NewsRemoteSource) : NewsRepo {
    override fun getNews(): List<NewsDomainModel> {
        return newsRemoteSource.getNews().listArticleModel.map { it.toDomain() }
    }
}