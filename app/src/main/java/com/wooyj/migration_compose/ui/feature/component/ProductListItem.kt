package com.wooyj.migration_compose.ui.feature.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.feature.component.badge.RankingBadge
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowBlue
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.secondaryLight
import com.wooyj.migration_compose.ui.theme.tertiaryLight


@Preview(showBackground = true)
@Composable
fun PreviewProductListItem() {
    GlowpickTheme {
        Column {
            ProductItem(
                "시울", "무드 플러쉬 매트 틴트", modifier = Modifier
                    .fillMaxWidth()
            )
            ProductItem(
                brandName = "시울",
                productName = "무드 플러쉬 매트 틴트",
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = greyLight06)
            )
            RankingProductItem("시울", "무드 플러쉬 매트 틴트", "4.16", "2,345", "300ml / 45,000원")
        }
    }
}


@Composable
fun ProductItem(brandName: String, productName: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        ImageWithRatio(
            modifier = Modifier.width(64.dp),
            shape = RoundedCornerShape(8.dp),
            ratio = 1f / 1f,
            background = Color.White
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
        ) {
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(brandName, style = GlowpickTheme.typography.body2.bold())
                Text(
                    productName,
                    style = GlowpickTheme.typography.body2,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}


@Composable
fun RankingProductItem(
    brandName: String,
    productName: String,
    ratingAvg: String,
    reviewCount: String,
    mlPrice: String? = null,
    rankingText: String? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = 12.dp, horizontal = 16.dp)
    ) {
        ImageWithRatio(
            modifier = Modifier.width(80.dp),
            shape = RoundedCornerShape(8.dp),
            ratio = 1f / 1f,
            background = Color.White
        ) {
            if (rankingText != null) {
                RankingBadge.Small(
                    modifier = Modifier.padding(start = 4.dp, top = 4.dp),
                    text = rankingText,
                    backgroundColor = if (rankingText == "1") {
                        glowRed
                    } else {
                        secondaryLight
                    },
                    textColor = Color.White
                )
            }
        }

        Spacer(Modifier.padding(start = 16.dp))
        Box(
            modifier = Modifier
                .weight(1f)
                .height(80.dp)
        ) {
            Column(
                modifier = Modifier.align(Alignment.TopStart)
            ) {
                Text(
                    brandName,
                    style = GlowpickTheme.typography.body2.bold(),
                )
                Text(
                    productName,
                    style = GlowpickTheme.typography.body2,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomStart)
            ) {
                Row(
                    modifier = Modifier.align(Alignment.CenterStart),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.star_6),
                        contentDescription = "Red Star"
                    )
                    Spacer(modifier = Modifier.padding(start = 4.dp))
                    Text(ratingAvg, style = GlowpickTheme.typography.footnote.copy(secondaryLight))
                    Spacer(modifier = Modifier.padding(start = 4.dp))
                    Text(
                        "· 리뷰 $reviewCount", style = GlowpickTheme.typography.caption2.copy(
                            tertiaryLight
                        )
                    )
                }
                if (mlPrice != null) {
                    Text(
                        "$mlPrice", style = GlowpickTheme.typography.caption2.copy(
                            secondaryLight
                        ),
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
            }
        }
    }
}