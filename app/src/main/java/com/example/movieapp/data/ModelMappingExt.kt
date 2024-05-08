package com.example.movieapp.data

import com.example.movieapp.data.model.MoviePageItem
import com.example.movieapp.data.network.models.NetworkMoviePageItem

fun NetworkMoviePageItem.asEntity() = MoviePageItem(
    id = id ?: 0,
    adult = adult ?: false,
    backdropPath = backdropPath ?: "",
    genreIds = genreIds,
    originalLanguage = originalLanguage ?: "",
    originalTitle = originalTitle ?: "",
    overview = overview ?: "",
    popularity = popularity ?: 0.0,
    posterPath = posterPath ?: "",
    releaseDate = releaseDate ?: "",
    title = title ?: "",
    video = video ?: true,
    voteAverage = voteAverage ?: 0.0,
    voteCount = voteCount ?: 0
)