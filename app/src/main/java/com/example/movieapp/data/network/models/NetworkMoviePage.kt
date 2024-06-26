package com.example.movieapp.data.network.models

import com.google.gson.annotations.SerializedName


data class NetworkMoviePage(
    @SerializedName("dates") var dates: NetworkMoviePageDates? = NetworkMoviePageDates(),
    @SerializedName("page") var page: Int? = null,
    @SerializedName("results") var results: ArrayList<NetworkMoviePageItem> = arrayListOf(),
    @SerializedName("total_pages") var totalPages: Int? = null,
    @SerializedName("total_results") var totalResults: Int? = null
)


data class NetworkMoviePageItem(
    @SerializedName("adult") var adult: Boolean? = null,
    @SerializedName("backdrop_path") var backdropPath: String? = null,
    @SerializedName("genre_ids") var genreIds: ArrayList<Int> = arrayListOf(),
    @SerializedName("id") var id: Int? = null,
    @SerializedName("original_language") var originalLanguage: String? = null,
    @SerializedName("original_title") var originalTitle: String? = null,
    @SerializedName("overview") var overview: String? = null,
    @SerializedName("popularity") var popularity: Double? = null,
    @SerializedName("poster_path") var posterPath: String? = null,
    @SerializedName("release_date") var releaseDate: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("video") var video: Boolean? = null,
    @SerializedName("vote_average") var voteAverage: Double? = null,
    @SerializedName("vote_count") var voteCount: Int? = null

)

data class NetworkMoviePageDates(
    @SerializedName("maximum") var maximum: String? = null,
    @SerializedName("minimum") var minimum: String? = null
)