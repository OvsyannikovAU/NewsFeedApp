package com.example.newsfeedapp.domain.model

data class NewsDomainModel(
    val source: NewsDomainSourceModel,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)