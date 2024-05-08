package com.example.movieapp.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.movieapp.BuildConfig
import com.example.movieapp.data.asEntity
import com.example.movieapp.data.model.MoviePageItem
import com.example.movieapp.data.network.models.MovieNetworkDataSource
import java.io.IOException


class MoviePagingSource(
    private val movieNetworkDataSource: MovieNetworkDataSource
) : PagingSource<Int, MoviePageItem>() {


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MoviePageItem> {
        return try {
            val currentPage = params.key ?: 1
            val movies = movieNetworkDataSource.getPopularMovies(
                apiKey = BuildConfig.TMDB_API_KEY, page = currentPage,
            )
            LoadResult.Page(
                data = movies.body()?.results.orEmpty().map { it.asEntity() },
                prevKey = if (currentPage == 1) null else currentPage - 1,
                nextKey = if (movies.body()?.results?.isEmpty() == true) null else currentPage + 1
            )
        } catch (e: IOException) {
            return LoadResult.Error(e)
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }


    override fun getRefreshKey(state: PagingState<Int, MoviePageItem>): Int? {
        return state.anchorPosition
    }

}