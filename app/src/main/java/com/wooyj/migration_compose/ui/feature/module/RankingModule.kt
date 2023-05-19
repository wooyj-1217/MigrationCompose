package com.wooyj.migration_compose.ui.feature.module

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.data.ProductData
import com.wooyj.migration_compose.ui.data.RankingData
import com.wooyj.migration_compose.ui.data.testRankingData
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.feature.component.ModuleHeader
import com.wooyj.migration_compose.ui.feature.component.badge.PromotionBadge
import com.wooyj.migration_compose.ui.feature.component.badge.RankingBadge
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowGreen
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.glowViolet
import com.wooyj.migration_compose.ui.theme.glowYellow
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.secondaryLight
import com.wooyj.migration_compose.ui.theme.tertiaryLight

@Preview(showBackground = true)
@Composable
fun PreviewRankingModule() {
    GlowpickTheme {
        RankingModule(testRankingData)
    }
}


@Composable
fun RankingModule(data: RankingData) {
    Column {
        if (data.category != null) {
            ModuleHeader(
                "${data.category.shortWording}",
                "#${data.category.text} Top 10"
            ) {
                //ClickEvent
                Log.d(
                    "RankingModule",
                    "category level ${data.category.level} / category id ${data.category.id}"
                )
            }
        } else {
            ModuleHeader("클린뷰티", "#보습크림 Top 10") {}
        }
        Spacer(modifier = Modifier.padding(top = 16.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(data.productList.size) {
                val product = data.productList[it]
                RankingItem(product)
            }
        }
    }
}


@Composable
fun RankingItem(product: ProductData) {
    Column(
        modifier = Modifier
            .width(144.dp)
            .wrapContentHeight()
            .clickable {

            }
    ) {
        Box(
            modifier = Modifier
                .wrapContentWidth()
                .height(156.dp)
        ) {
            Box {
                AsyncImage(
                    model = product.imageUrl,
                    contentDescription = "product Image",
                    modifier = Modifier
                        .width(144.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .aspectRatio(1f / 1f)
                )

                val productRank = product.productRank?.toInt()
                RankingBadge.Medium(
                    text = if (productRank != 0) productRank.toString() else "추천",
                    modifier = Modifier.padding(top = 8.dp, start = 8.dp),
                    backgroundColor = if (productRank == 1) glowRed else {
                        if (productRank != 0) secondaryLight else glowGreen
                    },
                    textColor = Color.White
                )
            }
            if(product.hasEventAdInfo) {
                PromotionBadge.Large(
                    modifier = Modifier.align(Alignment.BottomStart),
                    backgroundColor = glowViolet,
                    text = "이벤트",
                    textColor = Color.White,
                    drawableId = R.drawable.event
                )
            }
        }
        Spacer(modifier = Modifier.padding(top = 4.dp))
        Text(product.brandTitle, style = GlowpickTheme.typography.body1.bold())
        Spacer(modifier = Modifier.padding(top = 4.dp))
        Text(
            product.productTitle,
            style = GlowpickTheme.typography.body1.multiLine(),
            modifier = Modifier.height(46.dp)
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Row(modifier = Modifier.wrapContentSize(), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(R.drawable.star_6), contentDescription = "Star")
            Spacer(modifier = Modifier.padding(start = 6.dp))
            Text(
                product.ratingAvg.toString(),
                style = GlowpickTheme.typography.footnote.copy(secondaryLight),
            )
            Spacer(modifier = Modifier.padding(start = 4.dp))
            Text(
                "· 리뷰 ${product.reviewCount}",
                style = GlowpickTheme.typography.footnote.copy(tertiaryLight)
            )
        }
    }
}