package com.workday.android.service

import com.workday.android.service.model.APIResponse
import retrofit2.http.GET

interface GiphyAPI {

    @GET("gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC")
    suspend fun searchFunnyCats(): APIResponse

    @GET("gifs/trending?api_key=dc6zaTOxFJmzC&limit=15")
    suspend fun getTrendingGiphys(): APIResponse
}