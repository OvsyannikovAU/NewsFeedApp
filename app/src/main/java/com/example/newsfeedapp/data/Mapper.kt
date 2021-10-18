package com.example.newsfeedapp.data

import com.example.newsfeedapp.data.api.model.ApiArticleModel
import com.example.newsfeedapp.data.api.model.ApiSourceModel
import com.example.newsfeedapp.domain.model.NewsDomainModel
import com.example.newsfeedapp.domain.model.NewsDomainSourceModel


fun ApiSourceModel.toDomain(): NewsDomainSourceModel {
    return NewsDomainSourceModel(
        id = id,
        name = name
    )
}

fun ApiArticleModel.toDomain(): NewsDomainModel {
    return NewsDomainModel(
        author = author,
        source = source.toDomain(),
        title = title,
        url = url,
        description = description,
        urlToImage = urlToImage,
        content = content,
        publishedAt = publishedAt
    )
}
