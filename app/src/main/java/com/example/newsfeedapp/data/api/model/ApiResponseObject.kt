package com.example.newsfeedapp.data.api.model

import com.google.gson.annotations.SerializedName

data class ApiResponseObject(
    @SerializedName("source")
    val listArticleModel: List<ApiArticleModel>
)