package com.workday.android.service.model

data class APIResponse(val data: List<ImageData>)

data class ImageData(
    val id: String,
    val url: String,
    val title: String
)