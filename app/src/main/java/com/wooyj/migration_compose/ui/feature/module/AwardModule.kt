package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.feature.component.ModuleHeader
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.collector
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.secondaryLight


@Composable
@Preview(showBackground = true)
fun PreviewAwardModule() {

    GlowpickTheme {
        AwardModule()
    }

}


@Composable
fun AwardModule() {
    Column {
        ModuleHeader("2023 상반기", "글로우픽 어워드"){}
        Spacer(modifier = Modifier.padding(top = 16.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(2) {
                AwardItemModule()
            }
        }
        Spacer(Modifier.padding(top = 16.dp))
        SeeMoreButton(
            backgroundColor = greyLight06,
            buttonText = "2023 상반기 어워드",
            textColor = secondaryLight,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
        }
    }


}

@Composable
fun AwardItemModule() {
    Column(
        modifier = Modifier
            .width(265.dp)
            .wrapContentHeight()
    ) {
        ImageWithRatio(
            modifier = Modifier,
            RoundedCornerShape(12.dp),
            264f / 350f,
            collector
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(bottom = 16.dp, start = 16.dp)
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        "TREND by GLOWPICK",
                        style = GlowpickTheme.typography.title3.bold().copy(Color.White)
                    )
                    Spacer(modifier = Modifier.padding(top = 16.dp))
                    Row {
                        ImageWithRatio(
                            modifier = Modifier.width(72.dp),
                            RoundedCornerShape(8.dp),
                            72f / 72f,
                            Color.White
                        )
                        Spacer(modifier = Modifier.padding(start = 8.dp))
                        ImageWithRatio(
                            modifier = Modifier.width(72.dp),
                            RoundedCornerShape(8.dp),
                            72f / 72f,
                            Color.White
                        )
                        Spacer(modifier = Modifier.padding(start = 8.dp))
                        ImageWithRatio(
                            modifier = Modifier.width(72.dp),
                            RoundedCornerShape(8.dp),
                            72f / 72f,
                            Color.White
                        )
                    }
                }
            }
        }
    }


}