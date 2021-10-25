package com.example.newsfeedapp.domain

import com.example.newsfeedapp.base.attempt
import com.example.newsfeedapp.data.api.NewsRepo
import com.example.newsfeedapp.domain.model.NewsDomainModel

class NewsInteractor(private val newsRepo: NewsRepo) {

    fun getNews() = attempt {
        newsRepo.getNews()
    }
}