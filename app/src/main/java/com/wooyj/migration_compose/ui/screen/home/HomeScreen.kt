package com.wooyj.migration_compose.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.feature.module.BrandRankingModule
import com.wooyj.migration_compose.ui.feature.module.CastModule
import com.wooyj.migration_compose.ui.feature.module.DAModule
import com.wooyj.migration_compose.ui.feature.module.MainBannerModule
import com.wooyj.migration_compose.ui.theme.GlowpickTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(verticalArrangement = Arrangement.spacedBy(56.dp)) {
            items(4) {
                when (it) {
                    0 -> {
                        MainBannerModule()
                    }
                    1 -> {
                        DAModule()
                    }
                    2 -> {
                        BrandRankingModule()
                    }
                    else -> {
                        CastModule()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    GlowpickTheme {
        HomeScreen()
    }
}