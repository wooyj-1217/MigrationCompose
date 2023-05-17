package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.expert
import com.wooyj.migration_compose.ui.theme.multiLine


@Preview(showBackground = true)
@Composable
fun PreviewRankingCurationModule() {
    GlowpickTheme {
        RankingCurationModule()
    }
}


@Composable
fun RankingCurationModule() {
    Column {
        Text(
            "에디터들이 추천하는 기초템",
            modifier = Modifier.padding(start = 16.dp),
            style = GlowpickTheme.typography.title2.bold()
        )
        Spacer(modifier = Modifier.padding(top = 16.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(3) {
                RankingCurationItem()
            }
        }
    }
}


@Composable
fun RankingCurationItem(){
    ImageWithRatio(
        modifier = Modifier.width(216.dp),
        shape = RoundedCornerShape(12.dp),
        ratio = 1f / 1f,
        background = expert
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomStart)
        ) {
            Text(
                "수분을 충전해줘\n#스킨/토너",
                style = GlowpickTheme.typography.heading2.multiLine().bold()
                    .copy(Color.White)
            )
            Spacer(modifier = Modifier.padding(top = 16.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                ImageWithRatio(
                    modifier = Modifier.width(32.dp),
                    shape = RoundedCornerShape(4.dp),
                    ratio = 1f / 1f,
                    background = Color.White
                )
                Spacer(modifier = Modifier.padding(start = 4.dp))
                ImageWithRatio(
                    modifier = Modifier.width(32.dp),
                    shape = RoundedCornerShape(4.dp),
                    ratio = 1f / 1f,
                    background = Color.White
                )
                Spacer(modifier = Modifier.padding(start = 4.dp))
                ImageWithRatio(
                    modifier = Modifier.width(32.dp),
                    shape = RoundedCornerShape(4.dp),
                    ratio = 1f / 1f,
                    background = Color.White
                )
                Spacer(modifier = Modifier.padding(start = 8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.wrapContentSize()
                ) {
                    Text(
                        "더보기",
                        style = GlowpickTheme.typography.footnote.copy(Color.White)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.chevrons),
                        contentDescription = "더보기",
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }
            }
        }
    }
}