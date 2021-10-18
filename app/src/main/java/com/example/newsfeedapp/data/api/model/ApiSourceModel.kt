package com.example.newsfeedapp.data.api.model

import com.google.gson.annotations.SerializedName

data class ApiSourceModel(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String
)

//-"source": {
//    "id": null,
//    "name": "Cointelegraph"
//},