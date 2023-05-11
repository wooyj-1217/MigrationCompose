package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.glowRed

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMainBannerModule() {
    GlowpickTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            MainBannerModule()
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainBannerModule() {
    HorizontalPager(
        modifier = Modifier
            .aspectRatio(393f / 295f)
            .background(color = glowRed),
        pageCount = 4,
    ) { page ->
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = page.toString())
        }
    }
}