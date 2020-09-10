package com.workday.android.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "http://api.giphy.com/v1/"

object GiphyService {

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val API = retrofit.create(GiphyAPI::class.java)
}