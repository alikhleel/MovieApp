package com.example.movieapp.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.movieapp.data.model.MoviePageItem
import com.example.movieapp.data.network.models.MovieNetworkDataSource
import com.example.movieapp.data.paging.MoviePagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(
    private val movieNetworkDataSource: MovieNetworkDataSource
) {
    fun getUpcomingMovies(): Flow<PagingData<MoviePageItem>> {
        return Pager(config = PagingConfig(
            pageSize = 20, prefetchDistance = 2
        ), pagingSourceFactory = { MoviePagingSource(movieNetworkDataSource) }).flow
    }

}