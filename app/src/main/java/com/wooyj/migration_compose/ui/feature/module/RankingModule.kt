package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.feature.component.badge.Badge
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.feature.component.ModuleHeader
import com.wooyj.migration_compose.ui.feature.component.badge.PromotionBadge
import com.wooyj.migration_compose.ui.feature.component.badge.RankingBadge
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowGreen
import com.wooyj.migration_compose.ui.theme.glowViolet
import com.wooyj.migration_compose.ui.theme.glowYellow
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.secondaryLight
import com.wooyj.migration_compose.ui.theme.tertiaryLight

@Preview(showBackground = true)
@Composable
fun PreviewRankingModule() {
    GlowpickTheme {
        RankingModule()
    }
}


@Composable
fun RankingModule() {
    Column {
        ModuleHeader("클린뷰티", "#보습크림 Top 10") {}
        Spacer(modifier = Modifier.padding(top = 16.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(11) {
                RankingItem()
            }
        }
    }
}


@Composable
fun RankingItem() {
    Column(
        modifier = Modifier
            .width(144.dp)
            .wrapContentHeight()
    ) {
        Box(
            modifier = Modifier
                .wrapContentWidth()
                .height(156.dp)
        ) {
            ImageWithRatio(
                modifier = Modifier.width(144.dp),
                shape = RoundedCornerShape(8.dp),
                ratio = 1f / 1f,
                background = glowYellow
            ) {
                RankingBadge.Medium(
                    modifier = Modifier.padding(top = 8.dp, start = 8.dp),
                    backgroundColor = glowGreen,
                    text = "추천",
                    textColor = Color.White
                )
            }
            PromotionBadge.Large(
                modifier = Modifier.align(Alignment.BottomStart),
                backgroundColor = glowViolet,
                text = "이벤트",
                textColor = Color.White,
                drawableId = R.drawable.event
            )
        }
        Spacer(modifier = Modifier.padding(top = 4.dp))
        Text("컬러그램", style = GlowpickTheme.typography.body1.bold())
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            "립 인젝션 파워 플럼핑 립 글로스",
            style = GlowpickTheme.typography.body1.multiLine(),
            modifier = Modifier.height(46.dp)
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Row(modifier = Modifier.wrapContentSize(), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(R.drawable.star_6), contentDescription = "Star")
            Spacer(modifier = Modifier.padding(start = 6.dp))
            Text(
                "4.59",
                style = GlowpickTheme.typography.footnote.copy(secondaryLight),
            )
            Spacer(modifier = Modifier.padding(start = 4.dp))
            Text(
                "· 리뷰 131", style = GlowpickTheme.typography.footnote.copy(tertiaryLight)
            )
        }
    }
}