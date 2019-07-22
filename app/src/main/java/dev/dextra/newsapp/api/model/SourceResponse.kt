package dev.dextra.newsapp.api.model

data class SourceResponse(
    val sources: List<Source>,
    val status: String
)