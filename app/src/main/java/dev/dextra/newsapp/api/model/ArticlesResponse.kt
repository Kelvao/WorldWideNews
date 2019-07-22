package dev.dextra.newsapp.api.model


data class ArticlesResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)