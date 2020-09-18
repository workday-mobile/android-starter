package com.workday.android.service.model

data class APIResponse(val data: List<ImageData>)

data class ImageData(val id: String,
                     val title: String,
                     val images: Images)

data class Images(val original: Original)

data class Original(val url: String)