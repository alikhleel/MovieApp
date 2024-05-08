package com.example.movieapp.data.model


data class MoviePageItem(
    val id: Int,
    val adult: Boolean = false,
    val backdropPath: String = "",
    val genreIds: ArrayList<Int> = arrayListOf(),
    val originalLanguage: String = "",
    val originalTitle: String = "",
    val overview: String = "",
    val popularity: Double = 0.0,
    val posterPath: String = "",
    val releaseDate: String = "",
    val title: String = "",
    val video: Boolean = true,
    val voteAverage: Double = 0.0,
    val voteCount: Int = 0
)