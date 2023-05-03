package com.wooyj.migration_compose.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.glowRed


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewRankingRecommendModule() {
    GlowpickTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            RankingRecommendModule()
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RankingRecommendModule() {
    HorizontalPager(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .background(color = glowRed),
        pageCount = 4,
    ) { page ->
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = page.toString())
        }
    }
}