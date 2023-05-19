package com.wooyj.migration_compose.ui.data

import common.Common

data class CategoryData(
    val level: Long,
    val id: Long,
    val text: String,
    val shortWording: String
)


fun common.Common.CurrentCategory.toCategoryData() = CategoryData(
    level = this.level,
    id = this.id,
    text = this.text,
    shortWording = this.shortWording
)