package com.wooyj.migration_compose.data.model

import kotlinx.serialization.Serializable


@Serializable
data class ProtoRes(
    val type: String?,
    val data: String?,
    val error: ErrorRes?
)

@Serializable
data class ErrorRes(
    val code: String,
    val message: String?
)