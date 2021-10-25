package com.example.newsfeedapp.data.api.model

import com.google.gson.annotations.SerializedName

data class ApiResponseObject(
    @SerializedName("status")
    val status: String? = "",
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("source")
    val listArticleModel: List<ApiArticleModel>
)


/*
{
    "status": "ok",
    -"sources": [
    -
    {
        "id": "abc-news",
        "name": "ABC News",
        "description": "Your trusted source for breaking news, analysis, exclusive interviews, headlines, and videos at ABCNews.com.",
        "url": "https://abcnews.go.com",
        "category": "general",
        "language": "en",
        "country": "us"
    },
    -
    {
        "id": "abc-news-au",
        "name": "ABC News (AU)",
        "description": "Australia's most trusted source of local, national and world news. Comprehensive, independent, in-depth analysis, the latest business, sport, weather and more.",
        "url": "http://www.abc.net.au/news",
        "category": "general",
        "language": "en",
        "country": "au"
    },
    ...
    {
        "id": "ynet",
        "name": "Ynet",
        "description": "ynet דף הבית: אתר החדשות המוביל בישראל מבית ידיעות אחרונות. סיקור מלא של חדשות מישראל והעולם, ספורט, כלכלה, תרבות, אוכל, מדע וטבע, כל מה שקורה וכל מה שמעניין ב ynet.",
        "url": "http://www.ynet.co.il",
        "category": "general",
        "language": "he",
        "country": "is"
    }
    ]
}*/
