package com.wooyj.migration_compose.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wooyj.migration_compose.ui.component.RankingRecommendModule
import com.wooyj.migration_compose.ui.theme.GlowpickTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        RankingRecommendModule()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    GlowpickTheme {
        HomeScreen()
    }
}