package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.feature.component.RankingProductItem
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.expert


@Preview(showBackground = true)
@Composable
fun PreviewAwardWinnerModule() {
    GlowpickTheme {
        AwardWinnerModule()
    }
}


@Composable
fun AwardWinnerModule() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        ImageWithRatio(
            modifier = Modifier.padding(horizontal = 16.dp),
            shape = RoundedCornerShape(12.dp),
            ratio = 361f / 203f,
            background = expert
        ) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .padding(start = 16.dp, bottom = 16.dp),
            ) {
                Column(modifier = Modifier.align(Alignment.TopStart)) {

                }
                Column(
                    modifier = Modifier.align(Alignment.BottomStart)
                ) {
                    Text("립메이크업", style = GlowpickTheme.typography.title2.bold().copy(Color.White))
                    Spacer(modifier = Modifier.padding(top = 8.dp))
                    Text("립틴트/라커", style = GlowpickTheme.typography.title2.bold().copy(Color.White))
                    Spacer(modifier = Modifier.padding(top = 16.dp))
                    Text("#매트/벨벳틴트 위너", style = GlowpickTheme.typography.heading2.copy(Color.White))
                }
            }
        }
        Spacer(modifier = Modifier.padding(top = 16.dp))
        RankingProductItem(
            brandName = "시울",
            productName = "무드 플러쉬 매트 틴트",
            ratingAvg = "4.16",
            reviewCount = "2,345",
            rankingText = "1"
        )
        RankingProductItem(
            brandName = "시울",
            productName = "무드 플러쉬 매트 틴트",
            ratingAvg = "4.16",
            reviewCount = "2,345",
            rankingText = "2"
        )
        RankingProductItem(
            brandName = "시울",
            productName = "무드 플러쉬 매트 틴트",
            ratingAvg = "4.16",
            reviewCount = "2,345",
            rankingText = "3"
        )
    }

}