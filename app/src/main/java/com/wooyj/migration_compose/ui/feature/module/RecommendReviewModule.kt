package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.theme.GlowpickTheme


@Composable
@Preview
fun PreviewRecommendReviewModule() {
    GlowpickTheme {

    }
}


@Composable
fun RecommendReviewModule() {

    Column() {
        LazyRow() {
        }
        SeeMoreButton(modifier = Modifier.padding(top = 16.dp), buttonText = "#카테고리 인생템 더 보기") {

        }
    }

}