package com.wooyj.migration_compose.ui.feature.component.badge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.glowGreen
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.glowViolet
import com.wooyj.migration_compose.ui.theme.secondaryLight


@Preview(showBackground = true)
@Composable
fun PreviewBadges() {
    GlowpickTheme {
        Row(
            modifier = Modifier
                .wrapContentSize()
                .padding(10.dp)
        ) {
            Column(modifier = Modifier.wrapContentSize()) {

                RankingBadge.Large(
                    modifier = Modifier.wrapContentSize(),
                    text = "1",
                    backgroundColor = glowRed,
                    textColor = Color.White
                )
                RankingBadge.Large(
                    modifier = Modifier.wrapContentSize(),
                    text = "9,999",
                    backgroundColor = secondaryLight,
                    textColor = Color.White
                )
                RankingBadge.Large(
                    modifier = Modifier.wrapContentSize(),
                    text = "추천",
                    backgroundColor = glowGreen,
                    textColor = Color.White
                )

                Spacer(modifier = Modifier.padding(top = 8.dp))

                RankingBadge.Medium(
                    modifier = Modifier.wrapContentSize(),
                    text = "1",
                    backgroundColor = glowRed,
                    textColor = Color.White
                )
                RankingBadge.Medium(
                    modifier = Modifier.wrapContentSize(),
                    text = "9,999",
                    backgroundColor = secondaryLight,
                    textColor = Color.White
                )
                RankingBadge.Medium(
                    modifier = Modifier.wrapContentSize(),
                    text = "추천",
                    backgroundColor = glowGreen,
                    textColor = Color.White
                )

                Spacer(modifier = Modifier.padding(top = 8.dp))

                RankingBadge.Small(
                    modifier = Modifier.wrapContentSize(),
                    text = "1",
                    backgroundColor = glowRed,
                    textColor = Color.White
                )
                RankingBadge.Small(
                    modifier = Modifier.wrapContentSize(),
                    text = "9,999",
                    backgroundColor = secondaryLight,
                    textColor = Color.White
                )
                RankingBadge.Small(
                    modifier = Modifier.wrapContentSize(),
                    text = "추천",
                    backgroundColor = glowGreen,
                    textColor = Color.White
                )

                Spacer(modifier = Modifier.padding(top = 8.dp))

                RankingBadge.XSmall(
                    modifier = Modifier.wrapContentSize(),
                    text = "1",
                    backgroundColor = glowRed,
                    textColor = Color.White
                )
                RankingBadge.XSmall(
                    modifier = Modifier.wrapContentSize(),
                    text = "9,999",
                    backgroundColor = secondaryLight,
                    textColor = Color.White
                )
                RankingBadge.XSmall(
                    modifier = Modifier.wrapContentSize(),
                    text = "추천",
                    backgroundColor = glowGreen,
                    textColor = Color.White
                )
            }

            Spacer(modifier = Modifier.padding(start = 8.dp))

            Column(modifier = Modifier.wrapContentSize()) {

                PromotionBadge.Large(
                    modifier = Modifier.wrapContentSize(),
                    text = "NEW",
                    backgroundColor = glowRed,
                    textColor = Color.White
                )
                PromotionBadge.Large(
                    modifier = Modifier.wrapContentSize(),
                    text = "이벤트",
                    backgroundColor = glowViolet,
                    textColor = Color.White,
                    drawableId  = R.drawable.event
                )



                Spacer(modifier = Modifier.padding(top = 8.dp))

                PromotionBadge.Small(
                    modifier = Modifier.wrapContentSize(),
                    text = "NEW",
                    backgroundColor = glowRed,
                    textColor = Color.White
                )

                PromotionBadge.Small(
                    modifier = Modifier.wrapContentSize(),
                    text = "이벤트",
                    backgroundColor = glowViolet,
                    textColor = Color.White,
                    drawableId  = R.drawable.event
                )

            }
        }
    }
}

@Composable
fun Badge(
    modifier: Modifier,
    shape: Shape,
    backgroundColor: Color,
    badgeText: String,
    textModifier: Modifier = Modifier,
    textStyle: TextStyle,
    drawableId : Int = 0
) {
    Box(
        modifier = modifier
            .wrapContentSize()
            .clip(shape)
            .background(backgroundColor)
    ) {
        Row(modifier = textModifier, verticalAlignment = Alignment.CenterVertically) {
            if(drawableId != 0){
                Image(
                    painter = painterResource(drawableId),
                    contentDescription = "icon",
                    colorFilter = ColorFilter.tint(textStyle.color),
                    modifier = Modifier.padding(end = 4.dp)
                )
            }
            Text(
                badgeText,
                style = textStyle,
            )
        }
    }
}
