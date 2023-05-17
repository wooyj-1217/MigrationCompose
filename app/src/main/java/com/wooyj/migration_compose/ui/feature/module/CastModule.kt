package com.wooyj.migration_compose.ui.feature.module

import android.util.Log
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
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.wooyj.migration_compose.ui.feature.component.ProductItem
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.feature.component.badge.PromotionBadge
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.secondaryLight
import common.Common


@Preview(showBackground = true)
@Composable
fun PreviewCastModule() {
    GlowpickTheme {

        val product = common.Common.Product.newBuilder()
            .setIdProduct(18487)
            .setProductTitle("온-오프 수분진정팩")
            .setVolume("80g")
            .setPrice(16000)
            .setBrand(common.Common.Brand.newBuilder().setIdBrand(333).setBrandTitle("SNP")).build()


        CastModule(
            common.Common.Pouch.newBuilder()
                .setPouchTitle("'럭셔리 브랜드 엠버서더' 뉴진스")
                .setMainImage("https://dn5hzapyfrpio.cloudfront.net/cast-module/a3c/a3c580f0-ea4b-11ed-b80d-e5d9dc29703b.png")
                .setDescription(
                    "뉴진스 멤버 '하니'가 K-POP 최초로 조르지오 아르마니 뷰티 글로벌 앰버서더로 발탁됐다. " +
                            "유니크한 음색과 매력적인 마스크로 글로벌 팬들의 시선을 사로잡고 있는 뉴진스 하니는 아르마니 뷰티의 대표 제품인 파워 패브릭 플러스 파운데이션의"
                ).setProductList(
                    0, product
                )
                .build()

        )
    }
}

@Composable
fun CastModule(pouch: common.Common.Pouch) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .wrapContentHeight()
    ) {

//        val context = LocalContext.current

        Text(pouch.pouchTitle, style = GlowpickTheme.typography.title2.multiLine().bold())
        Spacer(modifier = Modifier.padding(top = 16.dp))

        Box(modifier = Modifier.wrapContentSize()) {
            AsyncImage(
                model = pouch.mainImage,
                contentDescription = "DA Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(16 / 9f)
                    .clip(RoundedCornerShape(12.dp))
            )
            if (pouch.isNew.getValue()) {
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
            pouch.description,
            style = GlowpickTheme.typography.body1.multiLine(),
            modifier = Modifier.padding(vertical = 16.dp)
        )
        val productList = pouch.productList
        for(product in productList){
            ProductItem(
                brandName = product.brand.brandTitle,
                productName = product.productTitle,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.padding(8.dp))
        SeeMoreButton(greyLight06, buttonText = "추천제품 더보기", secondaryLight) {
//            Toast.makeText(context, "추천제품 더보기", Toast.LENGTH_LONG).show()
        }
    }
}