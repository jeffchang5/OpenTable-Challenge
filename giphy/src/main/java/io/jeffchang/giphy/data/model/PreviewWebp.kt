package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class PreviewWebp(

	@Json(name="size")
	val size: String? = null,

	@Json(name="width")
	val width: String? = null,

	@Json(name="url")
	val url: String? = null,

	@Json(name="height")
	val height: String? = null
)