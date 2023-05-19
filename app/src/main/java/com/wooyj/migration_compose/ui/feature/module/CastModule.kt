package com.wooyj.migration_compose.ui.feature.module

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.wooyj.migration_compose.ui.data.ProductData
import com.wooyj.migration_compose.ui.data.testProductData
import com.wooyj.migration_compose.ui.feature.component.ProductItem
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.feature.component.badge.PromotionBadge
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.secondaryLight


@Preview(showBackground = true)
@Composable
fun PreviewCastModule() {
    GlowpickTheme {
        CastModule(
            1632,
            "https://dn5hzapyfrpio.cloudfront.net/cast-module/a3c/a3c580f0-ea4b-11ed-b80d-e5d9dc29703b.png",
            "다른 문을 열어 따라갈 필요는 없어",
            "That's my Life is 아름다운 갤럭시 Be a writer 장르로는 판타지 내일 내게 열리는 건 big, big 스테이지 So that is who I am",
            true,
            listOf(testProductData)
        )
    }
}

@Composable
fun CastModule(
    idPouch: Long,
    mainImage: String,
    pouchTitle: String,
    description: String,
    isNew: Boolean,
    productList: List<ProductData>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clickable {
                    Log.e("castModule", "idPouch >> $idPouch")
                }
        ) {
            Spacer(modifier = Modifier.padding(top = 16.dp))
            Text(
                pouchTitle,
                style = GlowpickTheme.typography.title2.multiLine().bold(),
                modifier = Modifier.padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.padding(top = 16.dp))

            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                AsyncImage(
                    model = mainImage,
                    contentDescription = "DA Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16 / 9f)
                        .clip(RoundedCornerShape(12.dp))
                )
                if (isNew) {
                    PromotionBadge.Large(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(start = 8.dp, top = 8.dp),
                        text = "NEW",
                        backgroundColor = glowRed,
                        textColor = Color.White
                    )
                }
            }

            Text(
                description,
                style = GlowpickTheme.typography.body1.multiLine(),
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp)
            )

        }


        when (productList.size) {
            0 -> {}
            1 -> {
                ProductItem(
                    productList[0],
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }

            else -> {
                for (i in 0..1) {
                    ProductItem(
                        productList[i],
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }

        SeeMoreButton(
            greyLight06,
            buttonText = "추천제품 더보기",
            secondaryLight,
            modifier = Modifier
                .clickable {
                    Log.e("castModule", "idPouch >> $idPouch")
                }
                .padding(horizontal = 16.dp, vertical = 8.dp)

        )
    }
}