package com.workday.android.service

import com.workday.android.service.model.APIResponse
import retrofit2.http.GET

interface GiphyAPI {

    @GET("gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC")
    suspend fun searchGiphyAPI(searchTerm : String): APIResponse
}