package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.feature.component.ProductItem
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowGreen
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.secondaryDark


@Preview(showBackground = true)
@Composable
fun PreviewBrandRankingModule() {
    GlowpickTheme {
        BrandRankingModule()
    }
}


@Composable
fun BrandRankingModule() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(3) {
            BrandRankingItem()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBrandRankingItem() {
    GlowpickTheme {
        BrandRankingItem()
    }
}

@Composable
fun BrandRankingItem() {
    Column(modifier = Modifier.width(280.dp)) {
        ImageWithRatio(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            ratio = 280f / 350f,
            background = glowGreen
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(bottom = 16.dp, start = 16.dp)
            ) {
                ImageWithRatio(
                    modifier = Modifier.width(40.dp),
                    shape = RoundedCornerShape(8.dp),
                    ratio = 1f / 1f,
                    background = Color.White
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(
                        "컬러그램",
                        style = GlowpickTheme.typography.heading2.bold().copy(color = Color.White)
                    )
                    Text(
                        "colorgram",
                        style = GlowpickTheme.typography.footnote.copy(color = secondaryDark)
                    )
                }
            }
        }
        Text(
            "이렇게 하늘 위로\nTwinkle",
            modifier = Modifier.padding(vertical = 16.dp),
            style = GlowpickTheme.typography.title3.multiLine().bold()
        )

        ProductItem(
            brandName = "시울",
            productName = "무드 플러쉬 매트 틴트",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(color = greyLight06)
        )
    }
}