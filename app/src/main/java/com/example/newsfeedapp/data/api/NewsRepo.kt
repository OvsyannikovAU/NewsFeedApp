package com.example.newsfeedapp.data.api

import com.example.newsfeedapp.domain.model.NewsDomainModel

interface NewsRepo {
    fun getNews(): List<NewsDomainModel>
}